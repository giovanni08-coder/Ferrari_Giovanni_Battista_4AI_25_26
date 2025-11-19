import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Scouterino {
    static private List<String> targhe = new ArrayList<String>();
    private String modello;
    private String targa;
    private int chilometri_fatti;
    private LocalDate dataAcquisto;

    private Proprietario p;

    public Proprietario getP() {
        return p;
    }

    public void setP(Proprietario p) {
        if (p == null){
            throw new IllegalArgumentException("Non è possibile assegnare null al proprietario");
        }
        this.p = p;
    }

    public Scouterino(String m, String t, int c, LocalDate d,Proprietario p){
        Set_modello(m);
        setTarga(t);
        setChilometri_fatti(c);
        setDataAcquisto(d);
        setP(p);
    }
    public String getTarga(){
        return targa;
    }
    //LJ3663
    // 6 caratteri alfanumerici primo carattere deve essere una lettera
    public void setTarga(String t ){
            if(t.matches("[A-Z][0-9A-Z]{5}")==false){
                throw new IllegalArgumentException("la targa è sbagliata");
            }
            if (targhe.contains(t)){
                throw new IllegalArgumentException("Targa già usata");
            }
            targhe.add(t);
            targa =t;
            /* soluzione mia
        if (t == null || t.length() < 7) {
            throw new IllegalArgumentException("La targa deve avere almeno 6 caratteri");
        }
        if (!t.substring(0,1).matches("[A-Z]")){
            throw new IllegalArgumentException("la prima lettera deve essere maiuscola");
        }
        if (!t.substring(1).matches("[A-Z][0-9]+")) {
            throw new IllegalArgumentException("Non puoi mettere il primo carattere nè minuscolo nè un numero");
        }*/
    }
    public String getModello(){
        return modello;
    }
    public void Set_modello(String m) {
        if (m.length()<2){
            throw new IllegalArgumentException("Descrizione del computer troppo corta");
        }
        modello =m;
    }
    public int getChilometri_fatti(){
        return chilometri_fatti;
    }
    public void setChilometri_fatti(int k){
        if (chilometri_fatti<0){
            throw new IllegalArgumentException("Kilometraggio negativo noon consetito");
        }
        chilometri_fatti=k;
    }
    public LocalDate getData_acquisto(){
        return dataAcquisto;
    }

    public void setDataAcquisto(LocalDate d) {
        if (d.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data non usabile");
        }
        dataAcquisto = d;
    }

    @Override
    public String toString() {
        return "Scouterino{" +
                "modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", chilometri_fatti=" + chilometri_fatti +
                ", dataAcquisto=" + dataAcquisto +
                p +
                '}';
    }
}
