import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rete {
    private Map<String, Map<String,Integer>> rete;

    public Rete() {
        rete = new HashMap<>();
    }

    public void AggiungiCollegamento(Nodo DaCollegare1,Nodo DaCollegare2,Integer costo){
        List<String> NodiPresenti = new ArrayList<>(rete.keySet());
        if (!(NodiPresenti.contains(DaCollegare1.getNomeRouter()))){
            Map<String,Integer> collegamento = new HashMap<>();
            collegamento.put(DaCollegare2.getNomeRouter(), costo);
            rete.put(DaCollegare1.getNomeRouter(),collegamento);
        }
        else {
            rete.get(DaCollegare1.getNomeRouter()).put(DaCollegare2.getNomeRouter(),costo);
        }
        if (!(NodiPresenti.contains(DaCollegare2.getNomeRouter()))){
            Map<String,Integer> collegamento = new HashMap<>();
            collegamento.put(DaCollegare1.getNomeRouter(), costo);
            rete.put(DaCollegare2.getNomeRouter(),collegamento);
        }else {
            rete.get(DaCollegare2.getNomeRouter()).put(DaCollegare1.getNomeRouter(),costo);
        }
    }
    public void  EliminaNodo(Nodo NodoDaElimnare){
        List<String> NodiPresenti = new ArrayList<>(rete.keySet());
        NodiPresenti.remove(NodoDaElimnare.getNomeRouter());
        rete.remove(NodoDaElimnare.getNomeRouter());
        for (int i=0;i<NodiPresenti.size();i++){
            List<String> Chiavidizionari = new ArrayList<>(rete.get(NodiPresenti.get(i)).keySet());
            if (Chiavidizionari.contains(NodoDaElimnare.getNomeRouter())){
                rete.get(NodiPresenti.get(i)).remove(NodoDaElimnare.getNomeRouter());
            }
        }
    }
}
