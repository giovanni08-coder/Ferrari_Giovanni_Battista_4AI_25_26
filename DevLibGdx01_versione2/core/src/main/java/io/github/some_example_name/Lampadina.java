package io.github.some_example_name;

import java.util.Random;

public class Lampadina {
    final private int maxAccensioni = 10;
    static private int conta = 0;
    static private Random r;
    private int x, y;
    private int id;
    private int accensioni;
    private StatoLamp stato;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getId(){
        return id;
    }

    public int getaccensioni(){
        return accensioni;
    }

    public StatoLamp getStato(){
        return stato;
    }

    @Override
    public String toString(){
        return "Lamp:" + id + " pos(" + x + "," + y + ")N°acc:" +
            accensioni;
    }


    public Lampadina(){
        x = 0;
        y = 0;
        accensioni = 0;
        stato = StatoLamp.SPENTA;

        id = conta;
        conta++;
        r=new Random();
    }


    public void posiziona(int x, int y){
        if (x>0 && x<600)setX(x);
        if(y>0 && x<600)setY(y);
    }

    // chiede alla lampadina di provare ad accendersi
    // se la lampadina è accesa o rotta la richiesta viene ignorata
    // se supera le accensioni massime la lampadina si rompe
    public void accendi(){
        if (stato == StatoLamp.SPENTA) {
            int prob =  r.nextInt(0,100);
            if (prob<5) stato=StatoLamp.ROTTA;
            else {
                stato = StatoLamp.ACCESA;

                accensioni++;
            }
        }
    }

    public void spegni(){
        if (stato == StatoLamp.ACCESA)
            stato = StatoLamp.SPENTA;
    }

}
