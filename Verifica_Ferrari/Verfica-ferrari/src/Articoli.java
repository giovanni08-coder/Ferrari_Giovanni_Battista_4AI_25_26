import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Articoli {
    private String id;
    private String descrizione;
    private String tipo;
    private LocalDate data;
    private double prezzo;
    public static List<String> li = new ArrayList<>();

    public Articoli(String id,String descrizione,String tipo,LocalDate data, double prezzo){
        setId(id);
        setDescrizione(descrizione);
        setTipo(tipo);
        setData(data);
        setPrezzo(prezzo);
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        if (!id.matches("[A-Z][0-9A-Z]{5}")){
            throw new IllegalArgumentException("Non puoi inserire questo id");
        }
        if (li.contains(id)){
            throw new IllegalArgumentException("Non puoi inserire questo id");
        }
        this.id = id;
        li.add(id);
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        if (descrizione.length() < 5 || descrizione.length() > 45){
            throw new IllegalArgumentException("la descrizione è troppo lunga o corta");
        }
        this.descrizione = descrizione;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        List<String> tipi_possibili = Arrays.asList("elettronico","decorativo","ecofriedly","ironico");
        if (!tipi_possibili.contains(tipo)){
            throw new IllegalArgumentException("Non puoi inserire questa descrizione");
        }
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (LocalDate.now().getYear() < data.getYear()){
            throw new IllegalArgumentException("Non puoi inserire questa data di acquisto");
        }
        this.data = data;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo < 0){
            throw new IllegalArgumentException("Non puoi inserire questo prezzo");
        }
        this.prezzo = prezzo;
    }
    public double ScontoApllicabile(){
        double differeza = LocalDate.now().getYear() - data.getYear();
        if (descrizione!= "elettronico" || descrizione!= "decorativo" || prezzo < 15){
            return 0.80 + ((differeza*365)/1000)*prezzo;
        }
        return 0;
    }
    static public boolean CheckId(String id){
        if (!id.matches("[A-Z][0-9A-Z]{5}")){
            throw new IllegalArgumentException("Non puoi inserire questo id");
        }
        if (li.contains(id)){
            throw new IllegalArgumentException("Non puoi inserire questo id");
        }
        return false;
    }
    static public boolean CheckDescrizione(String descrizione){
        if (descrizione.length() < 5 || descrizione.length() > 45){
            throw new IllegalArgumentException("la descrizione è troppo lunga o corta");
        }
        return false;
    }
    static public boolean CheckTipo(String tipo){
        List<String> tipi_possibili = Arrays.asList("elettronico","decorativo","ecofriedly","ironico");
        if (!tipi_possibili.contains(tipo)){
            throw new IllegalArgumentException("Non puoi inserire questa descrizione");
        }
        return false;
    }
    static public boolean CheckData(LocalDate data){
        if (LocalDate.now().getYear() < data.getYear()){
            throw new IllegalArgumentException("Non puoi inserire questa data di acquisto");
        }
        return false;
    }
    static public boolean CheckPrezzo(double prezzo){
        if (prezzo < 0){
            throw new IllegalArgumentException("Non puoi inserire questo prezzo");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Articoli{" +
                "id='" + id + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", tipo='" + tipo + '\'' +
                ", data=" + data +
                ", prezzo=" + prezzo +
                '}';
    }
}
