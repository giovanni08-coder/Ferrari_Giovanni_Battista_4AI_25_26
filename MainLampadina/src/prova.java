void main() {
            // Variabile che rappresenta la velocità del tempo nel gioco
            double timeMultiplier = 2.0; // es. il tempo di gioco scorre al doppio

            // Tempo iniziale in millisecondi
            long startRealTime = System.currentTimeMillis();

            // Simulazione di un ciclo di gioco
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000); // aspetta 1 secondo reale
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                // Calcola i secondi reali passati
                long currentRealTime = System.currentTimeMillis();
                double elapsedRealSeconds = (currentRealTime - startRealTime) / 1000.0;

                // Calcola i secondi di gioco
                double gameSeconds = elapsedRealSeconds * timeMultiplier;

                System.out.println("Secondi reali: " + elapsedRealSeconds +
                        " | Secondi di gioco: " + gameSeconds);
            }
        }