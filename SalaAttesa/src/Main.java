import java.util.Scanner;
import java.sql.Timestamp;


    private Cassa[] casse;
    private Gestore gestore;
    private LogChiamate log;

    public void prenotaBigliettoNormale() {
        gestore.emettiBigliettoNormale();
    }
    public void prenotaBigliettoPrioritario() {
        gestore.emettiBigliettoPtioritario();
    }
    public void StampaUtentiInCoda(){
        System.out.println("In attesa: " + gestore.getBigliettiInAttesa());
    }
    public void StampaStoricoChiamate(){
        for (int i =0; i<log.getChiamate().size();i++) {
            System.out.println(log.getChiamate().get(i));
        }
    }
    private int ChiediScelta(){
        return Integer.parseInt(IO.readln("Inserisci un numero da 0 a 5: "));
    }
    void main() {
        log = new LogChiamate();
        gestore = new Gestore(log);
        casse = new Cassa[]{ new Cassa() };

        int scelta;

        do {
            stampaMenu();
            scelta = ChiediScelta();

            switch (scelta) {
                case 1:
                    prenotaBigliettoNormale();
                    break;

                case 2:
                    prenotaBigliettoPrioritario();
                    break;

                case 3:
                    for (Cassa c : casse) {
                        String gest = gestore.chiamaBiglietto();
                        String ind = c.getIdentificativo();
                        System.out.println(gest + ":" + c.ChiamaProssimoCliente());
                        log.AggiungiChiamate(gest, ind, new Timestamp(System.currentTimeMillis()));
                    }
                    break;

                case 4:
                    StampaUtentiInCoda();
                    break;

                case 5:
                    StampaStoricoChiamate();
                    break;
            }

        } while (scelta != 0);
    }


    public void stampaMenu() {
        System.out.println("""
                1. Prenota biglietto normale
                2. Prenota biglietto prioritario
                3. Chiamata pazienti
                4. Visualizza utenti in coda
                5. Storico chiamate
                0. Esci
                """);
    }

