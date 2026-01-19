public class DataNumerica extends Data_Formattata{
    public DataNumerica(int giorno,int mese,int anno){
        super(giorno,mese,anno);
    }

    @Override
    public String stringaFormattata() {
        return giorno + "/" + mese + "/" + anno;
    }
}
