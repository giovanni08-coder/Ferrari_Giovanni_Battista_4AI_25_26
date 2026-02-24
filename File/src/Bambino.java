public class Bambino extends Persona{
    private int Pipi;

    public Bambino(String nome, String cognome, int eta, int pipi) {
        super(nome, cognome, eta);
        setC();
        Pipi = pipi;
    }

    @Override
    public void setC() {
        c="Bambino";
    }

    public int getPipi() {
        return Pipi;
    }

    public void setPipi(int pipi) {
        Pipi = pipi;
    }

    @Override
    public String toString() {
        return "Bambino{" + "Bambino"+ super.toString() +
                "Pipi=" + Pipi +
                '}';
    }
}
