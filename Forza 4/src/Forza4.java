public class Forza4 {
    public final int x = 6;
    public final int y = 7;
    public String colonna;
    private char[][] griglia;
    private String grill;
    private char simbolo_g1='O';
    private char simbolo_g2='X';
    private char simbolo_gioc_corrente;
    public Forza4() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                griglia[i][j]=' ';
            }
        }
        simbolo_gioc_corrente = simbolo_g1;
    }
    public void Set_griglia() {
        grill="";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                grill += griglia[i][j];
                if (j!=6) {
                    this.grill += "  |";
                }
            }
            grill += "\n";
            grill += "---|---|---|---|---|---|---";
            grill += "\n";
        }
    }
    public String Get_griglia(){
        return grill;
    }



    public void Set_verifica_string(String s1){
        if (s1=="" || !s1.matches("[1-7]")){
            throw new IllegalArgumentException("non puoi inserire il seguente valore ");
        }
    }

    public String Get_colonna(){
        return colonna;
    }

    public boolean Verifica_vittoria(){
        return false;
    }

    public void Inserisci(int colonna){
        colonna-=1;
        if(colonna<0 || colonna>6){
            throw new IllegalArgumentException("ma che caccio di colonna hai chiesto???");
        }
        if(griglia[0][colonna] != ' '){
            throw new IllegalArgumentException("ueeee.... ma non hai visto che la colonna è piena!!!");
        }

        int fondo = 5;
        while(griglia[fondo][colonna] != ' '){
            fondo--;
        }
        griglia[fondo][colonna] = simbolo_gioc_corrente;

        if(Verifica_vittoria() == false) {
            if (simbolo_gioc_corrente == simbolo_g1) simbolo_gioc_corrente = simbolo_g2;
            else simbolo_gioc_corrente = simbolo_g1;
        }
    }
}





