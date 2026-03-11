import java.util.ArrayList;
import java.util.List;

/**
 * Classe che rappresenta il tavolo di gioco dove si trovano le provette.
 */
public class Tavolo {
    private List<Provetta> lista;
    private int numProvette;
    private int capacitaProvette;


    /**
     * Crea un nuovo tavolo di gioco.
     * @param numProvette Indica il numero di provette.
     * @param capacitaProvette Specifica la capacità in unità di colore per ogni provetta.
     */
    public Tavolo(int numProvette, int capacitaProvette) {
        setCapacitaProvette(capacitaProvette);
        setNumProvette(numProvette);
        lista=new ArrayList<>();
        for (int i=0;i<numProvette;i++){
            lista.add(new Provetta(capacitaProvette));
        }
    }

    /**
     * Crea un nuovo tavolo di gioco dotato di provette standard e special.
     * @param numProvette Indica il numero di provette standard.
     * @param numProvetteSpecial Indica il numero di provette special.
     * @param capacitaProvette Specifica la capacità in unità di colore per ogni provetta.
     */
    public Tavolo(int numProvette, int numProvetteSpecial, int capacitaProvette) {
        setCapacitaProvette(capacitaProvette);
        setNumProvette(numProvette);
        lista=new ArrayList<>();
        for (int i=0;i<numProvette;i++){
            lista.add(new Provetta(capacitaProvette));
        }
        for (int i=0;i<numProvetteSpecial;i++){
            lista.add(new ProvettaSpecial(capacitaProvette));
        }
    }

    public int getNumProvette() {
        return numProvette;
    }

    private void setNumProvette(int numProvette) {
        if (numProvette<=0){
            throw new IllegalArgumentException("Non puoi inserire questo numero");
        }
        this.numProvette = numProvette;
    }

    public int getCapacitaProvette() {
        return capacitaProvette;
    }

    private void setCapacitaProvette(int capacitaProvette) {
        if (capacitaProvette<=0){
            throw new IllegalArgumentException("Non puoi inserire questo numero");
        }
        this.capacitaProvette = capacitaProvette;
    }

    /**
     * Permette di aggiungere del colore ad una provetta.
     * @param posProvetta Indica a quale provetta aggiungere il colore (partendo da 0).
     * @param qtaColore Specifica le unità di colore che si vogliono aggiungere.
     * @param colore Definisce quale colore aggiungere.
     */
    public void riempi(int posProvetta, int qtaColore, Colore colore) {
        if (posProvetta< 0 || posProvetta>= lista.size() ){
            throw new IllegalArgumentException("Non puoi inserire questa posizione");
        }
        if (qtaColore<=0 || qtaColore + capacitaProvette> capacitaProvette ){
            throw new IllegalArgumentException("Non puoi inserire quetsa quantità di colore");
        }
        if (lista.get(posProvetta).isVuota()){
            for (int i=0;i<qtaColore-1;i++){
                lista.get(posProvetta).aggiungi(colore);
            }
        }
        else {
            throw new IllegalArgumentException("Non puoi inserire colori");
        }
    }

    /**
     * Permette di travasare del colore da una provetta ad un'altra.
     * @param pSorgente Indica da quale provetta prendere il colore.
     * @param pDestinazione Indica a quale provetta aggiungere il colore.-
     * @return Restituisce il numero di unità di colore travasate.
     */
    public int travasa(int pSorgente, int pDestinazione) {
        if (pSorgente<=0 || pSorgente> lista.size()){
            throw new IllegalArgumentException("Non puoi inserire questo indice");
        }
        if (pDestinazione<=0 || pDestinazione> lista.size()){
            throw new IllegalArgumentException("Non puoi inserire questo indice");
        }

        int conta =0;
        if (!(lista.get(pSorgente).isPiena() && lista.get(pDestinazione).isPiena())){
            conta =lista.get(pSorgente).contaColoreInCima();
            for (int i=0;i<conta;i++){
                lista.get(pDestinazione).aggiungi(lista.get(pSorgente).getColori()[i]);
            }
        }
        return conta;
    }

    /**
     * Determina se il gioco è finito.
     * @return Restituisce vero se il gioco è terminato oppure false se non è concluso.
     */
    public boolean isFinito() {
        int conta=0;
        for (int i=0;i<lista.size();i++){
            if (lista.get(i).isCompleta()){
                conta++;
            }
        }
        if (conta==lista.size()){
            return true;
        }
        return false;
    }

    /**
     * Permette di accedere direttamente alla provetta indicata.
     * @param posizione Indica la posizione della provetta a cui si vuole accedere (partendo da 0).
     * @return
     */
    public Provetta getProvetta(int posizione) {
        Provetta a = lista.get(posizione);
        return a;
    }

    /**
     * Stampa il tavolo di gioco.
     */
    @Override
    public String toString() {
        String stringa= "";
        for (int i=0;i<lista.size();i++){
            stringa+= "Provetta " + i + "->" + lista.get(i) + "\n";
        }
        return stringa;
    }
}