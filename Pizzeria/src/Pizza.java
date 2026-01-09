import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String nome;
    private float costo;

    public Pizza(String nome,int costo){
        setNome(nome);
        setCosto(costo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        List<String> lista = Arrays.asList("Margherita", "Diavola", "Americana","nulla");
        if (!lista.contains(nome)){
              throw new IllegalArgumentException("non puoi inserire una pizza non esistente nel MENU");
        }
        this.nome = nome;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        if (costo<0 || costo>10){
            throw new IllegalArgumentException("non puoi inserire la pizza con questo prezzo");
        }
        this.costo = costo;
    }
}
