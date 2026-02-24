import java.time.LocalDate;
import java.util.Date;

public class Bambino extends Persona{
    private LocalDate data;

    public Bambino(String nome, String cognome, int eta, LocalDate data) {
        super(nome, cognome, eta);
        setC();
        this.data = data;
    }

    @Override
    public void setC() {
        c="Bambino";
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Bambino{" + "Bambino"+ super.toString() +
                "Data=" + data +
                '}';
    }
}
