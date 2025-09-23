import java.io.InputStreamReader;
import java.io.InputStreamReader;
public class Main {
    static private String[] iscritti = new String[4];
    static private int conta=0;
    static private int canc=0;
    static public void Stampa(String [] a,int s) {
        System.out.println("----------- Archivio iscritti al campionato ------------ " + s + " iscritti");
        if (s==0){
            System.out.println("Al momento non ci sono iscritti all'archivio");
        }
        else {
            for (int i = 0; i < s; i++) {
                System.out.println((i + 1) + " - " + a[i]);
            }
        }

    }
    static  public void Inserimento(String [] a){
        int quanti=0;
        String s1 = IO.readln("inserisci il nome dello studente");
        if(s1 != "" || s1.matches("^[a-zA-Z\\s]*$")){
            a[quanti]=s1;
            quanti=quanti+1;
        }
        else{
            System.out.println("non puoi inserire questo nome ");
        }

    }

    void main() {
        iscritti[0] = "Ba";
        iscritti[1]="Viganò";
        iscritti[2]="Harid";
        System.out.println(iscritti[2]);;
        conta =3;
        String s1 = IO.readln("inserisci il nome dello studente");
        if (s1==""){
            System.out.println("non puoi inserire questo nome ");
        }
        else{
            if(s1 != "" || s1.matches("^[a-zA-Z\\s]*$")) {
                iscritti[conta] = s1;
            }
        }
        Stampa(iscritti,conta);



    }
}

