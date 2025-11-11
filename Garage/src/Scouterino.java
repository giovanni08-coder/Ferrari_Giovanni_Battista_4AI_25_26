import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Scouterino {
    private String modello;
    private String targa;
    private int chilometri_fatti;
    private LocalDate dataAcquisto;

    public Scouterino(String m, String t,int c,int d){
        modello =  getTarga();
        targa = "XEBC12";
    }
    public String getTarga(){
        return targa;
    }
    //LJ3663
    // 6 caratteri alfanumerici primo carattere deve essere una lettera
    public void setTarga(String t ){
            if (!t.substring(0,1).matches("[A-Z]") && !t.substring(1).matches("[A-Z][0-9]")) {
                throw new IllegalArgumentException("Non puoi mettere il primo carattere nè minuscolo nè un numero");
            }
            targa =t;
    }
    public String getModello(){
        return modello;
    }
    public void Set_modello() {
    }
    public int getChilometri_fatti(){
        return chilometri_fatti;
    }
    public void setChilometri_fatti(){

    }
    public LocalDate getData_acquisto(){
        return dataAcquisto;
    }

    public void setDataAcquisto(LocalDate d) {
    }
}
