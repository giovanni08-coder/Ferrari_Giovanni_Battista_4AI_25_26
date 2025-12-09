import java.util.ArrayList;
import java.util.Random;

public class Lampadina {
    //kiss ---> Keep It Short and Simple ---> lascialo semplice,stupido
    private static ArrayList<String> seriali = new ArrayList<>();

    private StatoLampadina stato;
    private String nSerie;

    //Attributi sul funzionamento
    private int nAccensioni;
    private int tempoFunzionamento; //secondi

    public Lampadina(){
        stato = StatoLampadina.SPENTA;
        nAccensioni = 0;

    }

    public StatoLampadina getStato() {
        return stato;
    }

    public void setStato(StatoLampadina stato) {
        this.stato = stato;
    }

    public void accendi(){
        if (this.stato==StatoLampadina.SPENTA){
            Random random = new Random();
            if (random.nextInt(1000) < 10){
                stato = StatoLampadina.FULMINATA;
            }
            else {
                stato = StatoLampadina.ACCESA;
                IncrementanAccensioni();
            }
        }
    }
    public void spengni(){
        this.stato = StatoLampadina.SPENTA;
    }
    public int getTempoFunzionamento() {
        return tempoFunzionamento;
    }

    public void setTempoFunzionamento(int tempoFunzionamento) {
        if (tempoFunzionamento<1){
            throw new IllegalArgumentException("Non puoi inserire questo tempo di utilizo");
        }
        this.tempoFunzionamento = tempoFunzionamento;
    }

    public int getnAccensioni() {
        return nAccensioni;
    }

    private void IncrementanAccensioni() {
        if(nAccensioni>1000){
            stato = StatoLampadina.FULMINATA;
            throw new IllegalArgumentException("Lamapdina fulminmata");
        }
        ++nAccensioni;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        if (!nSerie.matches("[A-Z][A-Z0-9]{4}")){
            throw new IllegalArgumentException("non puoi inserire questo ciìodice seriale");
        }
        this.nSerie = nSerie;
        seriali.add(nSerie);
    }

    @Override
    public String toString() {
        return "Lampadina{" +
                "stato=" + stato +
                ", nSerie='" + nSerie + '\'' +
                ", nAccensioni=" + nAccensioni +
                ", tempoFunzionamento=" + tempoFunzionamento +
                '}';
    }
}
