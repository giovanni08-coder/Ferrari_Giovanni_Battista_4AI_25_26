List<Scouterino> parcheggio= new ArrayList<Scouterino>();

void datiDiProva() {
    //parcheggio.add(new Scouterino("Malaguti Phantom F10", "A13CDE", 10000, LocalDate.of(2000, 1, 29)));
    parcheggio.add(new Scouterino("KTM ", "ADFE23", 10000, LocalDate.of(2005, 1, 29)));
    //parcheggio.add(new Scouterino("Vespa primavera", "L123D3", 10000, LocalDate.of(2010, 1, 29)));
    //parcheggio.add(new Scouterino("Aprilia 125", "QJE123", 10000, LocalDate.of(2020, 1, 29)));
}

void visualizza_tutti(){

    if (parcheggio.size()>0) {
        IO.println("In archivio sono presenti " + parcheggio.size() + " scuoter");
        for (Scouterino scouter : parcheggio) {
            IO.println(scouter);
        }
    }
    else {
        IO.println("Non sono presenti elementi");
    }
}
void Menu(){
    System.out.println("Premi 0 per uscire");
    System.out.println("Premi 1 per aggiungere");
    System.out.println("Premi 2 per eliminare");
    System.out.println("Premi 3 per visualizzare");
    System.out.println("Premi 4 per modifica");
}
void Aggiunta(){
    try {
        String t = IO.readln("inserisci targa");
        int k = Integer.parseInt(IO.readln("Inserisci i km"));
        String m = IO.readln("inserisci il modello");
        LocalDate d = LocalDate.parse(IO.readln("Inserisci la data"));
        Scouterino s1 = new Scouterino(m,t,k,d);
        parcheggio.add(s1);
    } catch (Exception e) {
        IO.println(e.getMessage());
    }
}

void Rimuovi(){
    String t = IO.readln("inserisci targa dello scuoter da cancellare");
    Scouterino s= null;
    int i =0;
    while (s ==null && i<parcheggio.size()) {

        if (parcheggio.get(i).getTarga().equals(t)) {
            s = parcheggio.get(i);
        }
        i++;
    }
    parcheggio.remove(s);
}
void Modifica(){
    String t = IO.readln("inserisci targa dello scuoter da cancellare");
    Scouterino s= null;
    int i =0;
    while (s ==null && i<parcheggio.size()) {

        if (parcheggio.get(i).getTarga().equals(t)) {
            s = parcheggio.get(i);
        }
        i++;
    }
    parcheggio.re;
}


void main() {
    datiDiProva();
    int scelta = 0;
    do {
        Menu();
        scelta= Integer.parseInt(IO.readln("Inseisci cosa vuoi fare"));
        switch (scelta){
            case 1: Aggiunta();break;
            case 2: Rimuovi();break;
            case 3: visualizza_tutti();break;
            case 4: Modifica();break;
            case 0:break;
            default:
                System.out.println("Sei uno stupidino non puoi inserire altri numeri");

        }
    }while (scelta!=0);
}
