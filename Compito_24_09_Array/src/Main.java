//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int conta = 0;

    private static String[] oggetti = new String[10];


    static public void Menu() {
        System.out.println("premi 1 per inserire un oggetto");
        System.out.println("premi 2 per eliminare un oggetto");
        System.out.println("premi 3 per modificare un oggetto");
        System.out.println("premi 4 per visualizzare tutti gli oggetti");
        System.out.println("premi 0 per uscire");
    }

    static public void Stampa() {
        System.out.println("----------- Archivio di oggetti nello zaino ------------ " + conta + " oggetti");
        for (int i = 0; i < oggetti.length; i++) {
            if (oggetti[i] == null) {
                break;
            } else {
                System.out.println((i + 1) + " - " + oggetti[i]);

            }
        }

    }

    static public int Inserimento() {
        boolean flag = true;
        while (flag) {
            String s1 = IO.readln("inserisci l'oggetto ");
            if (s1.length() != 0 && s1.matches("^[a-zA-Z\\s]*$")) {
                oggetti[conta] = s1;
                conta = conta + 1;
                flag = false;
            } else {
                System.out.println("non puoi inserire questo nome poichè o hai inserito un numero o non hai inserito nulla ");
            }
        }
        return conta;
    }

    static public int Remouve() {
        boolean flag = true;
        while (flag) {
            flag = false;
            if (conta == 0) {
                System.out.println("non puoi fare questa operazione poichè non ci sono elementi presenti");
                break;
            } else {
                try {
                    String s2 = IO.readln("inserire l'oggetto che vuoi eliminare (partendo dall'1)");
                    int n = Integer.parseInt(s2);

                    if (n <= 0 || n > conta) {
                        System.out.println("non puoi mettere un indice negativo, zero o maggiore del numero di elementi");
                        flag = true;
                    } else {
                        for (int i = n - 1; i < conta - 1; i++) {
                            oggetti[i] = oggetti[i + 1];
                        }
                        oggetti[conta - 1] = null;
                        conta = conta - 1;
                    }
                } catch (Exception e) {
                    System.out.println("Ti ho detto che voglio un numero intero");
                    flag = true;
                }
            }
        }
        for (int i = 0; i < oggetti.length; i++) {
            if (oggetti[i] == null) {
                break;
            } else {
                System.out.println((i + 1) + " - " + oggetti[i]);
            }
        }
        return conta;

    }

    static public void Modified() {
        boolean errore = true;
        boolean flag = true;
        while (flag) {
            flag = false;
            if (conta == 0) {
                System.out.println("non puoi fare questa operazione poichè non ci sono elementi presenti");
                break;
            }
            else {
                try {
                    String s2 = IO.readln("inserire un l'oggetto che vuoi modificare (partendo dall'1): ");
                    int n = Integer.parseInt(s2);
                    if (n <= 0 || n > conta) {
                        System.out.println("non puoi mettre un indice negativo o uguale a zero");
                        flag = true;
                    } else {
                        while (errore) {
                            errore = false;
                            String s1 = IO.readln("inserisci il nuovo ogetto: ");
                            if (s1.length() != 0 && s1.matches("^[a-zA-Z\\s]*$")) {
                                oggetti[n - 1] = s1;
                                for (int i = 0; i < oggetti.length; i++) {
                                    if (oggetti[i] == null) {
                                        break;
                                    } else {
                                        System.out.println((i + 1) + " - " + oggetti[i]);

                                    }
                                }
                            } else {
                                System.out.println("non puoi inserire questo nome poichè o hai inserito un numero o non hai inserito nulla");
                                errore = true;
                            }
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Ti ho detto che voglio un numero intero");
                    flag = true;
                }
            }

        }
    }

    void main() {

        boolean errore = true;
        while (errore) {
            Menu();
            String s2 = IO.readln("Inserire un numero da 0 a 4 per scegliere la modalità voluta: ");
            int n = Integer.parseInt(s2);
            if (n == 1) {
                Inserimento();
            }
            if (n == 2) {
                Remouve();
            }
            if (n == 3) {
                Modified();
            }
            if (n == 4) {
                Stampa();
            }
            if (n == 0) {
                errore = false;
            }
            if (n > 4) {
                errore = true;
            }
        }
    }
}



