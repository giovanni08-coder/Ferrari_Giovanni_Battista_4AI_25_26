public class Griglia {
    public final int x = 5;
    public final int y = 3;
    public int riga;
    public int colonna;
    private String grill = "";
    private static char[][] xy;

    public Griglia() {
        xy = new char[3][3];
    }

    public String Get_griglia() {
        grill = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grill += xy[i][j];
                if (j != 2) {
                    grill += "  |";
                }
            }
            grill += "\n";
            grill += "---|---|---";
            grill += "\n";
        }
        return grill;
    }

    public void Set_riga(int riga) {
        if (riga >= x) {
            throw new IllegalArgumentException("non puoi inserire il simbolo in questa riga");
        }
        this.riga = riga;
    }

    public int Get_riga() {
        return riga;
    }

    public void Set_colonna(int colonna) {
        if (colonna >= y) {
            throw new IllegalArgumentException("non puoi inserire il simbolo in questa riga");
        }
        this.colonna = colonna;
    }

    public int Get_colonna() {
        return colonna;
    }

    public String Get_simboli_input1() {
        if (xy[Get_riga()][Get_colonna()] == 'X' || xy[Get_riga()][Get_colonna()] == '0') {
            throw new IllegalArgumentException("non puoi sostituire un simbolo");
        }
        xy[Get_riga()][Get_colonna()] = 'X';
        return Get_griglia();

    }

    public String Get_simboli_input2() {
        if (xy[Get_riga()][Get_colonna()] == 'X' || xy[Get_riga()][Get_colonna()] == '0') {
            throw new IllegalArgumentException("non puoi sostituire un simbolo");
        }
        xy[Get_riga()][Get_colonna()] = '0';
        return Get_griglia();
    }
    public class Pair<A, B> {
        public A first;
        public B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }
    public Pair<String,Boolean> Vittoria(Boolean errore){
        if ((xy[0][0] == 'X' && xy[0][1] == 'X' && xy[0][2] == 'X')||(xy[1][0] == 'X' && xy[1][1] == 'X' && xy[1][2] == 'X')||(xy[2][0] == 'X' && xy[2][1] == 'X' && xy[2][2] == 'X')||(xy[0][1] == 'X' && xy[1][1] == 'X' && xy[2][1] == 'X')||(xy[0][2] == 'X' && xy[1][2] == 'X' && xy[2][2] == 'X')||(xy[0][0] == 'X' && xy[1][0] == 'X' && xy[2][0] == 'X')||(xy[0][0] == 'X' && xy[1][1] == 'X' && xy[2][2] == 'X')||(xy[2][0] == 'X' && xy[1][1] == 'X' && xy[0][2] == 'X')){
            errore=false;
            return new Pair<>("Ha vinto il giocatore 1",errore);
        }
        if((xy[0][0] == '0' && xy[0][1] == '0' && xy[0][2] == '0')||(xy[1][0] == '0' && xy[1][1] == '0' && xy[1][2] == '0')||(xy[2][0] == '0' && xy[2][1] == '0' && xy[2][2] == '0')||(xy[0][1] == '0' && xy[1][1] == '0' && xy[2][1] == '0')||(xy[0][2] == '0' && xy[1][2] == '0' && xy[2][2] == '0')||(xy[0][0] == '0' && xy[1][0] == '0' && xy[2][0] == '0')||(xy[0][0] == '0' && xy[1][1] == '0' && xy[2][2] == '0')||(xy[2][0] == '0' && xy[1][1] == '0' && xy[0][2] == '0')){
            errore=false;
            return new Pair<>("Ha vinto il giocatore 2",errore);
        }
        errore=false;
        return new Pair<>("non ha vinto nessuno",errore);
    }
}

