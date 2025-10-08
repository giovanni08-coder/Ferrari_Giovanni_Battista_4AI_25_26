import java.time.LocalDate;

public class Automobile {
    private String marca;
    private String modello;
    private int anno;
    private int km;
    private LocalDate dataOggi;
    private int anno_attuale;
    private int diff_anni;
    public Automobile(){
        marca= "Ford";
        modello="Fiesta";
        anno=2020;
        km=15000;
    }
    public void getAggiorna_Chilometraggio(int chilometri_aggiornati){
        if (chilometri_aggiornati<km)throw new IllegalArgumentException("non puoi inserire un numero di chilometri che sia minore di quelli fatti ");
        else{
            km=chilometri_aggiornati;
        }
    }

    public int getKm() {
        return km;
    }
    public int calcolaetà(){
        LocalDate dataOggi=LocalDate.now();
        int anno_attuale=dataOggi.getYear();
        return anno_attuale-anno;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +  "\n" +
        "Modello: " + modello +  "\n"+
        "Anno: " + anno + "\n" +
        "Chilometraggio: " + km;
    }
}
