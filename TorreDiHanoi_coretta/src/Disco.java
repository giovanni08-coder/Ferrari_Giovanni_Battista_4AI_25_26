public class Disco {
    private int dimensione;
    public Disco(int dimensione){
        setDimensione(dimensione);
    }

    public void setDimensione(int dimensione) {
        if (dimensione <= 0){
            throw new IllegalArgumentException("Non esiste un disco con dimensione minore o uguale a 0");
        }
        this.dimensione = dimensione;
    }

    public int getDimensione() {
        return dimensione;
    }
}
