public class Laureato extends Persona {
    private String MateriaUniversitaria;

    public Laureato(String nome, String cognome, int eta, String materiaUniversitaria) {
        super(nome, cognome, eta);
        setC();
        MateriaUniversitaria = materiaUniversitaria;
    }
    @Override
    public void setC() {
        c="Universitario";
    }

    public String getMateriaUniversitaria() {
        return MateriaUniversitaria;
    }

    public void setMateriaUniversitaria(String materiaUniversitaria) {
        MateriaUniversitaria = materiaUniversitaria;
    }

    @Override
    public String toString() {
        return "Laureato{"+ "Laureato" +super.toString() +
                "MateriaUniversitaria='" + MateriaUniversitaria + '\'' +
                '}';
    }
}
