import java.util.Date;

public class Automobile {
    private String marca;
    private String modello;
    private int anno;
    private int km;
    public Automobile(){
        marca= "Ford";
        modello="Fiesta";
        anno=2020;
        km=15000;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +  "\n" +
        "Modello: " + modello +  "\n"+
        "Anno: " + anno + "\n" +
        "Chilometraggio: " + km;
    }
}
