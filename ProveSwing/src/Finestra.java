import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class Finestra extends JFrame {
        private int altezza;
        private int larghezza;
        private boolean accendi;
        private ImageIcon image;
    public Finestra(int altezza,int larghezza){
            setAltezza(altezza);
            setLarghezza(larghezza);
            accendi=true;
            image = new ImageIcon("C:\\Users\\GIOVANNIBATTISTAFERR\\Desktop\\info\\Ferrari_Giovanni_Battista_4AI_25_26\\ProveSwing\\src\\Sfondo.jpg");
        }
    private void setAltezza(int altezza){
        if (altezza<Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 || altezza> Toolkit.getDefaultToolkit().getScreenSize().getHeight()){
            throw new IllegalArgumentException("Non puoi inserire i seguenti valori");
        }
        this.altezza = altezza;
    }

    public int getAltezza() {
        return altezza;
    }

    private void setLarghezza(int larghezza){
        if (larghezza<Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 || larghezza> Toolkit.getDefaultToolkit().getScreenSize().getWidth()){
            throw new IllegalArgumentException("Non puoi inserire i seguenti valori della larghezza");
        }
        this.larghezza = larghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public boolean isAccendi() {
        return accendi;
    }

    public ImageIcon getImage() {
        return image;
    }
}
