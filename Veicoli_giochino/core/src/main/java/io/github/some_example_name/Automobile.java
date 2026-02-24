package io.github.some_example_name;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Automobile extends Veicolo{
    private static List<String> targhe;
    private String marca;
    private String targa;
    private int x;
    private int y;
     public Automobile(String marca,LocalDate date,float costo,String colore,String targa){
         super("macchina",date,costo,colore);
         setMarca(marca);
         setTarga(targa);
         y=0;
         x=0;
     }
    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {this.marca = marca;}

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    public String getTarga() {
        return targa;
    }

    private void setTarga(String targa) {
        this.targa = targa;
    }
    public static boolean ControllaMarca(String marca){
        List<String> li = Arrays.asList("Fiat", "Lancia", "Jeep", "Citroën", "Volkswagen", "Ford", "Renault", "Opel", "Toyota", "Peugeot");
        if (!li.contains(marca)){
            return false;
        }
        return true;
     }
    public static boolean ControllaTarga(String targa){
        if (targhe.contains(targa) || targa.matches("^[a-zA-Z]{2}[0-9]{3}[a-zA-Z]{2}$")){
            return false;
        }
        targhe.add(targa);
        return true;
    }

    public void posiziona(int x, int y){
        if (x>0 && x<600)setX(x);
        if(y>0 && x<600)setY(y);
    }
    public void muovi(int x, int y){
        if (x>0 && x<500){
            x--;
            this.x=x;
        }
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
