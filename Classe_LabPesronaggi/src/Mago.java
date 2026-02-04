import com.sun.source.tree.UsesTree;

import java.util.Random;

public class Mago extends Personaggio{
    private int aura;
    private Tipo tipo;
    private enum Tipo{
        GHIACCIO,FUOCO,ELETTRICO
    }
    public Mago(String nome){
        super(nome,150,50,20,Arma.BACHETTAMAGICA);
        aura=1;
        RandomTipo();
    }

    private void RandomTipo(){
        Random n = new Random();
        int numero = n.nextInt(1,3);
        switch (numero){
            case 1:
                tipo = Tipo.ELETTRICO;
                break;
            case 2:
                tipo =Tipo.FUOCO;
                break;
            case 3:
                tipo = Tipo.GHIACCIO;
                break;
        }
    }

    @Override
    public String toString() {
        return "Mago = " + super.toString()  +
                " aura=" + aura +
                ", tipo=" + tipo +
                '}';
    }
}
