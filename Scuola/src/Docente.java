public class Docente extends Persona {
    private String materia;
    private float salario;

    public String toString() {
        return "Persona{" +
                "CodiceFiscale='" + CodiceFiscale + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                " Matricola=" + materia + '\'' +
                ", Universita="+ salario + '\'' +
                '}';
    }
}
