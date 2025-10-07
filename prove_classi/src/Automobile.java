public class Automobile {
    //attributi funzioni
    public float dimensione;
    public String marca;
    public String colore;
    public boolean accesa;
    public float velocità;
    public String cambio;
    public boolean Accendi (){
        accesa=true;
        return true;
    }
    public void Velocità (){
        velocità++;
    }
    public void Cambioauto(){
        cambio="automatico";
    }
    public boolean Spegni(){
        accesa=false;
        return false;
    }
   public Automobile(){
        marca="BMW";
        dimensione=24.23f;
        colore="rossa";
        accesa=false;
        velocità=0;
        cambio="manueale";

   }
}
