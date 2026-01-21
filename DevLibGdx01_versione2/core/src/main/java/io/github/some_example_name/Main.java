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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*   __  __       _
    |  \/  | __ _(_)_ __
    | |\/| |/ _` | | '_ \
    | |  | | (_| | | | | |
    |_|  |_|\__,_|_|_| |_|  Entry point dell'applicazione.
*/

//conta le accensioni andate a buon fine
//rimozione lampadine bruciate
public class Main extends ApplicationAdapter {
    private Random r;
    private List<Lampadina> archivio = new ArrayList<Lampadina>();

    private SpriteBatch batch;
    private Texture image;
    private TextureRegion region;
    private Sprite sprite;
    private int mouseX;
    private BitmapFont font;
    private String text;
    private int conta;
    private Texture lamp;
    private TextureRegion lampSpenta, lampAccesa, lampRotta;
    private Lampadina l1;

    @Override
    public void create() {
        r = new Random();
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        region = new TextureRegion(image, 20, 20, 50, 50);
        FileHandle file = new FileHandle("prova.txt");
        text = file.readString();
        font = new BitmapFont();


        lamp = new Texture("lampadina.png");
        lampSpenta = new TextureRegion(lamp, 0, 0, 40, 52);
        lampAccesa = new TextureRegion(lamp, 52, 0, 40, 52);
        lampRotta = new TextureRegion(lamp, 104, 0, 40, 52);

        for (int i = 0; i < 20; i++) {
            Lampadina l1 = new Lampadina();
            l1.posiziona(r.nextInt(300, 600), r.nextInt(300, 450));
            archivio.add(l1);
        }
        //l1 = new Lampadina();
        //l1.posiziona(500, 300);
        //archivio.add(l1);
    }

    @Override
    public void render() {
        for (Lampadina l : archivio) {
            l.posiziona(l.getX() + r.nextInt(-1, 2), l.getY() + r.nextInt(-1, 2));
        }
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
            for (Lampadina l : archivio) {
                int accen = l.getaccensioni();
                l.accendi();
                int acce_dopo= l.getaccensioni();

                conta+= acce_dopo-accen;
            }
        }
        if (Gdx.input.isKeyPressed(Keys.S) == true) {
            for (Lampadina l : archivio) {
                l.spegni();
            }
        }
        if (Gdx.input.isKeyPressed(Keys.C) == true) {
            for (int i = 0; i < 20; i++) {
                Lampadina l1 = new Lampadina();
                l1.posiziona(r.nextInt(5, 700), r.nextInt(400, 520));
                archivio.add(l1);
            }

        }
        if (Gdx.input.isKeyPressed(Keys.D) == true) {
            for (int i = 0; i < archivio.size(); i++) {
                if (archivio.get(i).getStato() == StatoLamp.ROTTA) {
                    archivio.remove(archivio.get(i));
                }
            }
        }


        // Disegnare le lampadine
        disegnaLampadine(archivio);
        font.draw(batch, "accensioni: " + String.valueOf(conta), 30, 500);

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

    public void disegnaLampadine(List<Lampadina> a) {
        for (Lampadina l : a) {
            switch (l.getStato()) {
                case SPENTA:
                    batch.draw(lampSpenta, l.getX(), l.getY());
                    break;
                case ACCESA:
                    batch.draw(lampAccesa, l.getX(), l.getY());
                    break;
                case ROTTA:
                    batch.draw(lampRotta, l.getX(), l.getY());
                    break;
            }
        }

        font.draw(batch, "Lampadine in archivio : " + String.valueOf(a.size()), 10, 590);
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
