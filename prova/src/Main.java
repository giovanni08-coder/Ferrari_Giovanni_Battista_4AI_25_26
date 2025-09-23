public class ZainoApp {  // Nome della tua classe (cambia se necessario)

    // Variabile "globale" statica: condivisa tra tutti i metodi
    private static int conta = 1;  // Inizializzata a 1 (poiché oggetti[0] è già occupato)

    // Il tuo array oggetti può anche essere statico se vuoi condividerlo
    private static String[] oggetti = new String[10];

    static {
        // Inizializza l'array all'avvio della classe
        oggetti[0] = "Ba";
    }

    // I tuoi metodi rimangono statici, ma ora accedono direttamente a 'conta' e 'oggetti'

    static public void Menu() {
        System.out.println("premi 1 per inserire un oggetto");
        System.out.println("premi 2 per eliminare un oggetto");
        System.out.println("premi 3 per modificare un oggetto");
        System.out.println("premi 4 per visualizzare tutti gli oggetti");
        System.out.println("premi 0 per uscire");
    }

    static public void Stampa() {  // Non serve più passare parametri
        System.out.println("----------- Archivio di oggetti nello zaino ------------ ");
        for (int i = 0; i < oggetti.length; i++) {
            if (oggetti[i] == null) {
                break;
            } else {
                System.out.println((i + 1) + " - " + oggetti[i]);
            }
        }
    }

    static public void Inserimento() {  // Non passa più parametri
        // Controlla se l'array è pieno
        if (conta >= oggetti.length) {
            System.out.println("Zaino pieno! Non puoi inserire altri oggetti.");
            return;
        }

        boolean flag = true;
        while (flag) {
            String s1 = IO.readln("inserisci l'oggetto ");
            if (s1.length() != 0 && s1.matches("^[a-zA-Z\\s]*$")) {
                oggetti[conta] = s1;  // Usa direttamente 'conta'
                conta = conta + 1;    // Aggiorna la variabile globale
                flag = false;
                System.out.println("Oggetto inserito con successo!");
            } else {
                System.out.println("non puoi inserire questo nome poichè o hai inserito un numero o non hai inserito nulla ");
            }
        }
    }

    static public void Remouve() {  // Esempio di rimozione che aggiorna 'conta'
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                String s2 = IO.readln("inserire l'oggetto che vuoi eliminare (partendo dall'1)");
                int n = Integer.parseInt(s2);
                if (n <= 0 || n > conta) {  // Controlla bounds
                    System.out.println("Indice non valido (deve essere tra 1 e " + conta + ")");
                    flag = true;
                } else {
                    // Sposta gli elementi
                    for (int i = n - 1; i < conta - 1; i++) {
                        oggetti[i] = oggetti[i + 1];
                    }
                    oggetti[conta - 1] = null;  // Pulisci l'ultimo slot
                    conta = conta - 1;  // Aggiorna la variabile globale
                    System.out.println("Oggetto eliminato con successo!");
                }
            } catch (Exception e) {
                System.out.println("Ti ho detto che voglio un numero intero");
                flag = true;
            }
        }
        // Stampa la lista aggiornata
        Stampa();
    }

    // Similmente per Modified() e altri metodi: usa direttamente 'oggetti' e 'conta'

    static public void Modified() {
        // ... (adatta il codice per usare direttamente 'oggetti' e 'conta')
        // Esempio: a[n-1] = s1;  // Non cambia 'conta'
    }

    // Il main() ora è più semplice: non passa parametri
    public static void main(String[] args) {  // Deve essere public static
        boolean errore = true;
        while (errore) {
            Menu();
            try {
                String s2 = IO.readln("Inserire un numero da 0 a 4 per scegliere la modalità voluta: ");
                int n = Integer.parseInt(s2);

                switch (n) {  // Usa switch per chiarezza
                    case 1:
                        Inserimento();
                        break;
                    case 2:
                        Remouve();
                        break;
                    case 3:
                        Modified();
                        break;
                    case 4:
                        Stampa();
                        break;
                    case 0:
                        errore = false;
                        break;
                    default:
                        if (n > 4 || n < 0) {
                            System.out.println("Scelta non valida! Riprova.");
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido!");
            }
        }
        System.out.println("Uscita dal programma.");
    }
}
