import javax.swing.*;

void main() {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            Finestra finestra = new Finestra(900,1100);
            finestra.setSize(finestra.getLarghezza(),finestra.getAltezza());
            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            label.setIcon(finestra.getImage());
            finestra.add(label);
            finestra.setVisible(finestra.isAccendi());
        }
    });
}
