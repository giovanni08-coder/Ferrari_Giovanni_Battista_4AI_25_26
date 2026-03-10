public class Macchine implements Comparable<Macchine>{
        private final String targa;     // Es: "AB123CD"
        private String marca;           // Es: "Fiat"
        private String modello;         // Es: "Panda"
        private int anno;               // Es: 2015

        public Macchine(String targa, String marca, String modello, int anno) {
            if (targa == null) {
                throw new IllegalArgumentException("La targa non può essere null");
            }
            this.targa = targa;
            this.marca = marca;
            this.modello = modello;
            this.anno = anno;
        }

        public String getTarga() {
            return targa;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModello() {
            return modello;
        }

        public void setModello(String modello) {
            this.modello = modello;
        }

        public int getAnno() {
            return anno;
        }

        public void setAnno(int anno) {
            this.anno = anno;
        }

        /**
         * Ordina per targa in ordine lessicografico.
         * Se vuoi ignorare maiuscole/minuscole, sostituisci con: this.targa.compareToIgnoreCase(o.targa)
         */
        @Override
        public int compareTo(Macchine o) {
            if (o == null) {
                // Convenzione: gli oggetti non-null vengono prima dei null
                return -1;
            }
            if (this.targa.compareTo(o.targa)>0){
                return 1;
            }
            if (this.targa.compareTo(o.targa)<0) {
                return -1;
            }
            return this.marca.compareTo(o.getMarca());

            //return this.targa.compareTo(o.targa);
        }

        @Override
        public boolean equals(Object obj ) {
            if (this == obj) return true;
            if (!(obj instanceof Macchine)) return false;
            // Due auto sono uguali se hanno la stessa targa (case-sensitive)
            return this.targa.equals(((Macchine) obj).targa);
            // Se vuoi ignorare le maiuscole: return this.targa.equalsIgnoreCase(other.targa);
        }

        @Override
        public int hashCode() {
            return targa.hashCode();
            // Se equals ignora maiuscole, usa hash normalizzato:
            // return targa.toUpperCase().hashCode();
        }

        @Override
        public String toString() {
            return String.format("Auto{targa='%s', marca='%s', modello='%s', anno=%d}",
                    targa, marca, modello, anno);
        }
    }
