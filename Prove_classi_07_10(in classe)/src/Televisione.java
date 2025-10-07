public class Televisione {
    // ATTRIBUTI/VARIABILI

    // Attirubuti funzionali
    public float dimesione;
    public String marca;
    public boolean colore;

    // Attributi di stato (interni alla classe)
    public int volume;
    //Information hiding: una classe Dovrebbe avere gli attributi privati
    //e i metodi pubblici
    //Incapsulation: le classi Dovrebbero comunicare con il mondo esterno
    //solo ed escluvamente attraverso i metodi pubblici
    private int canale;
    public boolean accesa;

    // COSTRUTTORE: è un metodo della classe
    // richiamabile solo una volta alla creazione/istanzazione
    // dell'oggetto, senza tipo di ritorno,
    // e con lo stesso nome della classe
    //costruttore di default
    public Televisione(){
        this("Samsung",1,10,false);
        marca = "Samsung";
        dimesione = 27.5f;
        volume = 10;
        colore = true;
        accesa = false;
        canale = 3;

    }
    public Televisione(String marcaDaImpostare){
        marca = marcaDaImpostare;
        dimesione = 27.5f;
        volume = 10;
        colore = true;
        accesa = false;
        canale = 3;

    }
    public Televisione(int canale){
        marca = "Samsung";
        dimesione = 27.5f;
        volume = 10;
        colore = true;
        accesa = false;
        this.canale = canale;
    }
    public Televisione(String marca,int canale){
        this.marca = marca;
        dimesione = 27.5f;
        volume = 10;
        colore = true;
        accesa = false;
        this.canale = canale;
    }
    private Televisione(String marca, int canale,int volume,boolean accesa){
        this.marca = marca;
        dimesione = 27.5f;
        this.volume = volume;
        colore = true;
        this.accesa = accesa;
        this.canale = canale;
    }
    // METODI/FUNZIONI
    public void accendi(){
        accesa = true;
    }
    public void spegni(){
        accesa = false;
    }
    public void canalePiu(){
        // canale = canale + 1;
        // canale += 1;
        // ++canale; -> incrementa prima
        canale++; // incrementa dopo
    }
    public void canaleMeno(){
        // canale = canale - 1;
        // canale -= 1;
        // --canale; -> decrementa prima
        canale--; // decrementa dopo
    }
    public void volumePiu(){
        volume++;
    }
    public void volumeMeno(){
        volume--;
    }
    public void impostaCanale(int canaleDaImpostare){
        if (canaleDaImpostare<=0){
            System.out.println("Errore");
        }
        else {
            this.canale = canaleDaImpostare;
        }
    }
    public int canaleCorrente(){
        return canale;
    }
}
