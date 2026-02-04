import java.util.ArrayList;
import java.util.List;

public class Zombie extends Personaggio{

    private List<Personaggio> kill;

    public Zombie(String nome){
        super(nome,50,200,50,Arma.PUGNO);
        kill = new ArrayList<>();
    }

    public void cattura(Personaggio p){
        kill.add(p);
    }

    public void attacco(Personaggio p){
        p.setVita(p.getVita()- this.getDanni());
    }

    @Override
    public String toString() {
        String stringa= "";
        for (int i=0;i<kill.size();i++){
            stringa += kill.get(i);
        }
        return super.toString() + "Zombie{" +
                "kill=" + stringa +
                '}';
    }
}
