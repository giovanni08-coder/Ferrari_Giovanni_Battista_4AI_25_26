public class Mostro {
    private String colore;
    private int vita;
    private String nome;

    public Mostro(){
        vita=1000;
        nome="Bowser";
        colore="lilla";
    }
    public Mostro(String colore,String nome,int vita){
        this.vita=vita;
        this.nome=nome;
        this.colore=colore;
    }
    public String mostranome(){
        return nome;
    }
    public void Cambianome(String nome){
        this.nome = nome;
    }

    public int mostraenergia(){
        return vita;
    }
}
