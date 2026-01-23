public class Pedina {

    public enum Colore {
        BIANCO,
        NERO
    }

    public enum Tipo{
        DAMA,
        DAMONE
    }

    private Colore colore;
    private Tipo tipo;
    private int riga;
    private int colonna;
    //direzione BIANCO muove verso l'alto
    //direzione NERO muove verso il basso
    // 1,1 in basso a sinistra

    Pedina(int r, int c, Colore co) throws DamaException{
        colore = co;
        tipo = Tipo.DAMA;
        muovi(r, c);
    }

    Pedina(Pedina altra){
        riga = altra.riga;
        colonna = altra.colonna;
        colore = altra.colore;
        tipo = altra.tipo;
    }

    public Colore getColore() {
        return colore;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void promuovi() throws DamaException{
        if (colore == Colore.BIANCO && riga != 8) {
            throw new DamaException("La dama non può essere promossa");
        }
        if (colore == Colore.NERO && riga != 1) {
            throw new DamaException("La dama non può essere promossa");
        }
        tipo = Tipo.DAMONE;
    }

    public void muovi(int nuovaRiga, int nuovaColonna) throws DamaException {
        if (nuovaRiga < 1 || nuovaRiga> 8){
            throw new DamaException("Posizione non valida");
        }
        if (nuovaColonna < 1 || nuovaColonna> 8){
            throw new DamaException("Posizione non valida");
        }
        //non sono al primo movimento..
        if (riga !=0 && colonna!=0){

            if (tipo == Tipo.DAMONE){
                // controlli a croce
                if((nuovaRiga!= (riga -1) || nuovaRiga!= (riga -1)) && ((nuovaColonna!= colonna+1) || nuovaColonna!=colonna-1)){
                    throw new DamaException("Posizione non valida");
                }
            }
            else {
                //DAMA
                if (colore == Colore.BIANCO) {
                    //controlli per il bianco
                    if(nuovaRiga!= (riga +1) && ((nuovaColonna!= colonna+1) || nuovaColonna!=colonna-1)){
                        throw new DamaException("Posizione non valida");
                    }
                    promuovi();
                    //nuovaRiga != (riga + 1);
                    //(nuovaColonna != colonna +1) && (nuovaColonna != colonna -1)
                }
                else{
                    //controlli per il nero
                    if(nuovaRiga!= (riga -1) && ((nuovaColonna!= colonna+1) || nuovaColonna!=colonna-1)){
                        throw new DamaException("Posizione non valida");
                    }
                    promuovi();
                }
            }
        }
        riga = nuovaRiga;
        colonna = nuovaColonna;
    }
}
