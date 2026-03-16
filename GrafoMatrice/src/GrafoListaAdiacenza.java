import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoListaAdiacenza {
        private int n;
        private List<Map<Integer, Integer>> lista;

        public GrafoListaAdiacenza(int n) {
            this.n = n;
            this.lista = new ArrayList<>(n);


            for (int i = 0; i < n; i++) {
                lista.add(new HashMap<>());
            }
        }


        public void aggiungiArco(int u, int v, int peso) {
            controllaIndice(u);
            controllaIndice(v);
            lista.get(u).put(v, peso);
        }


        public void rimuoviArco(int u, int v) {
            controllaIndice(u);
            controllaIndice(v);
            lista.get(u).remove(v);
        }


        public boolean esisteArco(int u, int v) {
            controllaIndice(u);
            controllaIndice(v);
            return lista.get(u).containsKey(v);
        }

        public int peso(int u, int v) {
            controllaIndice(u);
            controllaIndice(v);
            return lista.get(u).get(v);
        }


        public void stampa() {
                for (int i = 0; i < n; i++) {
                    System.out.println(i + " -> " + lista.get(i));
                }
        }

        private void controllaIndice(int x) {
            if (x < 0 || x >= n) {
                throw new IllegalArgumentException("Indice nodo non valido: " + x);
            }
        }
}
