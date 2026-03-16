public class Grafo {
    private int[][] matrice;
    int numero;

    public Grafo(int numeroNodi) {
        if (numeroNodi <= 0) {
            throw new IllegalArgumentException("Non puoi inserire questo numero di nodi");
        }
        numero = numeroNodi;
        matrice = new int[numero][numero];
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == j) {
                    matrice[i][j] = 0;
                } else {
                    matrice[i][j] = -1;
                }
            }
        }
    }

        
        public void aggiungiArco(int u, int v, int peso) {
            controllaIndice(u);
            controllaIndice(v);
            matrice[u][v] = peso;
        }


        public void rimuoviArco(int u, int v) {
            controllaIndice(u);
            controllaIndice(v);
            matrice[u][v] = -1;
        }


        public boolean esisteArco(int u, int v) {
            controllaIndice(u);
            controllaIndice(v);
            return matrice[u][v] != -1;
        }


        public int peso(int u, int v) {
            controllaIndice(u);
            controllaIndice(v);
            return matrice[u][v];
        }


        public void stampa() {
            for (int i = 0; i < numero; i++) {
                for (int j = 0; j < numero; j++) {
                    if (matrice[i][j] == -1) {
                        System.out.print("INF ");
                    } else {
                        System.out.print(matrice[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }


        private void controllaIndice(int x) {
            if (x < 0 || x >= numero) {
                throw new IllegalArgumentException("Indice nodo non valido: " + x);
            }
        }
    }
