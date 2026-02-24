package Figure;

public class Quadrato extends FiguraGeometrica {
    @Override
    public float area() {
        return 0;
    }

    public Quadrato(float lunghezzaLato){
        super(3,lunghezzaLato);
    }
    public void fallo(){
        setNumeroLati(2);
        super.setNumeroLati(2);
    }



}

