 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* variabili tipi (stringhe:date nome,per mettere maiuscole,minuscole,spazi dividerle, cicli,
if else..., funzioni,try catch,operazioni, confronti,  */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class Main {
    public static void benvenuto(String nome){
        System.out.println("Benvenuto/a " + nome);
        switch (nome){
            case "Mario" : System.out.println("L'eroe di un fantastico gioco") ;break;
            case "Luigi" : System.out.println("Il cugino dell'eroe di un fantastico gioco"); break;
            case "Goku" : System.out.println("anime jap");break;
            case "Luffy" :System.out.println("il capitano pirata");break;
            default:System.out.println("benvenuto anche se non ti conosco");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("come ti chiami?");
        //String nome = br.readLine();
        //benvenuto(nome);
        System.out.println("Inserisci un numero intero positivo !!");
        String s = br.readLine(); //mi fa mettere una stringa
        try {
            int n = Integer.parseInt(s); //la trasformo in intero
            // lo uso quando so le quantità
            // for (inizializzazione ; condizione di terminazione; incremento){
            //   istruzioni
            // }
            // for each se devo prendere tutto
            for(int conta = 0;conta < n; conta= conta + 3){
                System.out.println(conta + " a ");
            }
            // while è condizionata, se non c'è l'ho all'interno della condizioni (condizione a priori falsa
            //essa non fa nulla
            // inizializzazione
            //while (condizione di terminazione){
            // istruzioni, ricordati di scrivere l'incrementi
            // }
            int conts=0;
            while (conts<n){
                System.out.println("x");
                conts = conts + 3;
            }
            // do while post condizionato, se non c'è l'ho all'interno della condizioni (condizione a priori falsa
            //essa lo fa almeno una volta
            // inizializzazione
            // do{
            //istruzioni
            //  incremento;
            // }while(condizione di terminazione);

            conts=0;
            do{
                System.out.println("#");
                conts=conts + 3;
            }while(conts < n);
            if (n > 0) {
                System.out.println("il quadrato di " + n + " è " + (n * n));
            } else {
                if (n == 0) {
                    System.out.println("Furbo \uD83E\uDD18!!! il quadrato di è quadrato");
                }
                System.out.println(" I numeri negati mi annoiano");
            }
        } catch (Exception e) {
            System.out.println("ti ho chiesto un numero intero!!");
        }

    }
     static int FaiQualcosa(){
        int num = 12;
        String n= "jhon";
        System.out.println(n);
        return 5;
    }

}
/*
1) tipologia numero 1° di input utente
//istazio il buffer utile a leggere dalla console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  riga che mi serve per scrivere una riga di testo
        e leggere l'input da noi messo
        System.out.println("Inserisci un numero intero positivo !!");
String s = br.readLine(); //mi fa mettere una stringa
            try {
int n = Integer.parseInt(s); //la trasformo in intero
                if (n > 0) {
        System.out.println("il quadrato di " + n + " è " + (n * n));
        } else {
        if (n == 0) {
        System.out.println("Furbo \uD83E\uDD18!!! il quadrato di è quadrato");
                    }
                            System.out.println(" I numeri negati mi annoiano");
                }
                        } catch (Exception e) {
        System.out.println("ti ho chiesto un numero intero!!");
            }






2) tipologia numero 2° di input utente
int somma = 0;
        for (int i = 1; i <= 5; i++) {


            //System.out.println("i = " + i);
            String s1 = IO.readln("inserire un numero"); forma contratta per scrivere una riga di testo
            int n = Integer.parseInt(s1);
            somma =somma+n;
        }
        IO.println("il totale è :" +  somma);






3) fare l'input utente 3° modo
        e leggere l'input da noi messo
        System.out.println("Costrutti!!");
        System.out.print("metti una stringa");
        Scanner scanner = new Scanner(System.in); // crea un oggetto Scanner per leggere da tastiera
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt(); // legge un intero inserito dall'utente
        scanner.nextLine();
        System.out.println("Hai inserito: " + numero);
        scanner.close(); // chiude lo scanner
        if (numero>0){
            for (int conta=1; conta<=numero; conta++){
                System.out.println(conta);
            }
        }
        else {
            System.out.println("numero non valido");
        }

        FaiQualcosa();
        String nome="SuperMario";
        System.out.println(nome);


String capitalize(String s){
    for (int i=0;i<s.lenght();i++;){
        if i==0 or i-1==" "{
            Character mioCharacter = new Character(i);
            i=i.toUpperCase()
        }
    }
}

String s1 = IO.readln("inserisci una frase");
    //string b= capitalize(String s1);
    //I0.printl(b);




        */