import javax.print.DocFlavor;
public class Griglia {

        private char[][] matrice;
        private final int N_CASELLE = 3;
        private  final char CASELLA_VUOTA = ' ';
        public  final char SIMBOLO_O = 'O';
        public  final char SIMBOLO_X = 'X';
        private String grill = "";

        public Griglia() {
            matrice=new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrice[i][j]=' ';
                }
            }
        }

        public void resetGriglia() {
            for (int i = 0; i < N_CASELLE; i++) {
                for (int j = 0; j < N_CASELLE; j++) {
                    matrice[i][j] = CASELLA_VUOTA;
                }
            }
        }

    public void cambia_griglia() {
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

        public void inserisciSimbolo(char simbolo, int r, int c) {
            r = r - 1;
            c = c - 1;

            if (simbolo != SIMBOLO_X && simbolo != SIMBOLO_O)
                throw new IllegalArgumentException("Simbolo non valido");
            if (r < 0 || r > N_CASELLE-1)
                throw new IllegalArgumentException("Riga fuori dal range");
            if (c < 0 || c > N_CASELLE-1)
                throw new IllegalArgumentException("Colonna fuori dal range");
            if (matrice[c][r] != CASELLA_VUOTA)
                throw new IllegalArgumentException("Casella gia occupata");
            matrice[c][r] = simbolo;
        }

        public char controllaVincita() {
            if ((matrice[0][0] == 'X' && matrice[0][1] == 'X' && matrice[0][2] == 'X') ||
                    (matrice[1][0] == 'X' && matrice[1][1] == 'X' && matrice[1][2] == 'X') ||
                    (matrice[2][0] == 'X' && matrice[2][1] == 'X' && matrice[2][2] == 'X') ||
                    (matrice[0][0] == 'X' && matrice[1][0] == 'X' && matrice[2][0] == 'X') ||
                    (matrice[0][1] == 'X' && matrice[1][1] == 'X' && matrice[2][1] == 'X') ||
                    (matrice[0][2] == 'X' && matrice[1][2] == 'X' && matrice[2][2] == 'X') ||
                    (matrice[0][0] == 'X' && matrice[1][1] == 'X' && matrice[2][2] == 'X') ||
                    (matrice[2][0] == 'X' && matrice[1][1] == 'X' && matrice[0][2] == 'X')) {
                return 'X';
            } else if ((matrice[0][0] == 'O' && matrice[0][1] == 'O' && matrice[0][2] == 'O') ||
                    (matrice[1][0] == 'O' && matrice[1][1] == 'O' && matrice[1][2] == 'O') ||
                    (matrice[2][0] == 'O' && matrice[2][1] == 'O' && matrice[2][2] == 'O') ||
                    (matrice[0][0] == 'O' && matrice[1][0] == 'O' && matrice[2][0] == 'O') ||
                    (matrice[0][1] == 'O' && matrice[1][1] == 'O' && matrice[2][1] == 'O') ||
                    (matrice[0][2] == 'O' && matrice[1][2] == 'O' && matrice[2][2] == 'O') ||
                    (matrice[0][0] == 'O' && matrice[1][1] == 'O' && matrice[2][2] == 'O') ||
                    (matrice[2][0] == 'O' && matrice[1][1] == 'O' && matrice[0][2] == 'O')) {
                return 'O';
            } else {
                return 'N';
            }
        }

        public boolean stallo(){
            for (int r = 0; r < N_CASELLE; r++) {
                for (int c = 0; c < N_CASELLE; c++) {
                    if (matrice[c][r] == CASELLA_VUOTA) return false;
                }
            }
            return true;
        }

}
