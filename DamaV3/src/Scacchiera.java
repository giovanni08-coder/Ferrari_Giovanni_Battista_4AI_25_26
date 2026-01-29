public class Scacchiera {

    public final static int N_CASELLE = 8;

    private Pedina[][] scacchiera;

    /*public Scacchiera() throws DamaException {
        scacchiera = new Pedina[N_CASELLE][N_CASELLE];
        //creo le pedine bianche (righe dalla 1 alla 3)
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < N_CASELLE; c++){
                if (((r+1)+(c+1))%2 != 0)
                    scacchiera[r][c] = new Pedina(N_CASELLE-r, c+1, Pedina.Colore.NERO);
            }
        }
        //creo le pedine nere (righe dalla 1 alla 3)
        for (int r = 5; r < N_CASELLE; r++){
            for (int c = 0; c < N_CASELLE; c++){
                if (((r+1)+(c+1))%2 != 0)
                    scacchiera[r][c] = new Pedina(N_CASELLE-r, c+1, Pedina.Colore.BIANCO);
            }
        }
    }*/

    public Scacchiera() throws DamaException {
        scacchiera = new Pedina[N_CASELLE][N_CASELLE];
        scacchiera[4][4] = new Pedina(4,4, Pedina.Colore.BIANCO);
        scacchiera[3][3] = new Pedina(5,5, Pedina.Colore.NERO);
    }

    public Scacchiera(Scacchiera altra) {
        scacchiera = new Pedina[N_CASELLE][N_CASELLE];
        for (int r = 0; r < N_CASELLE; r++) {
            for (int c = 0; c < N_CASELLE; c++) {
                //scacchiera[r][c] = altra.scacchiera[r][c];
                //caselle vuote (null)
                if (altra.scacchiera[r][c] == null){
                    scacchiera[r][c] = altra.scacchiera[r][c];
                }
                //caselle occupate da pedine --> uso il costruttore di copia
                else{
                    scacchiera[r][c] = new Pedina(altra.scacchiera[r][c]);
                }
            }
        }
    }

    public Pedina[][] getScacchiera() {
        return new Scacchiera(this).scacchiera;
    }

    public int conta(Pedina.Colore colore){
        int conta = 0;
        for (int r = 0; r < N_CASELLE; r++) {
            for (int c = 0; c < N_CASELLE; c++) {
                if(scacchiera[r][c] != null && scacchiera[r][c].getColore() == colore){
                    conta+=1;
                }
            }
        }
        return conta;
    }

    public void muovi(Pedina p, int nuovaRiga, int nuovaColonna) throws DamaException{
        if (nuovaRiga < 1 || nuovaRiga> 8){
            throw new DamaException("Posizione non valida");
        }
        if (nuovaColonna < 1 || nuovaColonna> 8){
            throw new DamaException("Posizione non valida");
        }
        if (p == null){
            throw new DamaException("Non hai selezionato alcuna pedina");
        }
        if (scacchiera[N_CASELLE-nuovaRiga][nuovaColonna-1] != null){
            throw new DamaException("Casella occupata da un'altra pedina");
        }
        //mangiata
        boolean tentativoMangiata = false;
        if (p.getTipo() == Pedina.Tipo.DAMONE){
            if (Math.abs(nuovaRiga-p.getRiga())==2 && (nuovaColonna- p.getColonna() == 2 || nuovaColonna-p.getColonna() ==-2)){
                tentativoMangiata = true;
            }
        }
        else {
            //DAMA
            if (p.getColore() == Pedina.Colore.BIANCO) {
                if (nuovaRiga-p.getRiga()==2 && (nuovaColonna-p.getColonna() == 2 || nuovaColonna-p.getColonna() ==-2)){
                    tentativoMangiata = true;
                }
            }
            else{
                if (nuovaRiga-p.getRiga()==-2 && (nuovaColonna-p.getColonna() == 2 || nuovaColonna-p.getColonna() ==-2)){
                    tentativoMangiata = true;
                }
            }
        }

        if (tentativoMangiata){
            System.out.println("Provo a mangiare");
            int rigaDaGuardare = 0;
            int colonnaDaGuardare = 0;
            if (nuovaRiga-p.getRiga()>0) rigaDaGuardare = N_CASELLE - (nuovaRiga-p.getRiga());
            if (nuovaRiga-p.getRiga()<0) rigaDaGuardare = N_CASELLE + (nuovaRiga-p.getRiga());
            if (nuovaColonna-p.getColonna()>0) colonnaDaGuardare = nuovaColonna-1;
            if (nuovaColonna-p.getColonna()>0) colonnaDaGuardare = nuovaColonna+1;
            if (scacchiera[rigaDaGuardare][colonnaDaGuardare] == null || scacchiera[rigaDaGuardare][colonnaDaGuardare].getColore() == p.getColore()) {
                new DamaException("Non puoi mangiare");
            }
            p.muovi(nuovaRiga, nuovaColonna, true);
            scacchiera[rigaDaGuardare][colonnaDaGuardare] = null;
        }
        else{
            p.muovi(nuovaRiga, nuovaColonna, false);
        }

        //provo a promuovere (cacca-pupù)
        try{
            p.promuovi();
        }
        catch (Exception e){}
    }

}

