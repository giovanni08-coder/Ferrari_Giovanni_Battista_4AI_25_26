public class Furgone {
    private final int ampiezza_tot = 30;
    private int ampiezza_tot_adesso;
    private final int scatola_piccola = 1;
    private final int scatola_media = 2;
    private final int scatola_grande = 3;
    private int conta = 0;
    private int costo=0;
    public Furgone() {
        ampiezza_tot_adesso = 15;
    }

    public void Set_ampiezza(int ampiezza) {
        if (conta != 0 || (ampiezza > ampiezza_tot || ampiezza < 0)) {
            throw new IllegalArgumentException("non puoi inserire questa l'ampiezza oppure non puoi inserire due volte l'ampiezza iniziale");
        } else {
            ampiezza_tot_adesso = ampiezza;
            conta = 1;
        }
    }

    public void Set_scatola_piccola() {
        if (ampiezza_tot_adesso >= ampiezza_tot) {
            throw new IllegalArgumentException("non puoi più inserire una scatola piccola");
        }
        ampiezza_tot_adesso += scatola_piccola;
    }

    public void Set_scatola_media() {
        if (ampiezza_tot_adesso >= ampiezza_tot - 1) {
            throw new IllegalArgumentException("non puoi più inserire una scatola piccola");
        }
        ampiezza_tot_adesso += scatola_piccola;
    }

    public void Set_scatola_grande() {
        if (ampiezza_tot_adesso >= ampiezza_tot - 2) {
            throw new IllegalArgumentException("non puoi più inserire una scatola piccola");
        }
        ampiezza_tot_adesso += scatola_piccola;
    }

    public void Scarica_tutto() {
        if (ampiezza_tot_adesso == 0) {
            throw new IllegalArgumentException("Non puoi scaricare perché non è presente niente nel furgone");
        }
        ampiezza_tot_adesso -= ampiezza_tot_adesso;
    }

    @Override
    public String toString() {
        return "Furgone" + "\n" +
                "unità presenti adesso nel furgone = " + ampiezza_tot_adesso;
    }
    public void Costo_tot(){
        if (ampiezza_tot_adesso == 0) {
            throw new IllegalArgumentException("Non puoi scaricare perché non è presente niente nel furgone");
        }
        costo=ampiezza_tot_adesso*10;
    }
}
