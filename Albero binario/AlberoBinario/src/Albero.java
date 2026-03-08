import java.util.ArrayList;
import java.util.List;

public class Albero {
    private Nodo root;
    private List<Integer> lista;
    public Albero() {
        this.root = null;
        lista= new ArrayList<>();
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    private void inserisciRicorsivo(int valore,Nodo nodo){
        if (nodo.getValore()==valore)return;
        if (valore> nodo.getValore()) {
            if (nodo.getDestro() == null) {
                nodo.setDestro(new Nodo(valore));
            }
            else {
                inserisciRicorsivo(valore,nodo.getDestro());
            }
        }
        else {
            if (nodo.getSinistro() == null){
                nodo.setSinistro(new Nodo(valore));
            }else {
                inserisciRicorsivo(valore,nodo.getSinistro());
            }
        }
    }
    public void Inserisci(int valore){
        if (root==null){
            root= new Nodo(valore);
            return;
        }
        this.inserisciRicorsivo(valore,root);
    }

    private void Preorder(Nodo nodo){
        if (nodo==null)return;
        lista.add(nodo.getValore());
        Preorder(nodo.getSinistro());
        Preorder(nodo.getDestro());
    }

    @Override
    public String toString() {
        Preorder(root);
        String stringa = "";
        for (Integer valore: lista){
            stringa += valore + " ";
        }
        return stringa;
    }
}
