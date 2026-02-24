import java.util.ArrayList;
import java.util.List;

public abstract class Frutto {
    private String id;
    private  String nome;
    private boolean rischioAllergia;
    public static List<String> listaId;
    public Frutto(String id, String nome, boolean rischioAllergia) {
        listaId = new ArrayList<String>();
        setId(id);
        setNome(nome);
        this.rischioAllergia = rischioAllergia;
    }

    private void setNome(String nome) {
        if ((nome.length()<3 || nome.length()>15) || !(nome.matches("^[a-zA-Z]*$")) ){
            throw new IllegalArgumentException("Non puoi inserire questo nome");
        }
        this.nome = nome;
    }
    private void setId(String id){
        if (id.length()>6 || !(id.matches("^[A-Z]{2}[1-9]{2}[A-Z]{2}$")) || listaId.contains(id)){
            throw new IllegalArgumentException("Non puoi inserire questo id");
        }
        this.id = id;
        listaId.add(id);
    }

    public boolean isRischioAllergia() {
        return rischioAllergia;
    }

    public double ScontoMax(){
        return 0;
    }

    @Override
    public String toString() {
        return "Frutto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", rischioAllergia=" + rischioAllergia +
                '}';
    }
}
