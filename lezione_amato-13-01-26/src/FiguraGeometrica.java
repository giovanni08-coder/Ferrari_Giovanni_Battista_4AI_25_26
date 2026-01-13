public class FiguraGeometrica {
    private int nLati;
    private float lunghezzaLati;
    public FiguraGeometrica(int nLati,float lunghezzaLati){
        setnumeroLati(nLati);
        this.lunghezzaLati=lunghezzaLati;
    }
    public float perimetro(){
        return nLati*lunghezzaLati;
    }

    private void setnumeroLati( int nLati){
        if (nLati<0){
            throw new IllegalArgumentException("Non puoi inserire il numero dei lati negativo");
        }
        this.nLati=nLati;
    }
}
