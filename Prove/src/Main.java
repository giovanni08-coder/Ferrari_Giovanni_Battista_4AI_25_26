import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Macchine> parco = new ArrayList<>();
        parco.add(new Macchine("AB123CD", "Fiat", "Panda", 2015));
        parco.add(new Macchine("AB123CD", "la", "la", 2015));
        parco.add(new Macchine("ZZ000AA", "Volkswagen", "Golf", 2019));
        parco.add(new Macchine("AA999ZZ", "Toyota", "Yaris", 2021));
        parco.add(new Macchine("BA321DC", "Renault", "Clio", 2017));

        System.out.println("Prima dell'ordinamento:");
        parco.forEach(System.out::println);

        System.out.println(parco.get(0).getTarga().compareTo(parco.get(2).getTarga()));
        System.out.println(parco.get(0).equals(parco.get(1)));
        // Ordina per targa usando compareTo
        Collections.sort(parco);

        System.out.println("\nDopo l'ordinamento (per targa):");
        parco.forEach(System.out::println);

        /*
        // Confronto diretto tra due auto
        Auto a1 = new Auto("AB123CD", "Fiat", "Panda", 2015);
        Auto a2 = new Auto("BA321DC", "Renault", "Clio", 2017);
        int cmp = a1.compareTo(a2);

        System.out.println("\nConfronto targhe:");
        if (cmp < 0) {
            System.out.println(a1.getTarga() + " viene prima di " + a2.getTarga());
        } else if (cmp > 0) {
            System.out.println(a1.getTarga() + " viene dopo " + a2.getTarga());
        } else {
            System.out.println("Le targhe sono uguali");
        }*/
    }
}