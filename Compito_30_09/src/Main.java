import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void Inserisci(List<String> a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean errore = true;
        while (errore) {
            errore=false;
            System.out.println("Scrivi l'utente che vuoi inserire");
            String nome = br.readLine();
            if (nome.length() != 0 && nome.matches("^[a-zA-Z\\s]*$")) {
                a.add(nome);
            } else {
                System.out.println("non puoi inserire questo nome poichè o hai inserito un numero o non hai inserito nulla ");
                errore=true;
            }
        }
    }

    //private static String [] iscritti = new String[10];
    //private static int conta =0;
    public static void stampaTutto(List<String>  a) throws IOException {
        System.out.println("----------- Archivio degli iscritti al ping-pong ------------ " + a.size() + " iscritti");
        if (a.size()== 0) {
            System.out.println("al momento non ci sono iscritti al campionato");
        } else {
            for (int i = 0; i < a.size(); i++) {
                System.out.println((i + 1) + " - " + a.get(i));
            }
        }
    }

    public static void Rimuovi(List<String> a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean errore=true;
        while (errore) {
            errore=false;
            if (a.size() == 0) {
                System.out.println("non puoi eliminare gli utenti perchè non ci sono");
            } else {
                System.out.println("quale utente vuoi eliminare,inserisci la posizione");
                String nome = br.readLine();
                int pos = Integer.parseInt(nome);
                if (pos >= a.size()) {
                    System.out.println("non puoi eliminare questo utente perchè quest'utente non esiste");
                    errore=true;
                } else {
                    a.remove(pos);
                }
            }
        }

    }

    public static void Modifica(List<String> a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean errore=true;
        while (errore) {
            errore=false;
            if (a.size() == 0) {
                System.out.println("non puoi modificare gli utenti perchè non ci sono");
            } else {
                System.out.println("quale utente vuoi modificare,inserisci la posizione");
                String nome = br.readLine();
                int pos = Integer.parseInt(nome);
                if (pos >= a.size()) {
                    System.out.println("non puoi eliminare questo utente perchè quest'utente non esiste");
                    errore=true;
                } else {
                    System.out.println("inserisci il nuovo iscritto");
                    String nome2 = br.readLine();
                    a.set(pos, nome2);
                }
            }
        }

    }

    public static void Cerca(List<String> a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (a.size()==0) {
            System.out.println("non puoi modificare gli utenti perchè non ci sono");
        }
        else {
            System.out.println("quale utente vuoi cercare,inserisci il nome");
            String nome = br.readLine();
            boolean pres = false;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).equals(nome)) {
                    System.out.println("il nome è presente");
                    pres = true;
                }
            }
        if (pres == false) {
            System.out.println("il nome non è presente");
        }

        }
    }

    public static void main(String[] args) throws IOException {
        List<String> li = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = " ";
        do {
            System.out.println("------- Menù --------");
            System.out.println("1_inserisci l'iscritto");
            System.out.println("2_visualizza tutti");
            System.out.println("3_cancella l'iscrizione");
            System.out.println("4_modifica l'iscrizione");
            System.out.println("5_cerca l'iscrizione");
            System.out.println("Q_esci dal programma");
            System.out.print("Cosa vuoi fare");
            s = br.readLine();
            switch (s) {
                case "1":
                    Inserisci(li);
                    break;

                case "2":
                    stampaTutto(li);
                    break;
                case "3":
                    Rimuovi(li);
                    break;
                case "4":
                    Modifica(li);
                    break;
                case "5":
                    Cerca(li);
                    break;
                case "Q":
                    System.out.println("bye,bye");
                    break;
                default:
                    System.out.println("scelta inesistente");
            }
        } while (s.equals("Q") == false);
    }
}

