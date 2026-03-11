public class ProvettaSpecial extends Provetta {

    public ProvettaSpecial(int capacitàprovetta) {
        super(capacitàprovetta);
    }

    /**
     * Inverte il contenuto della provetta.
     */
    public void capovolgi() {
        for (int i=0;i<ColoriProvetta/2;i++){
            Colore colori = super.colori[i];
            super.colori[i] = super.colori[ColoriProvetta];
            super.colori[ColoriProvetta-i]= colori;
        }

    }
}