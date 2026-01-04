import java.util.Scanner;
import java.sql.Timestamp;

        private Cassa[] casse;
        private Gestore gestore;
        private LogChiamate log;

         void main() {
            log = new LogChiamate();
            gestore = new Gestore(log);
            casse = new Cassa[] { new Cassa() };
            int scelta;

            do {
                stampaMenu();
                scelta = Integer.parseInt(IO.readln("Inserisce un numero da 0 a 5: "));
                switch (scelta) {
                    case 1 : gestore.emettiBigliettoNormale();break;
                    case 2 : gestore.emettiBigliettoPtioritario();break;
                    case 3 : {
                        for (Cassa c : casse) {
                            String gest = gestore.chiamaBiglietto();
                            String ind = c.getIdentificativo();
                            System.out.println(gest + ":" + c.ChiamaProssimoCliente());
                            log.AggiungiChiamate(gest,ind,new Timestamp(System.currentTimeMillis()));
                        }
                    };break;
                    case 4 : System.out.println("In attesa: " + gestore.getBigliettiInAttesa());break;
                    case 5 :
                        for (int i =0; i<log.getChiamate().size();i++) {
                        System.out.println(log.getChiamate().get(i));
                    }break;
                }
            } while (scelta != 0);
        }

        public static void stampaMenu() {
            System.out.println("""
                1. Prenota biglietto normale
                2. Prenota biglietto prioritario
                3. Chiamata pazienti
                4. Visualizza utenti in coda
                5. Storico chiamate
                0. Esci
                """);
        }

