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
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private TextureRegion region;
    private Sprite sprite;
    private int mouseX;
    private BitmapFont font;
    private String text;
    private List<Lampadina> archivio = new ArrayList<>();

    private Texture lamp;
    private Texture light_lamp;
    private Texture light_guasta;
    private TextureRegion lampRegion;
    private Random r;
    private Lampadina lampadina;
    private boolean showlamp = true;
    private boolean showlamp2 = false;
    private Lampadina lampadina2;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        region = new TextureRegion(image, 20, 20, 50, 50);
        //FileHandle file = new FileHandle("prova.txt");
        //text = file.readString();
        font = new BitmapFont();
        lamp = new Texture("lampadina.png");
        light_lamp = new Texture("lampadina_accesa.png");
        light_guasta = new Texture("lampadina_guasta.png");
        lampRegion = new TextureRegion(image, 0, 0, 40, 52);
        r = new Random();
        lampadina = new Lampadina();
        for(int i=0;i<20;i++){
            lampadina2 = new Lampadina();
            lampadina2.posiziona(r.nextInt(0,500), r.nextInt(0,100));
            archivio.add(lampadina);
        }
    }

    @Override
    public void render() {
        // Update application
        mouseX = Gdx.input.getX();
        boolean isAPressed = Gdx.input.isKeyPressed(Keys.A);
        boolean isEscPressed = Gdx.input.isKeyPressed(Keys.ESCAPE);

        float delta = Gdx.graphics.getDeltaTime();

        boolean leftPressed = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
        boolean rightPressed = Gdx.input.isButtonPressed(Input.Buttons.RIGHT);

        // Render
        ScreenUtils.clear(Color.BLACK);
        batch.begin();
        // batch.disableBlending();
        // disegno lo sfondo
        // batch.enableBlending();
        batch.draw(image, 100, 500);
        if (isAPressed == true) {
            batch.draw(image, 0, 0);
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
        //batch.draw(lamp,lampadina2.getX(),lampadina2.getY());
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
        for (Lampadina lamp : a) {
            switch (lamp.getStato()) {
                case ACCESA:
                    batch.draw(light_lamp, 0, 200);
                    break;
                case SPENTA:
                    batch.draw(this.lamp, 0, 200);
                    break;
                case ROTTA:
                    batch.draw(light_guasta, 0, 200);
                    break;
            }
        }
        font.draw(batch,"lampadine in archivio: " + String.valueOf(a.size()),10,260);
    }
}

