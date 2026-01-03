import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class LogChiamate {
    private List<Chiamate> chiamate;

    public LogChiamate(){
        chiamate = new ArrayList<Chiamate>();
    }

    public void AggiungiChiamate(String c, String i, Timestamp o){
        Chiamate chiamata = new Chiamate(c,i,o);
        chiamate.add(chiamata);
    }

    public List<Chiamate> getChiamate() {
        return chiamate;
    }
}
