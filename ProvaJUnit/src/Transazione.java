import java.time.LocalDate;

public class Transazione{
    private String mittente,beneficiario;
    private LocalDate data;
    private double importo;
    private String causale;

    public Transazione(String mittente, String beneficiario, double importo, LocalDate data, String causale) {
        this.mittente = mittente;
        this.beneficiario = beneficiario;
        this.importo = importo;
        this.data = data;
        this.causale = causale;
    }
}
