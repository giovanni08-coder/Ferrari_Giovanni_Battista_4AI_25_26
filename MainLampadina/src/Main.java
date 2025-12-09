void Tempo_passato(){
    int t = Integer.parseInt(IO.readln("inserisci i secondi passati"));
    
}

void main() {
//crea un tot lampadine;
    //si può fare un metodo che genera tanti condici noon andando in errore con questa set: if (!nSerie.matches("[A-Z][A-Z0-9]{4}")){ throw new IllegalArgumentException("non puoi inserire questo ciìodice seriale"); }
    Lampadina lamp = new Lampadina();
    lamp.accendi();
    System.out.println(lamp.getStato());
}
