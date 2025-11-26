List<Scouterino> parcheggio= new ArrayList<Scouterino>();
List<Proprietario> proprietari= new ArrayList<Proprietario>();
// implementare: se targa è presente in archivio e mostra i dati,targa parziale prime 3 cifre,chilometraggio un range di chilometri km minimo e km massimo,ordinamento in base a filtro scelta.

//📂 Serializzazione di file per inserire dati prova.
void datiDiProva() {
        // Creo i proprietari usando il costruttore
    // Proprietari (tutti >= 18 anni nel 2025)
    Proprietario p1 = new Proprietario("RSSMRA85C13H501Z", "Mario", "Rossi", "Milano", LocalDate.of(1985, 3, 13));
    Proprietario p2 = new Proprietario("BNCLCU90A01F205X", "Luca", "Bianchi", "Roma", LocalDate.of(1990, 1, 1));
    Proprietario p3 = new Proprietario("VRDGLL92B15L219Y", "Giulia", "Verdi", "Torino", LocalDate.of(1992, 2, 15));
    Proprietario p4 = new Proprietario("NRIFRC80D20M123K", "Francesco", "Neri", "Napoli", LocalDate.of(1980, 4, 20));
    Proprietario p5 = new Proprietario("CNTCHR88E05B456L", "Chiara", "Conti", "Bergamo", LocalDate.of(1988, 5, 5));
    Proprietario p6 = new Proprietario("GLLPLA79F10C789M", "Paolo", "Galli", "Firenze", LocalDate.of(1979, 6, 10));
    Proprietario p7 = new Proprietario("CLMSRA95G25H321N", "Sara", "Colombo", "Genova", LocalDate.of(1995, 7, 25));
    Proprietario p8 = new Proprietario("RMNDVD87H30L654P", "Davide", "Romano", "Bologna", LocalDate.of(1987, 8, 30));
    Proprietario p9 = new Proprietario("FNTELN93I12M987Q", "Elena", "Fontana", "Verona", LocalDate.of(1993, 9, 12));
    Proprietario p10 = new Proprietario("VLLAND82L01N654R", "Andrea", "Villa", "Trieste", LocalDate.of(1982, 12, 1));


    // Aggiungo i proprietari alla lista
        proprietari.add(p1);
        proprietari.add(p2);
        proprietari.add(p3);
        proprietari.add(p4);
        proprietari.add(p5);
        proprietari.add(p6);
        proprietari.add(p7);
        proprietari.add(p8);
        proprietari.add(p9);
        proprietari.add(p10);

        // Creo gli scooter e li associo ai proprietari
        Scouterino s1 = new Scouterino("Malaguti Phantom F10", "A13CDE", 10000, LocalDate.of(2000, 1, 29), p1);
        Scouterino s2 = new Scouterino("KTM", "B12FGH", 500, LocalDate.of(2005, 1, 29), p2);
        Scouterino s3 = new Scouterino("Vespa Primavera", "C34JKL", 10000, LocalDate.of(2010, 1, 29), p3);
        Scouterino s4 = new Scouterino("Aprilia 125", "D56MNO", 10000, LocalDate.of(2020, 1, 29), p4);
        Scouterino s5 = new Scouterino("Honda SH", "E78PQR", 12000, LocalDate.of(2015, 5, 12), p5);
        Scouterino s6 = new Scouterino("Piaggio Liberty", "F90STU", 7000, LocalDate.of(2018, 3, 8), p6);
        Scouterino s7 = new Scouterino("Yamaha Aerox", "G12VWX", 9500, LocalDate.of(2012, 11, 21), p7);
        Scouterino s8 = new Scouterino("Suzuki Burgman", "H34YZA", 20000, LocalDate.of(2008, 7, 15), p8);
        Scouterino s9 = new Scouterino("Malaguti Phantom", "I56BCD", 8500, LocalDate.of(2011, 9, 10), p9);
        Scouterino s10 = new Scouterino("Peugeot Tweet", "J78EFG", 6000, LocalDate.of(2019, 4, 5), p10);


        // Aggiungo gli scooter alla lista
        parcheggio.add(s1);
        parcheggio.add(s2);
        parcheggio.add(s3);
        parcheggio.add(s4);
        parcheggio.add(s5);
        parcheggio.add(s6);
        parcheggio.add(s7);
        parcheggio.add(s8);
        parcheggio.add(s9);
        parcheggio.add(s10);
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
    Scouterino s= null;
    Scouterino s1= null;
    for (int i = 1; i< parcheggio.size();i++){
        for (int q = 0; q< parcheggio.size()-1;q++){
            s = parcheggio.get(q);
            s1 = parcheggio.get(q+1);
            if (parcheggio.get(q).getChilometri_fatti() > parcheggio.get(q+1).getChilometri_fatti()) {

        }

    }

    for (int j = 0; j<parcheggio.size();j++){
        System.out.println(parcheggio.get(j));
    }
}
}
void eliminaProprietario(Proprietario p){
    for (int i = 0; i<parcheggio.size();i++){
        if (parcheggio.get(i).getP() == p) {
            throw new IllegalArgumentException("Non uoi eliminare un proprietario che ha la moto");
        }
    }
    proprietari.remove(p);

}
void visualizzaProprietari(){
    for (int i = 0; i<proprietari.size();i++){
        System.out.println(proprietari.get(i));
    }
}
void Aggiunta(){
    try {
        String t = IO.readln("inserisci targa");
        int k = Integer.parseInt(IO.readln("Inserisci i km"));
        String m = IO.readln("inserisci il modello");
        LocalDate d = LocalDate.parse(IO.readln("Inserisci la data di acquisto"));
        String nome = IO.readln("inserisci nome");
        String cognome = IO.readln("inserisci cognome");
        String CF = IO.readln("inserisci codice fiscale");
        String residenza = IO.readln("inserisci residenza");
        LocalDate nascità = LocalDate.parse(IO.readln("Inserisci la data di nascità"));
        Proprietario p= new Proprietario(CF,nome,cognome,residenza,nascità);
        Scouterino s1 = new Scouterino(m,t,k,d,p);
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
//ricerca in base al modello,ricerca in base alla data
void Ricerca_modello(){

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
    OrdinaperChilometri();
}
