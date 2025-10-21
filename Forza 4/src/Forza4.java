public class Forza4 {
    public final int x = 6;
    public final int y = 7;
    public int riga;
    public String colonna;
    private char[][] griglia;
    private String grill;
    public Forza4(char[][] matrice) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < y; j++) {
                matrice[i][j]=' ';
            }
        }
        griglia=matrice;
    }
    public void Set_griglia(char[][] matrice,String grill) {
        this.grill=grill;
        griglia=matrice;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.grill += griglia[i][j];
                if (j!=6) {
                    this.grill += "  |";
                }
            }
            this.grill += "\n";
            this.grill += "---|---|---|---|---|---|---";
            this.grill += "\n";
        }
    }
    public String Get_griglia(){
        return grill;
    }
    public void Set_verifica_string(String s1){
        if (s1=="" || !s1.matches("[1-7]")){
            throw new IllegalArgumentException("non puoi inserire il seguente valore ");
        }
        colonna=s1;
    }
    public String Get_colonna(){
        return colonna;
    }
    public void Set_inserisci(int colonna){
        if (riga>x){
            throw new IllegalArgumentException("non puoi inserire gettoni in questa colonna perchè è piena");
        }
        
    }




}
