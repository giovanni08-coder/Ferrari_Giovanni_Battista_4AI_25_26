List<Scouterino> parcheggio= new ArrayList<Scouterino>();
// implementare: se targa è presente in archivio e mostra i dati,targa parziale prime 3 cifre,chilometraggio un range di chilometri km minimo e km massimo,ordinamento in base a filtro scelta, ricerca in base al modello,ricerca in base alla data
void datiDiProva() {
    //parcheggio.add(new Scouterino("Malaguti Phantom F10", "A13CDE", 10000, LocalDate.of(2000, 1, 29)));
    parcheggio.add(new Scouterino("KTM ", "ADFE23", 500, LocalDate.of(2005, 1, 29)));
    //parcheggio.add(new Scouterino("Vespa primavera", "L123D3", 10000, LocalDate.of(2010, 1, 29)));
    //parcheggio.add(new Scouterino("Aprilia 125", "QJE123", 10000, LocalDate.of(2020, 1, 29)));
    parcheggio.add(new Scouterino("KTM ", "ADFQ24", 8000, LocalDate.of(2005, 1, 29)));
    parcheggio.add(new Scouterino("KTM ", "QCDL27", 15000, LocalDate.of(2005, 1, 29)));
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
void Targa_presente(){
    String t = IO.readln("inserisci targa dello scuoter");
    Scouterino s= null;
    int i =0;
    while (s == null && i<parcheggio.size()) {

        if (parcheggio.get(i).getTarga().equals(t)) {
            System.out.println("La targa è presente");
            System.out.println("La targa è: " + t );
            s = parcheggio.get(i);
        }
        i++;
    }
    if (s==null) {
        System.out.println("La targa: " + t + " non è presente");
    }
    else System.out.println(s);
}
void Targa_parziale(){
    String t = IO.readln("inserisci targa dello parziale scuoter");
    List<Scouterino> lista = new ArrayList<>();
    Scouterino s= null;
    int i =0;
    while (i<parcheggio.size()) {

        if (parcheggio.get(i).getTarga().contains(t)) {
            s = parcheggio.get(i);
            lista.add(s);
        }
        i++;
    }
    if (s==null){
        System.out.println("Data non presente");
    }
    for (int elementi = 0;elementi<lista.size();elementi++){
        System.out.println(lista.get(elementi));
    }
}
void Ricercakm(){
    final int Min_km = Integer.parseInt(IO.readln("inserisci il minimo di chilometri utilizzabili: "));
    final int Max_km = Integer.parseInt(IO.readln("inserisci il massimo di chilometri utilizzabili: "));
    List<Scouterino> l = new ArrayList<>();
    Scouterino s= null;
    int i =0;
    while (i<parcheggio.size()) {

        if (parcheggio.get(i).getChilometri_fatti()>=Min_km && parcheggio.get(i).getChilometri_fatti()<=Max_km) {
            s = parcheggio.get(i);
            l.add(s);
        }
        i++;
    }
    if (s==null){
        System.out.println("Data non presente");
    }
    for (int elementi = 0;elementi<l.size();elementi++){
        System.out.println(l.get(elementi));
    }
}
void OrdinaperChilometri(){
    Map<Integer,Scouterino> dizionario = new HashMap<>();
    Scouterino s= null;
    int i =0;
    while (i<parcheggio.size()) {
        s = parcheggio.get(i);
        dizionario.put(parcheggio.get(i).getChilometri_fatti(), s);
        i++;
    }
    for (int ordina = 0; ordina<dizionario.size(); ordina++){
        if (dizionario.get(dizionario.).keySet()>dizionario.keySet());
    }
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
}


void main() {

    datiDiProva();
    /*
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
    }while (scelta!=0);*/
    System.out.println(parcheggio);
    Ricercakm();
}
