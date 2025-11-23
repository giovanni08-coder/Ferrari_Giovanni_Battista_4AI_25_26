import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class Provetta {
    private String colore;
    private Stack<String> colori;
    public final int colortot;
    public Provetta(String colore,int colortot){
        this.colore=colore;
        colori = new Stack<>();
        this.colortot = colortot;
    }
    public void AggingiColore(String colore){
        if (colori.get(colori.size()-1) != colore){
            throw new IllegalArgumentException("Non puoi inserire questo colore");
        }
        if (colori.size() >= colortot-1){
            throw new IllegalArgumentException("Non puoi più inserire un colore");
        }
        colori.add(colore);
    }
    public void RimuoviColore(){
        if (colori.size()==0){
            throw new IllegalArgumentException("Non puoi togliere un elemento se non ci sono colori");
        }
        colori.pop();
    }
    public boolean isPiena(){
        if (colori.size()==colortot){
            return true;
        }
        return false;
    }
    public boolean isVuota(){
        if (colori.size()==0){
            return true;
        }
        return false;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public Stack<String> getColori() {
        return colori;
    }

    public void setColori(Stack<String> colori) {
        this.colori = colori;
    }

}
