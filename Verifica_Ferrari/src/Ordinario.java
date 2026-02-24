public class Ordinario extends Frutto {
    private String varieta;
    private double prezzoKg;
    public Ordinario(String varieta, double prezzoKg,String nome,String id, boolean rischioAllergia) {
        super(id,nome,rischioAllergia);
        this.varieta = varieta;
        setPrezzoKg(prezzoKg);
    }

    private void setPrezzoKg(double prezzoKg) {
        if (prezzoKg<=0){
            throw new IllegalArgumentException("Non puoi inserire questo prezzo");
        }
        this.prezzoKg = prezzoKg;
    }

    @Override
    public double ScontoMax() {
        if (prezzoKg>10){
            return (prezzoKg*0.01) +1.05;
        }
        return 1.35;
    }

    @Override
    public String toString() {
        return "Ordinario{" + super.toString() +
                "varieta='" + varieta + '\'' +
                ", prezzoKg=" + prezzoKg +
                '}';
    }
}
