public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;

    public Giocatore(){
        nome = "Baresi";
        capitano = false;
        goal = 4;
        goalNazionale = 2;
    }
    public Giocatore(String nome,boolean capitano,int goal,int goalNazionale){
        setNome(nome);
        setCapitano(capitano);
        setGoal(goal);
        setGoalNazionale(goalNazionale);
    }

    public void setNome(String nome) {
        if (nome.length() < 2) {
            throw new IllegalArgumentException("Non puoi inserire un nome così corto");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    public boolean getCapitano() {
        return capitano;
    }

    public void setGoal(int goal) {
        if (goal<0){
            throw new IllegalArgumentException("un giocatore non può avere un numero di goal negativo");
        }
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoalNazionale(int goalNazionale) {
        if (goal<0){
            throw new IllegalArgumentException("un giocatore non può avere un numero di goal in nazionale negativo");
        }
        this.goalNazionale = goalNazionale;
    }

    public int getGoalNazionale() {
        return goalNazionale;
    }
    public int calcolaGoalTotali(){
        return goal + goalNazionale;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome= '" + nome + '\'' +
                ", capitano= " + capitano +
                ", goal= " + goal +
                ", goalNazionale= " + goalNazionale +
                '}';
    }
}
