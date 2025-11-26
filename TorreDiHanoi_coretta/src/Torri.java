import java.util.Stack;

public class Torri {
    private Stack<Integer> stack;
    private final int ndischiPossibili;

    public Torri(final int ndischiPossibili){
        controllaNdischiPossibili(ndischiPossibili);
        this.ndischiPossibili = ndischiPossibili;
        stack = new Stack<>();

    }

    public Stack<Integer> getStack() {
        return stack;
    }

    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
    }

    public int getNdischiPossibili() {
        return ndischiPossibili;
    }
    public void controllaNdischiPossibili(final int ndischiPossibili){
        if (ndischiPossibili<0){
            throw new IllegalArgumentException("Non puoi inserire questo numero di dischi");
        }
    }
    public void InserisciDisco(int dim){
        if (dim<0 || dim> ndischiPossibili){
            throw new IllegalArgumentException("non puoi inserire questo disco");
        }
        stack.add(dim);
    }
    public int EliminaDisco(){
        stack.pop();
        return stack.peek();
    }
    public void Reset(){
        for (int i=0; i< stack.size(); i++){
            stack.remove(i);
        }
    }
    public boolean Vittoria(){
        if (stack.size()==ndischiPossibili){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Torri{" +
                "stack=" + stack +
                ", ndischiPossibili=" + ndischiPossibili +
                '}';
    }
}
