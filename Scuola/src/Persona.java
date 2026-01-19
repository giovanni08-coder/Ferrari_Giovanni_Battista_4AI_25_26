public class Persona {
    protected   String CodiceFiscale;
    protected String Nome;
    protected String Cognome;


    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        if (codiceFiscale.length()>16){
            throw new IllegalArgumentException("Non puoi inserire questo codice");
        }
        CodiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        if (nome.length()<0 || nome.length()>12){
            throw new IllegalArgumentException("Non puoi inserire questo nome");
        }
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        if (Cognome.length()<0 || Cognome.length()>12){
            throw new IllegalArgumentException("Non puoi inserire questo cognome");
        }
        Cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "CodiceFiscale='" + CodiceFiscale + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                '}';
    }
}
