import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Gestore {
    private Queue<String> codaNormali;
    private Queue<String> codaPrioritari;
    private int progressivoNormali;
    private int progressivoPrioritari;
    private int CCN;

    public Gestore(LogChiamate l) {
        this.progressivoNormali = 0;
        this.progressivoPrioritari = 0;
        this.CCN=0;
        codaNormali = new LinkedList<String>();
        codaPrioritari = new LinkedList<String>();
    }
    public void emettiBigliettoNormale(){
        codaNormali.add("N"+progressivoNormali);
        progressivoNormali++;
        System.out.println(codaNormali);
    }
    public void emettiBigliettoPtioritario(){
        codaPrioritari.add("P"+progressivoPrioritari);
        progressivoPrioritari++;
        System.out.println(codaPrioritari);
    }
    public String chiamaBiglietto(){
        if (codaNormali.isEmpty() || CCN>=2){
            if (!codaPrioritari.isEmpty()){
                CCN=0;
                return codaPrioritari.remove();
            }
        }
        if (!codaNormali.isEmpty()){
            CCN+=1;
            return codaNormali.remove();
        }
        return "Nessuno è in attesa";
    }
    public List<String> getBigliettiInAttesa() {
        List<String> lista = new ArrayList<>();
        lista.addAll(codaPrioritari);
        lista.addAll(codaNormali);
        return lista;
    }
}
