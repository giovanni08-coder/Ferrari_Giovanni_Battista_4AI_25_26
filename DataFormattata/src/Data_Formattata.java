import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public abstract class Data_Formattata {
    protected int giorno;
    protected int mese;
    protected int anno;
    public Data_Formattata(int giorno,int mese,int anno){
        setAnno(anno);
        setGiorno(giorno);
        setMese(mese);
    }

    public int getGiorno() {
        return giorno;
    }

    private void setGiorno(int giorno) {
        List<Integer> trenta= Arrays.asList(4,6,9,11);
        if (giorno<=0 || giorno>31){
            throw new IllegalArgumentException("Non puoi inserire il giorno negativo");
        }
        if (trenta.contains(getMese()) && (giorno>30)){
            throw new IllegalArgumentException("non puoi inserire questo giorno");
        }
        if (getMese()==2 && giorno>28){
            throw new IllegalArgumentException("non puoi inserire questo giorno");
        }
        this.giorno = giorno;
    }

    public int getMese() {
        return mese;
    }

    private void setMese(int mese) {
        if (mese<=0 || mese>12){
            throw new IllegalArgumentException("non puoi inserire questo mese");
        }
        this.mese = mese;
    }

    public int getAnno() {
        return anno;
    }

    private void setAnno(int anno) {
        if (anno<0 || anno>2026){
            throw new IllegalArgumentException("non puoi inserire questo anno");
        }
        if (anno>=0 && anno<=26){
            anno+=2000;
        }
        this.anno = anno;
    }

    public abstract String stringaFormattata();
}
