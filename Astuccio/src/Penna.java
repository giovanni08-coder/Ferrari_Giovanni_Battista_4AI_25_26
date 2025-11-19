public class Penna {
    private String marca;
    private boolean cancellabile;
    private double quantitaInchiostro;
    private String colore;
    public Penna(){
        marca = "Giotto";
        cancellabile = false;
        quantitaInchiostro = 1.3;
        colore = "blue";
    }
    public Penna(String m,boolean canc,double qI,String color){
        setMarca(m);
        setCancellabile(canc);
        setQuantitaInchiostro(qI);
        setColore(color);
    }

    public void setCancellabile(boolean cancellabile) {
        this.cancellabile = cancellabile;
    }
    public boolean getCancellabile(){
        return cancellabile;
    }

    public void setMarca(String marca) {
        if (marca.length()<2){
            throw new IllegalArgumentException("non puoi inserire marche con nome troppo piccolo");
        }
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setColore(String colore) {
        if (colore.length()<2){
            throw new IllegalArgumentException("non ci sono colori con lunghezza così piccola");
        }
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setQuantitaInchiostro(double quantitaInchiostro) {
        if (quantitaInchiostro>1.47){
            throw new IllegalArgumentException("Non puoi inserire un valore così elevato/basso di inchiostro nella penna ");
        }
        this.quantitaInchiostro = quantitaInchiostro;
    }

    public double getQuantitaInchiostro() {
        return quantitaInchiostro;
    }

    @Override
    public String toString() {
        return "Penna{" +
                "marca='" + marca + '\'' +
                ", cancellabile=" + cancellabile +
                ", quantitaInchiostro=" + quantitaInchiostro +
                ", colore='" + colore + '\'' +
                '}';
    }
}
