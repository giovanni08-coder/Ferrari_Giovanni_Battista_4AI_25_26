public class Forza4 {
    public final int x = 6;
    public final int y = 7;
    public String colonna;
    private char[][] griglia= new char[x][y];
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

    public boolean Verifica_vittoria() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y;j++) {
                if (i <= x-4 && griglia[i][j] == simbolo_g1 && griglia[i + 1][j] == simbolo_g1 && griglia[i + 2][j] == simbolo_g1 && griglia[i + 3][j] == simbolo_g1) {
                    return false;
                }
                if (j < y-4 && griglia[i][j] == simbolo_g1 && griglia[i][j + 1] == simbolo_g1 && griglia[i][j + 2] == simbolo_g1 && griglia[i][j + 3] == simbolo_g1) {
                    return false;
                }
            }
        }
        for (int i = 0; i <x; i++) {
            for (int j = 0;j < y ; j++) {
                if (i <= x-4 && griglia[i][j] == simbolo_g2 && griglia[i + 1][j] == simbolo_g2 && griglia[i + 2][j] == simbolo_g2 && griglia[i + 3][j] == simbolo_g2) {
                    return false;
                }
                if (j <= x-4 && griglia[i][j] == simbolo_g2 && griglia[i][j + 1] == simbolo_g2 && griglia[i][j + 2] == simbolo_g2 && griglia[i][j + 3] == simbolo_g2) {
                    return false;
                }
            }
        }
        for (int i = 0; i < x-3; i++) {
            for (int j = 0; j < y - 3; j++) {
                if (griglia[i][j] == simbolo_g1 && griglia[i + 1][j + 1] == simbolo_g1 && griglia[i + 2][j + 2] == simbolo_g1 && griglia[i + 3][j + 3] == simbolo_g1) {
                    return false;
                }
            }
        }
        for (int i = 0; i < x-3; i++) {
            for (int j = 0; j < y-3; j++) {
                if (griglia[i][j] == simbolo_g2 && griglia[i + 1][j + 1] == simbolo_g2 && griglia[i + 2][j + 2] == simbolo_g2 && griglia[i + 3][j + 3] == simbolo_g2) {
                    return false;
                }

            }
        }

        return true;
    }
    public String Chi_vince() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y;j++) {
                if (i <= x-4 && griglia[i][j] == simbolo_g1 && griglia[i + 1][j] == simbolo_g1 && griglia[i + 2][j] == simbolo_g1 && griglia[i + 3][j] == simbolo_g1) {
                    return "ha vinto il giocatore 1";
                }
                if (j < y-4 && griglia[i][j] == simbolo_g1 && griglia[i][j + 1] == simbolo_g1 && griglia[i][j + 2] == simbolo_g1 && griglia[i][j + 3] == simbolo_g1) {
                    return "ha vinto il giocatore 1";
                }
            }
        }
        for (int i = 0; i <x; i++) {
            for (int j = 0;j < y ; j++) {
                if (i <= x-4 && griglia[i][j] == simbolo_g2 && griglia[i + 1][j] == simbolo_g2 && griglia[i + 2][j] == simbolo_g2 && griglia[i + 3][j] == simbolo_g2) {
                    return "ha vinto il giocatore 2";
                }
                if (j <= x-4 && griglia[i][j] == simbolo_g2 && griglia[i][j + 1] == simbolo_g2 && griglia[i][j + 2] == simbolo_g2 && griglia[i][j + 3] == simbolo_g2) {
                    return "ha vinto il giocatore 2";
                }
            }
        }
        for (int i = 0; i < x-3; i++) {
            for (int j = 0; j < y - 3; j++) {
                if (griglia[i][j] == simbolo_g1 && griglia[i + 1][j + 1] == simbolo_g1 && griglia[i + 2][j + 2] == simbolo_g1 && griglia[i + 3][j + 3] == simbolo_g1) {
                    return "ha vinto il giocatore 1";
                }
            }
        }
        for (int i = 0; i < x-3; i++) {
            for (int j = 0; j < y-3; j++) {
                if (griglia[i][j] == simbolo_g2 && griglia[i + 1][j + 1] == simbolo_g2 && griglia[i + 2][j + 2] == simbolo_g2 && griglia[i + 3][j + 3] == simbolo_g2) {
                    return "ha vinto il giocatore 2";
                }

            }
        }

        return "non ha vinto nessuno";
    }

    public void Inserisci(int colonna){
        colonna-=1;
        if(colonna<0 || colonna>6){
            throw new IllegalArgumentException("ma che cacchio di colonna hai chiesto???");
        }
        if(griglia[0][colonna] != ' '){
            throw new IllegalArgumentException("ueeee.... ma non hai visto che la colonna è piena!!!");
        }

        int fondo = 5;
        while(griglia[fondo][colonna] != ' '){
            fondo--;
        }
        griglia[fondo][colonna] = simbolo_gioc_corrente;

        if(Verifica_vittoria() == true) {
            if (simbolo_gioc_corrente == simbolo_g1) simbolo_gioc_corrente = simbolo_g2;
            else simbolo_gioc_corrente = simbolo_g1;
        }
    }
}





