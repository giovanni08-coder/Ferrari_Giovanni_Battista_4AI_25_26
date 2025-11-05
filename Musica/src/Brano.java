import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import  java.util.Random;
import java.util.*;
public class Brano {
    private String titolo;
    private String autore;
    private int anno;
    private int copieVendute;
     static Map<String, List<String>> dizionario = new HashMap<>();


    public String get_titolo(){
        return titolo;
    }

    public void setTitolo(String t){
        if (t.length() == 0) throw new IllegalArgumentException("Il titolo non può essere vuoto");
        titolo= t;
    }
    public String get_Artista(){
        return autore;
    }

    public void setArtista(String a){
        if (a.length() < 2) throw new IllegalArgumentException("Il nome dell'artista non può essere minore di 2 caratteri");
        autore= a;
    }
    public int getAnno(){
        return anno;
    }
    public void setAnno(int a) {
        if (a> LocalDate.now().getYear()) throw new IllegalArgumentException("Non si accettano bravi che verranno in futuro");
        anno = a ;
    }
    public int getCopieVendute(){
        return copieVendute;
    }
    public void setCopieVendute(int c) {
        if (c < 0) throw new IllegalArgumentException("le copie vendute non possono essere minori di 0");
        copieVendute = c;
    }
    public Classifica getriconoscimento(){
        Classifica c = Classifica.NESSUNA;
        if (copieVendute <=1000) c =Classifica.LEGNO;
        if (copieVendute> 100000 && copieVendute<=250000) c= Classifica.ARGENTO;
        if (copieVendute>250000 && copieVendute<=500000) c= Classifica.ORO;
        if (copieVendute>500000)c= Classifica.PLATINO;
        return c;
    }
    public int getEta(){
        return anno - LocalDate.now().getYear();
    }
    public Brano(String t, int ann, int c, String a){
        setAnno(ann);
        setArtista(a);
        setTitolo(t);
        setCopieVendute(c);
    }

    static public Brano creaBrano(){
         Random r = new Random();
        String[] artisti = {"DjOne", "BlueDragon", "BasicSound"};
        String dj = artisti[r.nextInt(artisti.length)];
        Brano b = new Brano ("Br01",LocalDate.now().getYear(),30,dj);
        return b;
    }
    static public void AggiungiBrano(Brano b){
        for (int i =0; i<artisti.toArray().length; i++ ){
            for (int j=0;j<artisti.get(i).toArray().length;j++){
                if (b.autore ==  && b.titolo == ){
                    throw new IllegalArgumentException("non puoi inserire una brano con autore e titolo uguali ");
                }
            }
        }
        dizionario.put(b.autore, Arrays.asList(b.titolo,String.valueOf(b.anno), String.valueOf(b.copieVendute)));
    }

    @Override
    public String toString() {
        return autore + " - " + titolo + " ( " + anno + " copie: " + copieVendute  + " )";
    }
}
