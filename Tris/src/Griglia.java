public class Griglia {
    public final int x = 3;
    public final int y = 3;
    public int riga;
    public int colonna;
    private String grill = "";
    boolean errore;
    private String name;

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

    public void Set_riga(int riga, boolean errore) {
        this.errore=errore;
        try {
            if (riga >= x) {
                throw new IllegalArgumentException("non puoi inserire il simbolo in questa riga");
            }
            this.riga = riga;
            this.errore=false;
        } catch (IllegalArgumentException e) {
            this.errore=true;
        }
    }
    public int Get_riga() {
        return riga;
    }

    public void Set_colonna(int colonna,boolean errore) {
        this.errore=errore;
            try {
                if (colonna >= y) {
                    throw new IllegalArgumentException("non puoi inserire il simbolo in questa riga");
                }
                this.colonna = colonna;
                this.errore=false;
            } catch (IllegalArgumentException e) {
                this.errore=true;
            }
    }

    public int Get_colonna() {
        return colonna;
    }
    public void Verifica_stringa(String s1,boolean errore){
        this.errore=errore;
        try {
            if (s1.isEmpty() || s1.matches("[a-zA-Z]*$")) {
                throw new IllegalArgumentException("non puoi inserire il simbolo in questa riga");
            }
            name=s1;
            this.errore=false;
        } catch (IllegalArgumentException e) {
            this.errore=true;
        }
    }
    public String Get_stringa(){
        return name;
    }


    public void Set_simboli_input1(char[][] matrice, boolean errore) {
        this.errore=errore;
        try {
            if (matrice[Get_riga()][Get_colonna()] == 'X' || matrice[Get_riga()][Get_colonna()] == 'O') {
                throw new IllegalArgumentException("non puoi sostituire un simbolo");
            }
            matrice[Get_riga()][Get_colonna()] = 'X';
            Set_griglia(matrice);
            this.errore=false;
        } catch (IllegalArgumentException e) {
            this.errore=true;
        }
    }

    public void Set_simboli_input2(char[][] matrice,boolean errore) {
        this.errore=errore;
        try {
            if (matrice[Get_riga()][Get_colonna()] == 'X' || matrice[Get_riga()][Get_colonna()] == 'O') {
                throw new IllegalArgumentException("non puoi sostituire un simbolo");
            }
            matrice[Get_riga()][Get_colonna()] = 'O';
            Set_griglia(matrice);
            this.errore=false;
        } catch (IllegalArgumentException e) {
            this.errore=true;
        }
    }
    public boolean Verfica_riga(){
        return errore;
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
        } else if ((matrice[0][0] == 'O' && matrice[0][1] == 'O' && matrice[0][2] == 'O') ||
                (matrice[1][0] == 'O' && matrice[1][1] == 'O' && matrice[1][2] == 'O') ||
                (matrice[2][0] == 'O' && matrice[2][1] == 'O' && matrice[2][2] == 'O') ||
                (matrice[0][0] == 'O' && matrice[1][0] == 'O' && matrice[2][0] == 'O') ||
                (matrice[0][1] == 'O' && matrice[1][1] == 'O' && matrice[2][1] == 'O') ||
                (matrice[0][2] == 'O' && matrice[1][2] == 'O' && matrice[2][2] == 'O') ||
                (matrice[0][0] == 'O' && matrice[1][1] == 'O' && matrice[2][2] == 'O') ||
                (matrice[2][0] == 'O' && matrice[1][1] == 'O' && matrice[0][2] == 'O')) {
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
        } else if ((matrice[0][0] == 'O' && matrice[0][1] == 'O' && matrice[0][2] == 'O') ||
                (matrice[1][0] == 'O' && matrice[1][1] == 'O' && matrice[1][2] == 'O') ||
                (matrice[2][0] == 'O' && matrice[2][1] == 'O' && matrice[2][2] == 'O') ||
                (matrice[0][0] == 'O' && matrice[1][0] == 'O' && matrice[2][0] == 'O') ||
                (matrice[0][1] == 'O' && matrice[1][1] == 'O' && matrice[2][1] == 'O') ||
                (matrice[0][2] == 'O' && matrice[1][2] == 'O' && matrice[2][2] == 'O') ||
                (matrice[0][0] == 'O' && matrice[1][1] == 'O' && matrice[2][2] == 'O') ||
                (matrice[2][0] == 'O' && matrice[1][1] == 'O' && matrice[0][2] == 'O')) {
            return true;
        }
        return false;
    }
}

