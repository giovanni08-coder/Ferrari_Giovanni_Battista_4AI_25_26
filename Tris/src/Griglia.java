public class Griglia {
    public final int x = 5;
    public final int y = 3;
    public int riga;
    public int colonna;
    private String grill = "";
    private static char[][] xy;

    public Griglia(char[][] matrice) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrice[i][j]=' ';
            }
        }
    }

    public void Set_griglia(char[][] matrice) {
        grill = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grill += matrice[i][j];
                if (j != 2) {
                    grill += "  |";
                }
            }
            grill += "\n";
            grill += "---|---|---";
            grill += "\n";
        }
    }
    public String Get_griglia() {
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

    public String Get_simboli_input1(char[][] matrice) {
        if (matrice[Get_riga()][Get_colonna()] == 'X' || matrice[Get_riga()][Get_colonna()] == '0') {
            throw new IllegalArgumentException("non puoi sostituire un simbolo");
        }
        matrice[Get_riga()][Get_colonna()] = 'X';
        Set_griglia(matrice);
        return Get_griglia();

    }

    public String Get_simboli_input2(char[][] matrice) {
        if (matrice[Get_riga()][Get_colonna()] == 'X' || matrice[Get_riga()][Get_colonna()] == '0') {
            throw new IllegalArgumentException("non puoi sostituire un simbolo");
        }
        matrice[Get_riga()][Get_colonna()] = '0';
        Set_griglia(matrice);
        return Get_griglia();
    }

    public boolean MatricePiena(char[][] matrice) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrice[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public String Vittoria(char[][] matrice) {
        if ((matrice[0][0] == 'X' && matrice[0][1] == 'X' && matrice[0][2] == 'X') ||
                (matrice[1][0] == 'X' && matrice[1][1] == 'X' && matrice[1][2] == 'X') ||
                (matrice[2][0] == 'X' && matrice[2][1] == 'X' && matrice[2][2] == 'X') ||
                (matrice[0][0] == 'X' && matrice[1][0] == 'X' && matrice[2][0] == 'X') ||
                (matrice[0][1] == 'X' && matrice[1][1] == 'X' && matrice[2][1] == 'X') ||
                (matrice[0][2] == 'X' && matrice[1][2] == 'X' && matrice[2][2] == 'X') ||
                (matrice[0][0] == 'X' && matrice[1][1] == 'X' && matrice[2][2] == 'X') ||
                (matrice[2][0] == 'X' && matrice[1][1] == 'X' && matrice[0][2] == 'X')) {
            return "Ha vinto il giocatore 1";
        } else if ((matrice[0][0] == '0' && matrice[0][1] == '0' && matrice[0][2] == '0') ||
                (matrice[1][0] == '0' && matrice[1][1] == '0' && matrice[1][2] == '0') ||
                (matrice[2][0] == '0' && matrice[2][1] == '0' && matrice[2][2] == '0') ||
                (matrice[0][0] == '0' && matrice[1][0] == '0' && matrice[2][0] == '0') ||
                (matrice[0][1] == '0' && matrice[1][1] == '0' && matrice[2][1] == '0') ||
                (matrice[0][2] == '0' && matrice[1][2] == '0' && matrice[2][2] == '0') ||
                (matrice[0][0] == '0' && matrice[1][1] == '0' && matrice[2][2] == '0') ||
                (matrice[2][0] == '0' && matrice[1][1] == '0' && matrice[0][2] == '0')) {
            return "Ha vinto il giocatore 2";
        } else {
            return "Non ha vinto nessuno";
        }
    }

    public boolean Vittoria_condizione(char[][] matrice) {
        if ((matrice[0][0] == 'X' && matrice[0][1] == 'X' && matrice[0][2] == 'X') ||
                (matrice[1][0] == 'X' && matrice[1][1] == 'X' && matrice[1][2] == 'X') ||
                (matrice[2][0] == 'X' && matrice[2][1] == 'X' && matrice[2][2] == 'X') ||
                (matrice[0][0] == 'X' && matrice[1][0] == 'X' && matrice[2][0] == 'X') ||
                (matrice[0][1] == 'X' && matrice[1][1] == 'X' && matrice[2][1] == 'X') ||
                (matrice[0][2] == 'X' && matrice[1][2] == 'X' && matrice[2][2] == 'X') ||
                (matrice[0][0] == 'X' && matrice[1][1] == 'X' && matrice[2][2] == 'X') ||
                (matrice[2][0] == 'X' && matrice[1][1] == 'X' && matrice[0][2] == 'X')) {
            return true;
        } else if ((matrice[0][0] == '0' && matrice[0][1] == '0' && matrice[0][2] == '0') ||
                (matrice[1][0] == '0' && matrice[1][1] == '0' && matrice[1][2] == '0') ||
                (matrice[2][0] == '0' && matrice[2][1] == '0' && matrice[2][2] == '0') ||
                (matrice[0][0] == '0' && matrice[1][0] == '0' && matrice[2][0] == '0') ||
                (matrice[0][1] == '0' && matrice[1][1] == '0' && matrice[2][1] == '0') ||
                (matrice[0][2] == '0' && matrice[1][2] == '0' && matrice[2][2] == '0') ||
                (matrice[0][0] == '0' && matrice[1][1] == '0' && matrice[2][2] == '0') ||
                (matrice[2][0] == '0' && matrice[1][1] == '0' && matrice[0][2] == '0')) {
            return true;
        }
        return false;
    }
}

