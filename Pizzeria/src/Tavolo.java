import java.util.ArrayList;
import java.util.List;

public class Tavolo {
    public final int MAX_POS=4;
    private static int ntavolo;
    private List<Pizza> ordini;
    private Stato stato;
    private String  identificativo;

    public Tavolo(){
        stato=Stato.NON_SERVITO;
        ordini= new ArrayList<>();
        this.identificativo=getIdentificativo();
        ntavolo++;
    }
    public void AggiungiPizze(Pizza p){
        ordini.add(p);
    }
    public String getIdentificativo() {
        identificativo = "TAVOLO" + ntavolo;
        return identificativo;
    }
    public List<Pizza> getOrdini() {
        return ordini;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
    public String ChiamaTavolo() {
        return "Ha preso l'ordine dal: " + identificativo;
    }


    @Override
    public String toString() {
        return "Tavolo{" +
                "MAX_POS=" + MAX_POS +
                ", ordini=" + ordini +
                ", stato=" + stato +
                '}';
    }
}
