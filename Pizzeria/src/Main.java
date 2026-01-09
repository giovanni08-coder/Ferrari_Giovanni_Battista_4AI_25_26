void creaTavoli(Tavolo[] tavoli){
    for (int i=0;i<tavoli.length;i++){
        tavoli[i]= new Tavolo();
    }
}

void main() {
    Tavolo[] tavoli = new Tavolo[10];
    creaTavoli(tavoli);
    Cameriere cameriere = new Cameriere();
    Cameriere cameriere1 = new Cameriere();
    Pizzaiolo pizzaiolo = new Pizzaiolo();
    Cassa cassa = new Cassa();
    Map<String, Integer> dizionario = Map.of( "Margherita", 5, "Diavola", 7,  "Americana",6,"nulla",0 );

    int j=0;
    while (j< tavoli.length){
        List<String> chiavi = new ArrayList<>(dizionario.keySet());
        for (int i=0; i<tavoli[j].MAX_POS;i++){
            Random rand = new Random();
            String chiaveCasuale = chiavi.get(rand.nextInt(chiavi.size()));
            tavoli[j].AggiungiPizze(new Pizza(chiaveCasuale,dizionario.get(chiaveCasuale)));
        }
        if (j%2==0){
            cameriere.PrendiOrdine(tavoli[j]);
            System.out.println("Il cameriere1 " + tavoli[j].ChiamaTavolo());
        }
        else{
            cameriere1.PrendiOrdine(tavoli[j]);
            System.out.println("Il cameriere2 " + tavoli[j].ChiamaTavolo());
        }
        pizzaiolo.PreparaTavolo(tavoli[j]);
        System.out.println("Il conto pagato dal tavolo " + tavoli[j].ChiamaTavolo() + " è: "  );
        System.out.println(cassa.getSpesa(tavoli[j]));

        j++;
    }
}
