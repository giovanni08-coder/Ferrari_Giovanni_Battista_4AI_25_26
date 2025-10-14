/**
 * Classe che gestisce il caricamento e lo scaricamento di scatole all'interno di uno scatolone,
 * tenendo traccia dello spazio occupato, dello spazio libero e del costo totale del contenuto.
 *
 * Questa classe include metodi per:
 * - Caricare scatole piccole
 * - Verificare lo spazio disponibile
 * - Calcolare il costo totale del contenuto
 * - Scaricare completamente lo scatolone
 *
 * Utilizza variabili interne per monitorare la capacità massima dello scatolone,
 * l'occupazione attuale e il costo per unità di spazio.
 *
 * <p><b>Autore:</b> Ferrari Giovanni Battista</p>
 * <p><b>Versione:</b> 1.0</p>
 */

public class Furgone {
    private int ampiezza_tot;
    private int ampiezza_tot_adesso=0;
    public final int scatola_piccola = 1;
    public final int scatola_media = 2;
    public final int scatola_grande = 3;
    public final float spesa_per_unità=10.0f;
    private int conta = 0;
    public Furgone(int ampiezza_tot) {
        this.ampiezza_tot = ampiezza_tot;
    }

    /**
     * Metodo privato che tenta di caricare una scatola nello scatolone, aggiornando l'occupazione totale.
     *
     * @param occupazioneScatolone La quantità di spazio che la scatola occupa nello scatolone.
     *
     * Il metodo verifica se l'aggiunta della scatola supera la capacità massima dello scatolone
     * (definita da {@code ampiezza_tot}). Se la somma tra l'occupazione attuale e la dimensione
     * della scatola piccola supera il limite, viene sollevata un'eccezione {@code IllegalArgumentException}.
     *
     * Se il controllo viene superato, l'occupazione attuale dello scatolone ({@code ampiezza_tot_adesso})
     * viene incrementata del valore passato come parametro.
     *
     * Prerequisiti:
     * - Le variabili {@code ampiezza_tot_adesso}, {@code scatola_piccola} e {@code ampiezza_tot}
     *   devono essere correttamente inizializzate.
     *
     * Eccezioni:
     * - {@code IllegalArgumentException} se l'aggiunta della scatola supera la capacità dello scatolone.
     */

    private void carica_scatolone(int occupazioneScatolone){
        if (ampiezza_tot_adesso + scatola_piccola > ampiezza_tot) {
            throw new IllegalArgumentException("non puoi più inserire una scatola piccola");
        }
        ampiezza_tot_adesso += occupazioneScatolone;
    }

    /**
     * Metodo pubblico che imposta una scatola piccola come contenuto da caricare nello scatolone.
     *
     * Questo metodo richiama la funzione {@code carica_scatolone} passando come parametro
     * l'oggetto {@code scatola_piccola}, presumibilmente una variabile predefinita o istanza
     * che rappresenta una scatola di dimensioni ridotte.
     *
     * È utile quando si vuole caricare automaticamente una scatola piccola senza dover
     * specificare manualmente il tipo di scatola ogni volta.
     *
     * Prerequisiti:
     * - La variabile {@code scatola_piccola} deve essere definita e inizializzata correttamente.
     * - Il metodo {@code carica_scatolone} deve essere disponibile nel contesto della classe.
     */

    public void Set_scatola_piccola() {
       carica_scatolone(scatola_piccola);
    }

    /**
     * Metodo pubblico che imposta una scatola piccola come contenuto da caricare nello scatolone.
     *
     * Questo metodo richiama la funzione {@code carica_scatolone} passando come parametro
     * l'oggetto {@code scatola_media}, presumibilmente una variabile predefinita o istanza
     * che rappresenta una scatola di dimensioni ridotte.
     *
     * È utile quando si vuole caricare automaticamente una scatola piccola senza dover
     * specificare manualmente il tipo di scatola ogni volta.
     *
     * Prerequisiti:
     * - La variabile {@code scatola_media} deve essere definita e inizializzata correttamente.
     * - Il metodo {@code carica_scatolone} deve essere disponibile nel contesto della classe.
     */

    public void Set_scatola_media() {
       carica_scatolone(scatola_media);
    }

    /**
     * Metodo pubblico che imposta una scatola piccola come contenuto da caricare nello scatolone.
     *
     * Questo metodo richiama la funzione {@code carica_scatolone} passando come parametro
     * l'oggetto {@code scatola_grandi}, presumibilmente una variabile predefinita o istanza
     * che rappresenta una scatola di dimensioni ridotte.
     *
     * È utile quando si vuole caricare automaticamente una scatola piccola senza dover
     * specificare manualmente il tipo di scatola ogni volta.
     *
     * Prerequisiti:
     * - La variabile {@code scatola_grande} deve essere definita e inizializzata correttamente.
     * - Il metodo {@code carica_scatolone} deve essere disponibile nel contesto della classe.
     */

    public void Set_scatola_grande() {
        carica_scatolone(scatola_grande);
    }

    /**
     * Metodo pubblico che scarica completamente il contenuto dello scatolone.
     *
     * Questo metodo controlla se lo scatolone è già vuoto, verificando se
     * {@code ampiezza_tot_adesso} è uguale a zero. In tal caso, viene sollevata
     * un'eccezione {@code IllegalArgumentException} per indicare che non è possibile
     * effettuare lo scarico.
     *
     * Se invece è presente del contenuto, il metodo azzera {@code ampiezza_tot_adesso},
     * simulando lo scarico completo dello scatolone.
     *
     * Eccezioni:
     * - {@code IllegalArgumentException} se lo scatolone è già vuoto.
     */

    public void Scarica_tutto() {
        if (ampiezza_tot_adesso == 0) {
            throw new IllegalArgumentException("Non puoi scaricare perché non è presente niente nel furgone");
        }
        ampiezza_tot_adesso = 0;
    }

    /**
     * Metodo pubblico che restituisce lo spazio libero rimanente nello scatolone.
     *
     * @return La quantità di spazio disponibile, calcolata come differenza tra
     *         la capacità totale dello scatolone ({@code ampiezza_tot}) e
     *         l'occupazione attuale ({@code ampiezza_tot_adesso}).
     *
     * Questo metodo è utile per verificare se è possibile inserire ulteriori scatole
     * nello scatolone senza superare la sua capacità massima.
     */
//metodo calcolato: li trovo usando altri attributo senza avere un attributo Spazio Libero.
    public int getSpazio_libero(){
        return ampiezza_tot-ampiezza_tot_adesso;
    }

    /**
     * Metodo pubblico che calcola e restituisce il costo totale del contenuto attualmente presente nello scatolone.
     *
     * @return Il costo totale, calcolato come {@code ampiezza_tot_adesso * spesa_per_unità}.
     *
     * Il metodo verifica prima se lo scatolone è vuoto. Se {@code ampiezza_tot_adesso} è uguale a zero,
     * viene sollevata un'eccezione {@code IllegalArgumentException} per indicare che non è possibile
     * calcolare il costo di un contenuto inesistente.
     *
     * Eccezioni:
     * - {@code IllegalArgumentException} se lo scatolone è vuoto.
     */
//metodo calcolato: li trovo usando altri attributo senza avere un attributo Spazio Libero.
    public float getCosto_tot(){
        if (ampiezza_tot_adesso == 0) {
            throw new IllegalArgumentException("Non puoi scaricare perché non è presente niente nel furgone");
        }
        return ampiezza_tot_adesso*spesa_per_unità;
    }
}
