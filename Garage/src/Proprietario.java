import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    static private List<String> ListaCF= new ArrayList<String>();

    private String CF;
    private String nome;
    private String cognome;
    private String residenza;
    private LocalDate nascità;
public Proprietario(String CF,String nome,String cognome,String residenza,LocalDate nascità){
    setCF(CF);
    setNome(nome);
    setCognome(cognome);
    setResidenza(residenza);
    setNascità(nascità);

}

    public static void setListaCF(List<String> listaCF) {
        ListaCF = listaCF;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        if (CF.length() !=16){
            throw new IllegalArgumentException("Codice fiscale incoretto");
        }
        if (ListaCF.contains(CF.toUpperCase())){
            throw new IllegalArgumentException("non puoi inserire un codice fiscale gia presente");
        }
        ListaCF.add(CF.toUpperCase());
        this.CF = CF.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length()<3 || nome.length()>14){
            throw new IllegalArgumentException("Non puoi inserire un nome così corto");
        }
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if (cognome.length()<3 || cognome.length()>14){
            throw new IllegalArgumentException("Non puoi inserire un cognome così corto");
        }
        this.cognome = cognome;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        if (residenza.length()<3){
            throw new IllegalArgumentException("Non esiste una residenza così corta");
        }
        this.residenza = residenza;
    }

    public LocalDate getNascità() {
        return nascità;
    }

    public void setNascità(LocalDate nascità) {
        if (nascità.getYear()>LocalDate.now().getYear() ||  LocalDate.now().getYear() -nascità.getYear() <18){
            throw new IllegalArgumentException("Non puoi inserire questa data di nascità");
        }
        this.nascità = nascità;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "CF='" + CF + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", residenza='" + residenza + '\'' +
                ", nascità=" + nascità +
                '}';
    }
}
