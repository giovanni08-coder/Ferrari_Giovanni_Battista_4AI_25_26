import java.sql.Timestamp;

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
        this.codiceBiglietto = c;
    }

    public String getIdentificativoCassa() {
        return identificativoCassa;
    }

    private void setIdentificativoCassa(String i) {
        this.identificativoCassa = i;
    }

    public Timestamp getOrario() {
        return orario;
    }

    private void setOrario(Timestamp o) {
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
