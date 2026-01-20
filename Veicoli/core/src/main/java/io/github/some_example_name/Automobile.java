package io.github.some_example_name;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Automobile extends Veicolo{
    private static List<String> targhe;
    private String marca;
    private String targa;
     public Automobile(String marca,LocalDate date,float costo,String colore,String targa){
         super("macchina",date,costo,colore);
         setMarca(marca);
         setTarga(targa);
     }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {

        this.marca = marca;
    }

    public String getTarga() {
        return targa;
    }

    private void setTarga(String targa) {
        this.targa = targa;
    }
    public boolean ControllaMarca(){
        List<String> li = Arrays.asList("Fiat", "Lancia", "Jeep", "Citroën", "Volkswagen", "Ford", "Renault", "Opel", "Toyota", "Peugeot");
        if (!li.contains(li)){
            return false;
        }
        return true;
     }
    public boolean ControllaTarga(){
        if (targhe.contains(targa) || targa.matches("^[a-zA-Z]{2} + [0-9]{3} + [a-zA-Z]{2}$")){
            return false;
        }
        targhe.add(targa);
        return true;
    }


    @Override
     public String toString() {
         return "Veicolo{" +
                 "nomeVeicolo='" + nomeVeicolo + '\'' +
                 ", data=" + data +
                 ", costo=" + costo +
                 ", marca=" + marca +
             ", marca=" + targa +
                 '}';
     }
}
