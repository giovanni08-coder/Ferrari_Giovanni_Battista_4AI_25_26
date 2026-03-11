import java.util.ArrayList;
import java.util.List;

/**
 * Classe Provetta.
 */
public class Provetta {
    protected Colore[] colori;
    protected int ColoriProvetta;

    /**
     * Crea una nuova provetta.
     /* @param capacita Indica quante unità di colore può contenere la provetta.
     */
    public Provetta(int coloriProvetta) {
        setColoriProvetta(coloriProvetta);
        colori = new Colore[coloriProvetta];
    }

    public int getColoriProvetta() {
        return ColoriProvetta;
    }

    private void setColoriProvetta(int coloriProvetta) {
        if (coloriProvetta<0){
            throw new IllegalArgumentException("Non puoi inserire il colore");
        }
        ColoriProvetta = coloriProvetta;
    }

    public Colore[] getColori() {
        return colori;
    }

    /**
     * Aggiunge una unità di colore.
     * @param colore Indica quale colore viene aggiunto.
     */
    public void aggiungi(Colore colore) {
        if (this.isCompleta()){
            throw new IllegalArgumentException("Non puoi aggiungere colori alla provetta");
        }
        for (int i =0;i< colori.length;i++){
            if (colori[i]==null){
                colori[i] = colore;
                return;
            }
        }
    }

    /**
     * Toglie una unità di colore dalla provetta (Quella più in alto).
     * @return Restituisce il colore tolto dalla provetta.
     */
    public Colore rimuovi() {
        Colore colore = Colore.BIANCO;
        for (int i=0; i< colori.length-1;i++){
            if (colori[i+1]==null && colori[i]!=null){
                colore = colori[i];
                colori[i]=null;
            }
        }
        if (colore ==null){
            colore= colori[colori.length-1];
            colori[colori.length-1]=null;
        }
        return colore;
    }

    /**
     * Determina se la provetta è stata riempita con un solo colore.
     * @return Restituisce vero se la provetta è completa, false altrimenti.
     */
    public boolean isCompleta() {
        if (this.contaColoreInCima()==colori.length-1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Determina se la provetta è vuota.
     * @return Vero se la provetta è vuota, falso altrimenti.
     */
    public boolean isVuota() {
        if (colori[0]==null){
            return true;
        }
        return false;
    }

    /**
     * Determina se la provetta è piena.
     * @return Vero se la provetta è piena, falso altrimenti.
     */
    public boolean isPiena() {
        if (colori[colori.length-1]==null){
            return false;
        }
        return true;
    }

    /**
     * Restituisce lo spazio disponibile nella provetta.
     * @return Il numero di unità di colore che la provetta può ricevere.
     */
    public int spazioLibero() {
        if (this.isPiena()){
            return 0;
        }
        for (int i=0;i<colori.length;i++){
            if (colori[i]==null){
                return (colori.length) - i;
            }
        }
            return 0; //non ci arriva mai qua
    }

    /**
     * Determina il numero di unità dello stesso colore presenti nella parte alta della provetta.
     * @return Il numero di unità di colore.
     */
    public int contaColoreInCima() {
        int conta=0;
        for (int i=0;i<colori.length-1;i++){
            if (colori[i]==colori[i+1]){
                conta++;
            }
        }
        return conta;
    }

    /**
     * Stampa il contenuto della provetta.
     */
    @Override
    public String toString() {
        String color_provetta= "";
        for (int i=0;i<colori.length;i++){
            if (colori[i]!=null){
                color_provetta+= colori[i] + " ";
            }
        }
        return "[" + color_provetta + "]";
    }
}