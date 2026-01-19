public class Studente extends Persona{
    private String matricola;
    private String universita;

    public Studente(String matricola,String universita){
        setMatricola(matricola);
        setUniversita(universita);
    }
    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getUniversita() {
        return universita;
    }

    public void setUniversita(String universita) {
        this.universita = universita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "CodiceFiscale='" + CodiceFiscale + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                " Matricola=" + matricola + '\'' +
                ", Universita="+ universita + '\'' +
                '}';
    }
}
