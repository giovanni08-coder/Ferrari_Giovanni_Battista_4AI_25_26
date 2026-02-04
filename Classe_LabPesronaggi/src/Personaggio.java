public class Personaggio {
    //nome,vita,stamina,danni
    private String nome;
    private int vita;
    private int stamina;
    private int danni;
    private int LivelloEsp;
    public Arma arma;

    protected Personaggio(String nome,int vita,int stamina,int danni,Arma arma){
        setNome(nome);
        setVita(vita);
        setStamina(stamina);
        setDanni(danni);
        setArma(arma);
        LivelloEsp = 1;
    }
    public Personaggio(String nome){
        this.vita=100;
        this.danni = 20;
        this.LivelloEsp = 1;
        this.stamina =20;
        this.arma = Arma.PUGNO;
        setNome(nome);
    }


    public String getNome() {
        if (nome.isEmpty() || nome.length()>20){
            throw new IllegalArgumentException("non puoi inserire questo nome");
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        if (vita<0){
            throw new IllegalArgumentException("non puoi inserire questa vita");
        }
        this.vita = vita;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        if (stamina<0){
            throw new IllegalArgumentException("non ci può essere la stamina minore di 0");
        }
        this.stamina = stamina;
    }

    public int getDanni() {
        return danni;
    }

    public void setDanni(int danni) {
        if (danni <=0){
            throw new IllegalArgumentException("Non può esistere un danni minore uguale a 0");
        }
        this.danni = danni;
    }

    public int getLivelloEsp() {
        return LivelloEsp;
    }

    public void setLivelloEsp(int livelloEsp) {
        if (livelloEsp<0){
            throw new IllegalArgumentException("Non puoi mettere il livello di esperienza minore di 0");
        }
        LivelloEsp = livelloEsp;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        if (arma == null){
            throw new IllegalArgumentException("non avere un arma nulla");
        }
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personaggio{" +
                "nome='" + nome + '\'' +
                ", vita=" + vita +
                ", stamina=" + stamina +
                ", danni=" + danni +
                ", LivelloEsp=" + LivelloEsp +
                ", arma=" + arma +
                '}';
    }



}
