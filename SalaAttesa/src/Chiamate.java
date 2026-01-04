import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Chiamate {
    private String codiceBiglietto;
    private String identificativoCassa;
    private Timestamp orario;
    public Chiamate(String c,String i, Timestamp o){
        setCodiceBiglietto(c);
        setOrario(o);
        setIdentificativoCassa(i);
    }

    public String getCodiceBiglietto() {
        return codiceBiglietto;
    }

    private void setCodiceBiglietto(String c) {
        if (c == null || c.trim().isEmpty()) {
            throw new IllegalArgumentException("Il codice biglietto non può essere nullo o vuoto");
        }
        this.codiceBiglietto = c;
    }

    public String getIdentificativoCassa() {
        return identificativoCassa;
    }

    private void setIdentificativoCassa(String i) {
        if (i.trim().isEmpty()) {
        throw new IllegalArgumentException("L'identificativo della cassa non può essere vuoto");
    }
        this.identificativoCassa = i;
    }

    public Timestamp getOrario() {
        return orario;
    }

    private void setOrario(Timestamp o) {
        if (o == null || Timestamp.valueOf(LocalDateTime.now()).before(o)) {
            throw new IllegalArgumentException("L'orario non può essere nullo o vuoto");
        }
        this.orario = o;
    }

    @Override
    public String toString() {
        return "Chiamate{" +
                "codiceBiglietto='" + codiceBiglietto + '\'' +
                ", identificativoCassa='" + identificativoCassa + '\'' +
                ", orario=" + orario +
                '}';
    }
}
