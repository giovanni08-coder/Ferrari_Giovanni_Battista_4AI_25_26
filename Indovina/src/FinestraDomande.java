import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class FinestraDomande extends Frame implements ActionListener {

    private final int FINESTRA_LARGHEZZA = 600;
    private final int FINESTRA_ALTEZZA = 300;
    private final int FONT_DIMENSIONE = 20;
    private final int IMMAGINE_LARGHEZZA = 77;
    private final int IMMAGINE_ALTEZZA = 78;

    private Label testoLabel;
    private Button siButton;
    private Button noButton;
    private ImagePanel immagineImp;
    private Panel panelCentro;

    private JTextField altroAnimale;
    private JTextField domandaDaImplementare;

    private Nodo nodoCorrente;
    private boolean inFoglia = false;

    public FinestraDomande(Nodo radice) {
        nodoCorrente = radice;
        creaFinestraGrafica();
        aggiornaFinestra();
    }

    private void creaFinestraGrafica() {

        Font font = new Font("Arial", Font.PLAIN, FONT_DIMENSIONE);
        setTitle("Indovina l'animale");
        setSize(FINESTRA_LARGHEZZA, FINESTRA_ALTEZZA);
        setLayout(new BorderLayout());

        // Label domanda
        testoLabel = new Label("", Label.CENTER);
        testoLabel.setFont(font);
        add(testoLabel, BorderLayout.NORTH);

        // TextBox finali (inizialmente nascosti)
        altroAnimale = new JTextField();
        altroAnimale.setFont(font);

        domandaDaImplementare = new JTextField();
        domandaDaImplementare.setFont(font);

        // Pulsanti
        siButton = new Button("Si");
        siButton.setFont(font);
        noButton = new Button("No");
        noButton.setFont(font);

        siButton.addActionListener(this);
        noButton.addActionListener(this);

        Panel panelBottoni = new Panel();
        panelBottoni.add(siButton);
        panelBottoni.add(noButton);

        add(panelBottoni, BorderLayout.SOUTH);

        // Pannello centrale per immagine
        panelCentro = new Panel();
        immagineImp = new ImagePanel(IMMAGINE_LARGHEZZA, IMMAGINE_ALTEZZA);
        panelCentro.add(immagineImp);
        add(panelCentro, BorderLayout.CENTER);

        // Chiusura finestra
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void aggiornaFinestra() {

        if (!nodoCorrente.isAnimale()) {
            inFoglia = false;
            testoLabel.setText(nodoCorrente.getTesto() + " (s/n)");
        } else {
            inFoglia = true;
            testoLabel.setText("Penso che l'animale sia: " + nodoCorrente.getTesto());

            if (nodoCorrente.getUrlImmagine() != null) {
                try {
                    Image immagine = ImageIO.read(nodoCorrente.getUrlImmagine());
                    immagineImp.setImage(immagine);
                } catch (IOException e) {
                    // nessuna immagine
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == siButton) {

            if (inFoglia) {
                testoLabel.setText("Grande! Ho indovinato!");
                siButton.setEnabled(false);
                noButton.setEnabled(false);
                return;
            }

            nodoCorrente = nodoCorrente.si;
            aggiornaFinestra();
        }

        if (e.getSource() == noButton) {

            if (inFoglia) {
                mostraTextBoxApprendimento();
                nodoCorrente.no= altroAnimale.getText();
                return;
            }

            nodoCorrente = nodoCorrente.no;
            aggiornaFinestra();
        }
    }

    private void mostraTextBoxApprendimento() {

        Panel panelTextBox = new Panel(new GridLayout(2, 1));

        domandaDaImplementare.setText("Scrivi una domanda che distingue i due animali");
        altroAnimale.setText("Qual era l'animale che avevi in mente?");

        panelTextBox.add(domandaDaImplementare);
        panelTextBox.add(altroAnimale);

        add(panelTextBox, BorderLayout.EAST);

        siButton.setEnabled(false);
        noButton.setEnabled(false);

        validate();
        repaint();
    }
}

