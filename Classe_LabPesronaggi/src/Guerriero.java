public class Guerriero extends Personaggio{

    private int resistenza;


    public Guerriero(String nome){
        super(nome,150,15,20,Arma.SPADA);
        resistenza = 20;
    }

    @Override
    public String toString() {
        return "Guerrirero = " + super.toString()  +
                " resisteza=" + resistenza +
                '}';
    }
}
