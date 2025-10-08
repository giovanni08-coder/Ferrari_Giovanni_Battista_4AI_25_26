import java.util.ArrayList;
import java.util.List;

public class Studente {
    private String nome;
    private String cognome;
    private String matricola;
    private int annoIscrizione;
    private List<Float> l1= new ArrayList<Float>();


    public Studente(){
        nome="Giovanni Battista";
        cognome="Ferrari";
        matricola="83";
        annoIscrizione=2021;
    }
    public void Aggiungi_voto(float voto){
        if (voto<4 || voto>10) throw new IllegalArgumentException("non puoi inserire questo voto");
        else {
            l1.add(voto);
        }
    }
    public float CalcolaMedia(){
        float tot = 0;
        for (int i=0;i<l1.size();i++){
            tot= tot + l1.get(i);
        }
        return tot/ l1.size();
    }

    @Override
    public String toString() {
        return "Nome: " + nome +  "\n" +
                "Cognome: " + cognome +  "\n"+
                "Matricola: " + matricola + "\n" +
                "anno: " + annoIscrizione + "\n" +
                "Media: " + CalcolaMedia();
    }
}
