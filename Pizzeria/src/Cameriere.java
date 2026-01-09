public class Cameriere {
    private Pizzaiolo pizzaiolo;
    public Cameriere(){
        pizzaiolo=new Pizzaiolo();
    }
    public void PrendiOrdine(Tavolo t ){
        pizzaiolo.AggiungiTavolo(t);
        t.setStato(Stato.SERVITO);
    }
}
