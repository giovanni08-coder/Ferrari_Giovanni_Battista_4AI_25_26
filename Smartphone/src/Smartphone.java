public class Smartphone {
    private String marca;
    private String modello;
    private double prezzoDiLancio;
    private double numPollici;
    private double ram;
    private boolean touchscreen;

    public Smartphone(){
        marca = "Iphone";
        modello = "13";
        prezzoDiLancio = 1000.50;
        numPollici = 7.5;
        ram = 24;
        touchscreen = true;
    }
    public Smartphone(String m,String mod,double p,double n, double r,boolean t){
        setMarca(m);
        setModello(mod);
        setPrezzoDiLancio(p);
        setNumPollici(n);
        setRam(r);
        setTouchscreen(t);
    }

    public void setMarca(String marca) {
        if (marca.length()<2){
            throw new IllegalArgumentException("la lunghezza della marca non può essere minore di 2 caratteri");
        }
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModello(String modello) {
        if (marca.length()<2){
            throw new IllegalArgumentException("la lunghezza del modello non può essere minore di 2 caratteri");
        }
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public void setPrezzoDiLancio(double prezzoDiLancio) {
        if (prezzoDiLancio<0){
            throw new IllegalArgumentException("il prezzo di lancio non può essere minore di 0 euro");
        }
        this.prezzoDiLancio = prezzoDiLancio;
    }

    public double getPrezzoDiLancio() {
        return prezzoDiLancio;
    }

    public void setNumPollici(double numPollici) {
        if (numPollici<0){
            throw new IllegalArgumentException("I pollici non possono essere minore di 0");
        }
        this.numPollici = numPollici;
    }

    public double getNumPollici() {
        return numPollici;
    }

    public void setRam(double ram) {
        if (ram<0){
            throw new IllegalArgumentException("la ram non può essere negativa");
        }
        this.ram = ram;
    }

    public double getRam() {
        return ram;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public boolean getTouchscreen() {
        return touchscreen;
    }
    public String ottieniFasciaDiPrezzo(){
        if (prezzoDiLancio<200){
            return "Fascia bassa";
        }
        if (prezzoDiLancio>=200 && prezzoDiLancio<=500) {
            return "Fascia media";
        }
        return "Fascia alta";
    }
    public String ottieniTipologiaSmartphone(){
        if (numPollici<5){
            return "Mini";
        }
        if (numPollici>=5 && numPollici<=7){
            return "Normal";
        }
        return "Maxi";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", prezzoDiLancio=" + prezzoDiLancio +
                ", numPollici=" + numPollici +
                ", ram=" + ram +
                ", touchscreen=" + touchscreen +
                ", Fascia di Pezzo=" + ottieniFasciaDiPrezzo() +
                ", Tipologia Smartphone=" + ottieniTipologiaSmartphone() +
                '}';
    }
}
