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
import java.util.*;

public class Main extends ApplicationAdapter {
    private Random r;

    private SpriteBatch batch;
    private Texture image;
    private Texture redCar;
    private Texture yellowCar;
    private Texture light_bluCar;
    private Texture bluCar;
    private Texture greeCar;
    private Texture orangeCar;
    private TextureRegion region;
    private Sprite sprite;
    private int mouseX;
    private BitmapFont font;
    private String text;
    private List<Automobile> auto;
    @Override
    public void create() {
        r = new Random();
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        region = new TextureRegion(image, 20, 20, 50, 50);
        //FileHandle file = new FileHandle("prova.txt");
        //text = file.readString();
        font = new BitmapFont();
        auto = new ArrayList<>();
        bluCar = new Texture("blueCar.png");
        light_bluCar = new Texture("light-blueCar.png");
        greeCar = new Texture("GreenCar.png");
        orangeCar = new Texture("orangeCar.png");
        redCar = new Texture("redCar.png");
        yellowCar = new Texture("yellowCar.png");
        List<String> li2 = Arrays.asList("Rosso", "Blu", "Giallo", "Verde", "Arancione", "Azzurro");
        for (int i = 0; i < 5; i++) {
            String colorecasuale = li2.get(r.nextInt(li2.size()));
            Automobile l1 = new Automobile("Fiat",LocalDate.now(),300000,colorecasuale,"AA132BB");
            l1.posiziona(r.nextInt(300, 600), r.nextInt(300, 450));
            auto.add(l1);
        }
        //l1 = new Lampadina();
        //l1.posiziona(500, 300);
        //archivio.add(l1);
    }

    @Override
    public void render() {
        for (Automobile l : auto) {
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
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT) == true) {
            for (int i = 0; i < 1; i++) {
                List<String> li2 = Arrays.asList("Rosso", "Blu", "Giallo", "Verde", "Arancione", "Azzurro");
                Automobile l1 = new Automobile("Fiat",LocalDate.now(),300000,li2.get(r.nextInt(li2.size())),"AA132BB");
                l1.posiziona(r.nextInt(5, 700), r.nextInt(400, 520));
                auto.add(l1);
            }

        }
        if (Gdx.input.isKeyPressed(Keys.S) == true) {
            auto.removeAll(auto);
        }
        if (Gdx.input.isKeyPressed(Keys.C) == true) {
            int autopresenti = auto.size();
            auto.clear();

            //modifica colore auto presenti
            for (int i = 0; i < autopresenti; i++) {
                List<String> li2 = Arrays.asList("Rosso", "Blu", "Giallo", "Verde", "Arancione", "Azzurro");
                Automobile l1 = new Automobile("Fiat",LocalDate.now(),300000,li2.get(r.nextInt(li2.size())),"AA132BB");
                l1.posiziona(r.nextInt(5, 700), r.nextInt(400, 520));
                auto.add(l1);
            }
        }
        if (Gdx.input.isKeyPressed(Keys.D) == true) {
            //muovi auto
            for (int i = 0;i<auto.size();i++){
                auto.get(i).muovi(auto.get(i).getX(),auto.get(i).getY());
            }
        }


        // Disegnare le lampadine
        DisegnaMacchine(auto);
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
    void DisegnaMacchine(List<Automobile> auto){
        for (Automobile a : auto) {
            switch (a.getColore()) {
                case "Rosso":
                    batch.draw(redCar, a.getX(), a.getY());
                    break;
                case "Blu":
                    batch.draw(bluCar,a.getX(), a.getY());
                    break;
                case "Giallo":
                    batch.draw(yellowCar, a.getX(), a.getY());
                    break;
                case "Verde":
                    batch.draw(greeCar, a.getX(), a.getY());
                    break;
                case "Arancione":
                    batch.draw(orangeCar, a.getX(), a.getY());
                    break;
                case "Azzurro":
                    batch.draw(light_bluCar,a.getX(), a.getY());
                    break;

            }
        }
    }
}

