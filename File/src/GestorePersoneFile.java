import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;


public class GestorePersoneFile {
    public final static String NOME_FILE = "persone.txt";
    public final static String SEPARATORE = ";";

    public static void SalvaPersone(List<Persona> personedaSalvare) throws IOException {

        //creo il buffer writer
        BufferedWriter br = new BufferedWriter(new FileWriter(NOME_FILE));
        String personaTesto = "";

        //scorro le persone da salvare
        for (Persona p : personedaSalvare) {
            //creo stringa da salvare su file per ogni persona
            if (p.getC() == "Bambino") {
                personaTesto = p.getC() + SEPARATORE + p.getNome() + SEPARATORE + p.getCognome() + SEPARATORE + p.getEta() + SEPARATORE + ((Bambino) p).getData().toString();
            }
            if (p.getC() == "Universitario") {
                personaTesto = p.getC() + SEPARATORE + p.getNome() + SEPARATORE + p.getCognome() + SEPARATORE + p.getEta() + SEPARATORE + ((Laureato) p).getMateriaUniversitaria();
            }
            if (p.getC() == "Persona") {
                personaTesto = p.getC() + SEPARATORE + p.getNome() + SEPARATORE + p.getCognome() + SEPARATORE + p.getEta();
            }
            //scrivo il file
            br.write(personaTesto);
            //metto un a capo su file
            br.newLine();
        }
        br.close();
    }

    public static List<Persona> caricaPersone() throws IOException {
        List<Persona> lista = new ArrayList<>();
        //creo un buffer reader
        BufferedReader br = new BufferedReader(new FileReader(NOME_FILE));
        List<String> righe;
        righe = br.readAllLines();

        //invece di fare br.readAllLines fai:
        //while(stringa = br.lines() !=null){
        //fai tutto quello che ho fatto io
        for (String riga : righe) {
            //leggo il file fino all'ultima riga
            if (riga.split(SEPARATORE)[0] == "Laureato") {
                String nome = riga.split(SEPARATORE)[1];
                String cognome = riga.split(SEPARATORE)[2];
                int eta = Integer.parseInt(riga.split(SEPARATORE)[3]);
                String materia = riga.split(SEPARATORE)[4];
                try {
                    Laureato l = new Laureato(nome, cognome, eta, materia);
                    lista.add(l);
                } catch (Exception e) {
                    System.out.println("errore alla riga" + riga);
                }
            }
            if (riga.split(SEPARATORE)[0] == "Bambino") {
                String nome = riga.split(SEPARATORE)[1];
                String cognome = riga.split(SEPARATORE)[2];
                int eta = Integer.parseInt(riga.split(SEPARATORE)[3]);
                LocalDate data = LocalDate.parse(riga.split(SEPARATORE)[4]);
                try {
                    Bambino b = new Bambino(nome, cognome, eta, data);
                    lista.add(b);
                } catch (Exception e) {
                    System.out.println("errore alla riga" + riga);
                }
            } else {
                String nome = riga.split(SEPARATORE)[1];
                String cognome = riga.split(SEPARATORE)[2];
                int eta = Integer.parseInt(riga.split(SEPARATORE)[3]);
                try {
                    Persona p = new Persona(nome, cognome, eta);
                    lista.add(p);
                } catch (Exception e) {
                    System.out.println("errore alla riga" + riga);
                }

            }

            //per ogni riga eseguo la split sul carattere "|"
            //prendo le 3 informazioni, e creo una Person
        }
        br.close();
        return lista;
        //chiudo il buffer reader
    }

    public static void binario() throws Exception {
        // Convert the string to a
        // byte array.
        try {

            // Writing to binary file
            OutputStream Stream = new FileOutputStream("data.bin");
            Stream.write(new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F});

            // ASCII values for "Hello"
            Stream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
