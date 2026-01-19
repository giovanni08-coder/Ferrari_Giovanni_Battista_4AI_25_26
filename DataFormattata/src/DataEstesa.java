import java.time.Month;

public class DataEstesa extends Data_Formattata{
    public DataEstesa(int giorno,int mese,int anno){
        super(giorno,mese,anno);
    }

    @Override
    public String stringaFormattata() {
        return giorno + "  " + Month.of(mese) + "  " + anno;
    }
    /*
    se non vuoi usare il metodo Month.of fai un dizionario con chiave il mese e
    valore il numero
    oppure due liste parallele per cui al numero associ il nome:

    List<Integer> num = Arrays.asList(numeri dei mesi....)
    List<String> mesi = Arrays.asList(nomi dei mesi....)
    String nomemese="";
    for (int i=0;i<num.lenght;i++{
    if (num.get(i) == mese) nomemese=mesi.get(i)
    }
    return giorno + "  " + nomemese + "  " + anno;
     */
}
