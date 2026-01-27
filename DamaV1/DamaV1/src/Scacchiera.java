public class Scacchiera {
    private Pedina[][] scacchiera;
    public final int N_CASELLE = 8;

    public Scacchiera() throws DamaException {
        scacchiera =  new Pedina[N_CASELLE][N_CASELLE];
        for (int r=0; r<3; r++){
            for (int c =0;c<N_CASELLE;c++){
                if (((r+1) + (c+1))%2 != 0){
                    scacchiera[r][c] = new Pedina(r+1,c+1, Pedina.Colore.BIANCO);
                }
            }
        }
        for (int r=0; r<3; r++){
            for (int c =0;c<N_CASELLE;c++){
                if (((r+1) + (c+1))%2 != 0){
                    scacchiera[r][c] = new Pedina(r+1,c+1, Pedina.Colore.NERO);
                }
            }
        }
    }

    public Pedina[][] getScacchiera(){
        Pedina[][] copiascacchiera= scacchiera;
        return copiascacchiera;
    }
}
