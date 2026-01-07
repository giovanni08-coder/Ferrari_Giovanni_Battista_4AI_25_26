public class Lampadina {
    private int x,y;
    private int id;
    private int accensioni;
    private StatoLampadina stato;
    static private int conta =0;
    private final int MaxAccensioni = 10;


    public Lampadina(){
        stato = StatoLampadina.SPENTA;
        x = 0;
        y = 0;
        accensioni = 0;
        id = conta;
        conta ++;
    }
    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public int getAccensioni() {
        return accensioni;
    }

    public StatoLampadina getStato() {
        return stato;
    }

    public void posiziona(int x, int y){
        setX(x);
        setY(y);
    }

    //chiede alla lampadina di provare ad accendersi
    //se lampadina è già accesa o rotta la richiesta viene ignorata
    // se supera le accensioni massime la lampadina si rompe
    public void accendi(){
        if (stato==StatoLampadina.SPENTA){
            stato = StatoLampadina.ACCESA;
            accensioni++;
            if (accensioni > MaxAccensioni){
                stato = StatoLampadina.ROTTA;
            }
        }
    }
    public void spegni(){
        if (stato==StatoLampadina.ACCESA ){
            stato = StatoLampadina.SPENTA;
        }
    }

    @Override
    public String toString() {
        return "Lampadina{" +
                "pos(" + x +"," +  y +")" +
                ", id=" + id +
                ", accensioni=" + accensioni;
    }
}
