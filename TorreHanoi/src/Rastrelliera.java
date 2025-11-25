import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Rastrelliera {
    private String nome;
    private Stack<Disco> stack = new Stack<Disco>();
    public final int numeroDischiPossibili;
    public Rastrelliera(final int numeroDischiPossibili,String nome){
        this.numeroDischiPossibili = numeroDischiPossibili;
        setNome(nome);
    }

    public void setNome(String nome) {
        if (!nome.matches("[A-Z]+")){
            throw new IllegalArgumentException("Non puoi inserire lettere o spazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void InserisciDisco(Rastrelliera rastrelliera,Disco disco){
        if (rastrelliera.stack.size()!=0 && disco.getDimensione() > rastrelliera.stack.getFirst().getDimensione()){
            throw new IllegalArgumentException("Non puoi inserire questo disco");
        }
        rastrelliera.stack.add(disco);
    }

    public void spostaDisco(Rastrelliera mittente, Rastrelliera ricevente){
        if (mittente == null ){
            throw new IllegalArgumentException("Non puoi togliere qualcosa che non c'è");
        }
            InserisciDisco(ricevente,mittente.stack.get(mittente.stack.size()-1));
            mittente.stack.pop();
    }
    public boolean RastrellieraCompleta(Rastrelliera rastrelliera){
        if (rastrelliera.stack.size() != numeroDischiPossibili){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rastrelliera{" +
                "nome='" + nome + '\'' +
                ", stack=" + stack +
                ", numeroDischiPossibili=" + numeroDischiPossibili +
                '}';
    }
}
