import java.util.ArrayList;
import java.util.List;

public class Albero {
    private Nodo root;
    private static List<Nodo> nodi = new ArrayList<>();
    public Albero(Nodo root) {
        this.root = root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public Nodo getRoot() {
        return root;
    }

    public void inserisci(int valore,Nodo nodo){
        if (valore> nodo.getValore()){
            if (nodo.getDx()==null){
                nodo.setDx(new Nodo( valore,null,null));
            }
            else {
                inserisci(valore,nodo.getDx());
            }
        }
        if (valore <= nodo.getValore()){
            if (nodo.getSx()==null){
                nodo.setSx(new Nodo( valore,null,null));
            }
            else{
                inserisci(valore,nodo.getSx());
            }
        }
    }

    @Override
    public String toString() {
        if (root.getSx()==null && root.getDx()!=null){
            return "" + root.getValore() + root.getDx().getValore();
        }
        if (root.getDx()==null && root.getSx()!=null){
            return "" + root.getValore() + root.getSx().getValore();
        }
        if (root.getDx()==null && root.getSx()==null){
            return "" + root.getValore();
        }
        return "Albero{" +
                "root=" + root.getValore() + "figlio sinistro: " +  root.getSx().getValore() + "figlio Destro: " +  root.getDx().getValore() +
                '}' + root.toString();
    }
}
