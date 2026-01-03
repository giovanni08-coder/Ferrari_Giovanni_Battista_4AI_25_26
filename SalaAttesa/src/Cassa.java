public class Cassa {
     private static int  progressivo;
     private String identificativo;

    public Cassa() {
        this.identificativo = getIdentificativo();
        progressivo++;
    }

    public String getIdentificativo() {
        identificativo = "CASSA" + progressivo;
        return identificativo;
    }
    public String ChiamaProssimoCliente() {
        return "Il prossimo cliente da " + identificativo;
    }
}
