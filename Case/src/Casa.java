public class Casa {
    private String nome;
    private boolean fibraOttiva;
    private int numStanze;
    private double metriQuadrati;
    public Casa(){
        nome = "Ferrari";
        fibraOttiva = false;
        numStanze = 4;
        metriQuadrati = 100.45;
    }

    public void setNome(String nome) {
        if (nome.length()<2){
            throw new IllegalArgumentException("nome troppo corto");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFibraOttiva(boolean fibraOttiva) {
        this.fibraOttiva = fibraOttiva;
    }

    public boolean getFibraOttiva() {
        return fibraOttiva;
    }

    public void setNumStanze(int numStanze) {
        if (numStanze<2){
            throw new IllegalArgumentException("Le stanze sono troppo poche");
        }
        this.numStanze = numStanze;
    }

    public int getNumStanze() {
        return numStanze;
    }

    public void setMetriQuadrati(double metriQuadrati) {
        if (metriQuadrati<10.5){
            throw new IllegalArgumentException("Metri quadrati minori per costruire una casa");
        }
        this.metriQuadrati = metriQuadrati;
    }

    public double getMetriQuadrati() {
        return metriQuadrati;
    }
}
