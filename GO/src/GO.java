public class GO {
    private int righe,colonne;
    private char griglia[][];
    private char turno;
    private int dim;
    public GO(int dimensione){
        Set_dimensione_griglia(dimensione);
        turno = 'X';
    }
    public char[][] getGriglia(){
        char[][] g = griglia.clone();
        return g;
    }
    public int getdimGriglia(){
        return dim;
    }
    /**
     *
     * @param riga riga dove posizionare la pedina (1-dim griglia)
     * @param colonna
     */
    public void mossa(int riga,int colonna){
       if(riga < 1 || riga > dim) throw new IllegalArgumentException("Riga fuori dall'intervallo");
       if(colonna < 1 || colonna > dim) throw new IllegalArgumentException("Colonna fuori dall'intervallo");
       riga--;
       colonna--;
       if(griglia[riga][colonna] != '-')throw new IllegalArgumentException("Casella già occupata");
       griglia[riga][colonna] = turno;
       if(turno=='X') turno = 'O';
       else turno = 'X';
    }

    /**
     *
     * @param tp indica il tipo di pietra da contare. Sono amessi i valori 'X' e 'O'
     * @return restituisce il numero di pietre presenti nella griglia.
     */
    public int GetnumPietre(char tp){
        int conta = 0;
        for (int r=0;r<dim; r++){
            for (int c=0;c< dim;c++){
                if (griglia[r][c] == tp) conta++;
            }

        }
        return conta;
    }

    /**
     * imposta la griglia di gioco.
     * 1 - 9x9
     * 2 - 13x13
     * 3 - 19x19
     *
     * @param dimensione
     * @return non restituisce niente. Genera un eccezzione se dim
     * non è acettata.
     */
    private void Set_dimensione_griglia(int dimensione){
        if (dimensione<1 || dimensione>3) throw new IllegalArgumentException("Dimensione griglia non accettata");
        switch (dimensione){
            case 1: dim = 9; break;
            case 2: dim = 13; break;
            case 3: dim = 19; break;
        }
        griglia= new char[dim][dim];
        for (int r=0;r<dim; r++){
            for (int c=0;c<dim;c++){
                griglia[r][c]= '-';
            }

        }
    }
    public void togli_pedina(){
        for (int r=0;r<dim; r++){
            for (int c=0;c< dim;c++){
                if (griglia[r][c] == 'X' && griglia[r+1][c]=='O' && griglia[r-1][c]=='O' &&  griglia[r][c+1]=='O' &&  griglia[r][c-1]=='O' ) griglia[r][c]==
            }
        }
    }
}
