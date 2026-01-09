import java.util.LinkedList;
import java.util.Queue;

public class Pizzaiolo {
    private Queue<Tavolo> pizze;
    private Cassa cassa;
    public Pizzaiolo(){
        pizze= new LinkedList<Tavolo>();
        cassa = new Cassa();
    }
    public void PreparaTavolo(Tavolo t){
        pizze.poll();
        cassa.Aggiungi_tavolo(t);
    }
    public void AggiungiTavolo(Tavolo t ){
        pizze.add(t);
    }

}
