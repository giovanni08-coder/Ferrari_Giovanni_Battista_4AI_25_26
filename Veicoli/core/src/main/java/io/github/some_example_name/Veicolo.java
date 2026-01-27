package io.github.some_example_name;
import java.awt.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public abstract class Veicolo {
    protected String nomeVeicolo;
    protected LocalDate data;
    protected float costo;
    protected String colore;

    public Veicolo(String nomeVeicolo,LocalDate data,float costo, String colore){
        setCosto(costo);
        setData(data);
        setNomeVeicolo(nomeVeicolo);
        setColore(colore);
    }

    public String getColore() {
        return colore;
    }

    private void setColore(String colore) {
        this.colore = colore;
    }

    public String getNomeVeicolo() {
        return nomeVeicolo;
    }

    private void setNomeVeicolo(String nomeVeicolo) {
        this.nomeVeicolo = nomeVeicolo;
    }

    public LocalDate getData() {
        return data;
    }

    private void setData(LocalDate data) {
        this.data = data;
    }

    public float getCosto() {
        return costo;
    }

    private void setCosto(float costo) {
        this.costo = costo;
    }
    public  static boolean ControllaColore(String colore){
        List<String> li = Arrays.asList("Rosso", "Blu", "Giallo", "Verde", "Arancione", "Azzurro");
        if (!li.contains(colore)){
            return false;
        }
        return true;
    }
    public static boolean ControllaNome(String nome){
        List<String> li = Arrays.asList("macchina", "auto","moto", "portapacchi", "autobus","pullman","");
        if (!li.contains(nome.toLowerCase())){
            return false;
        }
        return true;
    }
    public static boolean ControllaData(LocalDate data){
        if (data.isAfter(LocalDate.now())){
            return false;
        }
        return true;
    }
    public static  boolean ControllaCosto(float costo){
        if (costo<0){
            return false;
        }
        return true;
    }

    @Override
    public abstract String toString();
}
