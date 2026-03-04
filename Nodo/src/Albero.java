import java.util.ArrayList;
import java.util.List;

public class Albero {
    private Nodo root;
    private List<Integer> nodi = new ArrayList<>();
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
    public List<Integer> preOrder(Nodo nodo){
        if (nodo==null) return null;
        nodi.add(nodo.getValore());
        preOrder(nodo.getSx());
        preOrder(nodo.getDx());
        return nodi;
    }

    @Override
    public String toString() {
        List<Integer> lista_completa = this.preOrder(root);
        String string="";
        for (int i =0;i< lista_completa.size();i++){
            string+= lista_completa.get(i) + " ";
        }
        return string;
    }
}
