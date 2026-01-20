package io.github.some_example_name;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.files.FileHandle;

import java.security.cert.CertificateRevokedException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Main extends ApplicationAdapter {
    private Random r;

    private SpriteBatch batch;
    private Texture image;
    private TextureRegion region;
    private Sprite sprite;
    private int mouseX;
    private BitmapFont font;
    private String text;
    private Automobile auto;
    @Override
    public void create() {
        r = new Random();
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        region = new TextureRegion(image, 20, 20, 50, 50);
        //FileHandle file = new FileHandle("prova.txt");
        //text = file.readString();
        font = new BitmapFont();




        //l1 = new Lampadina();
        //l1.posiziona(500, 300);
        //archivio.add(l1);
    }

    @Override
    public void render() {

        // Update application
        mouseX = Gdx.input.getX();
        boolean isAPressed = Gdx.input.isKeyPressed(Keys.A);
        float delta = Gdx.graphics.getDeltaTime();
        boolean leftPressed = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
        boolean rightPressed = Gdx.input.isButtonPressed(Input.Buttons.RIGHT);

        // Render
        ScreenUtils.clear(Color.BLUE);
        batch.begin();
        if (Gdx.input.isKeyPressed(Keys.A) == true) {

        }
        if (Gdx.input.isKeyPressed(Keys.S) == true) {

        }
        if (Gdx.input.isKeyPressed(Keys.C) == true) {

        }
        if (Gdx.input.isKeyPressed(Keys.D) == true) {

        }


        // Disegnare le lampadine

        //batch.draw(lampSpenta, 0,500);
        //batch.draw(lampAccesa, 120,450);
        //batch.draw(lampRotta, 200,520);

        // Informazioni sulle lampadine
        font.draw(batch, "Ciao", 10, 500);
        font.draw(batch, String.valueOf(mouseX), 10, 520);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
    void InserisciNome(){
        boolean errore = true;
        while (errore) {
            String nome = IO.readln("inserisci il nome");
            errore = auto.ControllaNome(nome);
            if (errore){
                System.out.println("errore,non puoi inserire questo valore");
            }
        }
    }
    void InserisciData(){
        boolean errore = true;
        while (errore) {
            LocalDate data = LocalDate.IO.readln("inserisci il nome");
            errore = auto.ControllaNome(nome);
            if (errore){
                System.out.println("errore,non puoi inserire questo valore");
            }
        }
    }
}




/*
        if (leftPressed) {
            if (lampadina.getStato() == StatoLampadina.SPENTA) {
                showlamp = false;
                showlamp2 = true;
            }
            lampadina.accendi();
        }
        if (rightPressed) {
            if (lampadina.getStato() == StatoLampadina.ACCESA) {
                showlamp2 = false;
                showlamp = true;
            }
            lampadina.spegni();

        }
        if (lampadina.getStato() == StatoLampadina.ROTTA) {
            showlamp2 = false;
            showlamp = false;
            batch.draw(light_guasta, 0, 200);
        }


        //batch.draw(image, mouseX, 250);
        //batch.draw(region, 400, 250);

        if (showlamp2) {
            batch.draw(light_lamp, 0, 200);
        }
        if (showlamp) {
            batch.draw(lamp, 0, 200);
        }

        /*
        disegnaLampadina(archivio);
        for(int i=0;i<200;i++){
            int x = r.nextInt(100, 600);
            batch.draw(lamp, x,200);

        }
        if (lampadina.getStato()==StatoLampadina.SPENTA)
        batch.draw(light_lamp, 0, 200);
            lampadina.accendi();
         else


         */
