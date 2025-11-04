public class Othello {
    private char[][] matrice= new char[9][9];
    private String griglia;
    private char g1_simbolo;
    private char g2_simbolo;
    private char simbolo_corrente;
    public Othello(){
        g1_simbolo = 'X';
        g2_simbolo = 'O';
        simbolo_corrente=g1_simbolo;
        griglia="";
        Inizializza_griglia();

    }
    private void Inizializza_griglia(){
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                matrice[r][c]= ' ';
                matrice[3][3] = g1_simbolo;
                matrice[3][4] = g2_simbolo;
                matrice[4][3] = g1_simbolo;
                matrice[4][4] = g2_simbolo;
                griglia += matrice[r][c];
                if (c!=7) {
                    this.griglia += "  |";
                }
            }
            griglia += "\n";
            griglia += "---|---|---|---|---|---|---|---";
            griglia += "\n";
        }

    }
    public String Stampa_griglia(){
        return griglia;
    }
    private boolean isoccuped(int colonna, int riga) {
        if (matrice[riga][colonna]!=' ') {
            throw new IllegalArgumentException("ma che cacchio fai, non vedi che la casella è gia occupata");
        }
        return true;
    }
    public void Stampa_soluzioni(int colonna,int riga) {
                if (simbolo_corrente == g1_simbolo) {
                    if (isoccuped(colonna, riga) && (matrice[riga][colonna + 1] == g2_simbolo || matrice[riga][colonna - 1] == g2_simbolo || matrice[riga + 1][colonna] == g2_simbolo || matrice[riga - 1][colonna] == g2_simbolo || matrice[riga - 1][colonna - 1] == g2_simbolo || matrice[riga + 1][colonna + 1] == g2_simbolo)) {
                        matrice[riga][colonna] = '✔' ;
                        griglia+= matrice[riga][colonna];
                    }
                }
            else{
                if (isoccuped(colonna, riga) && (matrice[riga][colonna+1] == g1_simbolo || matrice[riga][colonna-1] == g1_simbolo || matrice[riga+1][colonna] == g1_simbolo || matrice[riga-1][colonna] == g1_simbolo || matrice[riga-1][colonna-1] == g1_simbolo || matrice[riga+1][colonna+1] == g1_simbolo)){
                    matrice[riga][colonna]='✔';
                    griglia+= matrice[riga][colonna];
                    }
                }
    }

    public void Inserimento(int colonna,int riga){
                if (simbolo_corrente==g1_simbolo){
                    if (isoccuped(colonna, riga) && (matrice[riga][colonna+1]==g2_simbolo ||matrice[riga][colonna-1]==g2_simbolo || matrice[riga+1][colonna]==g2_simbolo || matrice[riga-1][colonna]==g2_simbolo || matrice[riga-1][colonna-1]==g2_simbolo || matrice[riga+1][colonna+1]==g2_simbolo) ){
                        matrice[riga][colonna]=g1_simbolo;
                    }
                    else {
                        throw new IllegalArgumentException("ma che cacchio fai, non puoi inserire lì la pedina ");
                    }
                }
                else{
                    if (isoccuped(colonna, riga) && (matrice[riga][colonna+1] == g1_simbolo || matrice[riga][colonna-1] == g1_simbolo || matrice[riga+1][colonna] == g1_simbolo || matrice[riga-1][colonna] == g1_simbolo || matrice[riga-1][colonna-1] == g1_simbolo || matrice[riga+1][colonna+1] == g1_simbolo)){
                        matrice[riga][colonna]=g2_simbolo;
                    }
                    else {
                        throw new IllegalArgumentException("ma che cacchio fai, non puoi inserire lì la pedina ");
                    }
                }

            }
}
