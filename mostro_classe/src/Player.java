import java.util.ArrayList;
import java.util.List;

public class Player {

    private String nome;
    private String nickname;
    private String id;
    static private List<String> l1= new ArrayList<String>();

    public void setNome(String nome){
        if (nome.length()<4) throw new IllegalArgumentException("Nome non valido");
        if (nome.matches("[a-zA-Z]+")==false) throw new IllegalArgumentException("Caratteri non amessi");
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }
    public Player(){
        nome = "Supermario";
    }
    public void setId(String id){
        if (l1.contains(id) == true)throw new RuntimeException("l'ID è già presente");
        else{
            l1.add(id);
            this.id=id;
        }
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Player(" + id + "):" + nickname + " [" + nome +  "]";
    }
}
