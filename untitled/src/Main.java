import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int Inserisci(String[]a,int s)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (s==a.length){
            System.out.println("Archivio pieno");
        }
        else {
            System.out.println("nuovo iscritto");
            String nome= br.readLine();
            a[s]=nome;
            s++;
        }
        return s;
    }
    //private static String [] iscritti = new String[10];
    //private static int conta =0;
    public static void stampaTutto(String[] a , int s)throws IOException{
        System.out.println("----------- Archivio degli iscritti al ping-pong ------------ " + s + " iscritti");
        if(s==0){
            System.out.println("al momento non ci sono iscritti al campionato");
        }
        else {
            for (int i=0;i<s;i++){
                System.out.println((i + 1) + " - " + a[i]);
            }
        }
    }
    public static int Rimuovi(String[] a , int s)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("quale utente vuoi eliminare,inserisci la posizione");
        String nome= br.readLine();
        int pos = Integer.parseInt(nome);
        if (pos>=s){
            System.out.println("non puoi inserire questo");
        }
        else {
            a[pos]=a[s-1];
            s = s - 1;
        }

        return s ;
    }
    public static int Modifica(String[] a , int s)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("quale utente vuoi modifica,inserisci la posizione");
        String nome= br.readLine();
        int pos = Integer.parseInt(nome);
        if (pos>=s){
            System.out.println("non puoi inserire questo");
        }
        else {
            System.out.println("inserisci il nuovo iscritto");
            String nome2= br.readLine();
            a[pos]=nome2;
        }

        return s ;
    }
    public static void Cerca(String[] a , int s)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("quale utente vuoi modifica,inserisci la posizione");
        String nome= br.readLine();
        boolean pres=false;
        for (int i=0;i<s;i++){
            if(a[i].equals(nome)){
                System.out.println("il nome è presente");
                pres=true;
            }
        }
        if (pres==false){
            System.out.println("il nome non è presente");
        }
    }
        public static void main(String[] args) throws IOException  {
        String [] iscritti = new String[10];
        int conta =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        iscritti[0]="Ferrari";
        iscritti[1]="Tornatola";
        iscritti[2]="Silvestri";
        conta=3;
        String s=" ";
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
                case "1":conta=Inserisci(iscritti,conta);break;
                case "2":stampaTutto(iscritti,conta);break;
                case "3":conta = Rimuovi(iscritti,conta);break;
                case "4":Modifica(iscritti,conta);break;
                case "5":Cerca(iscritti,conta);break;
                case "Q":
                    System.out.println("bye,bye");
                    break;
                default:
                    System.out.println("scelta inesistente");
            }
        }while(s.equals("Q")==false);
    }

}