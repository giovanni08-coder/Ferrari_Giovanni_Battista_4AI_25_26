import java.util.ArrayList;
import java.util.List;

public class Cassa {
    private List<Tavolo> tavoli = new ArrayList<>();

    public float getSpesa(Tavolo t) {
        float spesa=0;
        for (int i = 0; i < t.MAX_POS;i++) {
            spesa+= t.getOrdini().get(i).getCosto();
        }
        return spesa;
    }
    public void Aggiungi_tavolo(Tavolo t){
        tavoli.add(t);
    }

    @Override
    public String toString() {
        return "Cassa{" +
                "tavoli=" + tavoli +
                '}';
    }

    public List<Tavolo> getTavoli() {
        return tavoli;
    }
}
