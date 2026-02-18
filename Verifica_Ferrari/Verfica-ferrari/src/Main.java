List<Articoli> articoli = new ArrayList<>();
void Menu(){
    System.out.println("Premi 1 per inserire");
    System.out.println("Premi 2 per modificare");
    System.out.println("Premi 3 per eliminare");
    System.out.println("Premi 4 per visualizzare");
    System.out.println("Premi 5 per visualizza speciale");
    System.out.println("Premi 6 per ricerca");
    System.out.println("Premi 0 per uscire");
}
void Visualizza(){
    if (articoli.isEmpty()){
        System.out.println("Non è presente nulla nell'archivio degli articoli");
    }
    for (int i =0; i< articoli.size(); i++){
        System.out.println("Articolo " + i + ": " +  articoli.get(i));
    }
}
void AggiungiArticoilo(){
        String id = "";
        String descrizione = "";
        String tipo = "";
        double prezzo = 0;
        LocalDate data = null;
        boolean errore = true;
            while (errore) {
                try {
                    id = IO.readln("Inserisci l'id");
                    errore = Articoli.CheckId(id);
                } catch (RuntimeException e) {
                    System.out.println("Id errato, riprova");
                }
            }
             errore = true;
            while (errore) {
                try {
                    descrizione = IO.readln("Inserisci la descrizione");
                    errore=Articoli.CheckDescrizione(descrizione);
                } catch (RuntimeException e) {
                    System.out.println("descrizione errata, riprova");
                }
            }
            errore = true;
            while (errore) {
                try {
                    tipo = IO.readln("Inserisci il tipo");
                    errore=Articoli.CheckTipo(tipo);
                } catch (RuntimeException e) {
                    System.out.println("tipo errato,riprova");
                }

            }
             errore = true;
            while (errore) {
                try {
                    prezzo = Double.parseDouble(IO.readln("Inserisci il prezzo"));
                    errore = Articoli.CheckPrezzo(prezzo);
                } catch (NumberFormatException e) {
                    System.out.println("Numero sbagliato,riprova");
                }
            }
             errore = true;
            while (errore) {
                try {
                    int giorno = Integer.parseInt(IO.readln("Inserisci giorno"));
                    int mese = Integer.parseInt(IO.readln("Inserisci mese"));
                    int anno = Integer.parseInt(IO.readln("Inserisci anno"));
                    data = LocalDate.of(anno, mese, giorno);
                    errore = Articoli.CheckData(data);
                } catch (RuntimeException e) {
                    System.out.println("data errata,riprova");
                }
            }
            Articoli a= new Articoli(id, descrizione, tipo, data, prezzo);
            articoli.add(a);
}

void Elimina(){
    Articoli b = null;
    String id = IO.readln("Inserisci l'id");
    int i = 0;
    while (b == null && i < articoli.size()){

        if (id == articoli.get(i).getId()){
            b = articoli.get(i);
        }
        i++;
    }
    articoli.remove(b);
}
void Modifica(){
    Visualizza();
    System.out.println("Quale di questi articoli vuoi modificare (inserisci indice)");
    int modicato = Integer.parseInt(IO.readln());
    if (modicato > articoli.size()){
        System.out.println("Non puoi inserire modificare questo articolo perchè non esiste");
    }
    else {
        String descrizione = IO.readln("Inserisci la descrizione");
        articoli.get(modicato).setDescrizione(descrizione);
        String tipo = IO.readln("Inserisci il tipo");
        articoli.get(modicato).setTipo(tipo);
        double prezzo = Double.parseDouble(IO.readln("Inserisci il prezzo"));
        articoli.get(modicato).setPrezzo(prezzo);
        int giorno = Integer.parseInt(IO.readln("Inserisci giorno"));
        int mese = Integer.parseInt(IO.readln("Inserisci mese"));
        int anno = Integer.parseInt(IO.readln("Inserisci anno"));
        LocalDate data = LocalDate.of(anno, mese, giorno);
        articoli.get(modicato).setData(data);
    }

}
void VisualizzaSpeciale(){
    double prezzoMedio = 0;
    for (int i =0; i< articoli.size(); i++) {
        System.out.println("Articolo " + i + ": ");
        if (articoli.get(i).getPrezzo() > 15 || articoli.get(i).getTipo() != "elettronico" || articoli.get(i).getTipo() != "decorativo") {
            System.out.println("Gli articoli scontabli sono : " + articoli.get(i));
            prezzoMedio += articoli.get(i).getPrezzo();
        }
    }
    System.out.println(prezzoMedio/ articoli.size());
}
void RicercaParziale(){
    String descrizione = IO.readln("Inserisci la descrizione");
    for (int i =0; i< articoli.size(); i++){
        if (articoli.get(i).getDescrizione().contains(descrizione)) {
            System.out.println("Articolo " + articoli.get(i) + ": ");
        }
    }
}
void main() {
    boolean errore = true;
    while (errore){
        Menu();
        int scelta = Integer.parseInt(IO.readln("Inserisci cosa vuoi fare: "));
        if (scelta == 1){
            AggiungiArticoilo();
            Visualizza();
        }
        if (scelta == 3){
            Elimina();
            Visualizza();
        }
        if (scelta == 2){
            Modifica();
            Visualizza();
        }
        if (scelta == 4){
            Visualizza();
        }
        if (scelta == 5){
            VisualizzaSpeciale();
        }
        if (scelta == 6){
            RicercaParziale();
        }
        if (scelta == 0){
            errore=false;
        }

    }


}
