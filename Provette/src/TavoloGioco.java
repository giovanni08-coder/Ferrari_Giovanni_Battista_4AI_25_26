import java.util.ArrayList;
import java.util.List;

public class TavoloGioco {
    private int numero_provette;
    private List<Provetta> provette = new ArrayList<>();

    public TavoloGioco(int numero_provette){
        setNumero_provette(numero_provette);
    }

    public void setNumero_provette(int numero_provette) {
        if (numero_provette<=2){
            throw new IllegalArgumentException("non puoi inserire provette minori di 2 ");
        }
        this.numero_provette = numero_provette;
    }

    public int getNumero_provette() {
        return numero_provette;
    }

    public void spostaColore(Provetta mittente, Provetta ricevente){
        ricevente.AggingiColore(mittente.getColori().get(mittente.getColori().size()-1));
        mittente.RimuoviColore();
    }
    public boolean ProvettaPiena(Provetta provetta) {
        if (provetta.isPiena() && (provetta.getColori().get(0) == provetta.getColore() &&
                provetta.getColori().get(1) == provetta.getColore() && provetta.getColori().get(2) == provetta.getColore() &&
                provetta.getColori().get(3) == provetta.getColore())) {
            return true;
        }
        return false;
    }
}
