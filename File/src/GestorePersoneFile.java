import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorePersoneFile {
    public final static String NOME_FILE = "persone.txt";
    public final static String SEPARATORE = ";";
    public static void SalvaPersone(List<Persona> personedaSalvare) throws IOException{

        //creo il buffer writer
        BufferedWriter br = new BufferedWriter(new FileWriter(NOME_FILE));
        String personaTesto="";

        //scorro le persone da salvare
        for (Persona p: personedaSalvare){
            //creo stringa da salvare su file per ogni persona
            if (p instanceof Bambino){
                personaTesto =p.getC() + SEPARATORE + p.getNome() + SEPARATORE + p.getCognome() + SEPARATORE + p.getEta() + SEPARATORE  + ((Bambino) p).getPipi();
            }
            if (p instanceof Laureato){
                personaTesto =p.getC() + SEPARATORE + p.getNome() + SEPARATORE + p.getCognome() + SEPARATORE + p.getEta() + SEPARATORE  + ((Laureato) p).getMateriaUniversitaria();
            }
            else {
                personaTesto =p.getC() + SEPARATORE + p.getNome() + SEPARATORE + p.getCognome() + SEPARATORE + p.getEta();
            }
            //scrivo il file
            br.write(personaTesto);
            //metto un a capo su file
            br.newLine();
        }
        br.close();
}

    public static List<Persona> caricaPersone() throws IOException{
        List<Persona> lista= new ArrayList<>();
        //creo un buffer reader
        BufferedReader br = new BufferedReader(new FileReader(NOME_FILE));
        List<String> righe;
        righe = br.readAllLines();

        //invece di fare br.readAllLines fai:
        //while(stringa = br.lines() !=null){
        //fai tutto quello che ho fatto io
        for (String riga:righe){
        //leggo il file fino all'ultima riga
            if(riga.split(SEPARATORE)[0]=="Laureato"){
                String nome =riga.split(SEPARATORE)[1] ;
                String cognome = riga.split(SEPARATORE)[2];
                int eta = Integer.parseInt(riga.split(SEPARATORE)[3]);
                String materia = riga.split(SEPARATORE)[4];
                Laureato l = new Laureato(nome,cognome,eta,materia);
                lista.add(l);
            }
            if (riga.split(SEPARATORE)[0]=="Bambino"){
                String nome =riga.split(SEPARATORE)[1] ;
                String cognome = riga.split(SEPARATORE)[2];
                int eta = Integer.parseInt(riga.split(SEPARATORE)[3]);
                int pipi = Integer.parseInt(riga.split(SEPARATORE)[4]);
                Bambino b = new Bambino(nome,cognome,eta,pipi);
                lista.add(b);
            }
            else {
                String nome = riga.split(SEPARATORE)[1];
                String cognome = riga.split(SEPARATORE)[2];
                int eta = Integer.parseInt(riga.split(SEPARATORE)[3]);
                Persona p = new Persona(nome, cognome, eta);
                lista.add(p);
            }

            //per ogni riga eseguo la split sul carattere "|"
            //prendo le 3 informazioni, e creo una Person
        }
        br.close();
        return lista;
        //chiudo il buffer reader
    }
}
