
void main() {
    //CRUD brano
    Brano b1 = new Brano("Sound of Dalmen",2025,3,"Dj Pelucchi");
    boolean errore = true;
    while(errore) {
        System.out.println(b1.Menu());
        String scelta = IO.readln("inserisci cosa vuoi fare");
        switch (scelta) {
            case "0":
                errore=false;
                break;
            case "1":
                b1.Stampa_brani();
                break;
            case "2":
                Brano.AggiungiBrano(Brano.creaBrano());
                break;
            case "3":
                Brano.Modifica_brano(Brano.creaBrano(), Brano.creaBrano());
                break;
            case "4":
                Brano.Remove_brano(Brano.creaBrano());
                break;
            default:
                System.out.println("non puoi inserire un valore diverso");
        }
    }
    Brano b2 = Brano.creaBrano();
    System.out.println(b1);
    IO.println(b2);
    Brano.AggiungiBrano(new Brano("Sound of Dalmen",2025,3,"Dj Pelucchi"));
    Brano.AggiungiBrano(new Brano("Sound of Dalmen",2022,2,"D Pelucchi"));
    System.out.println(b1.Stampa_brani());
    Brano.Remove_brano(new Brano("Sound of Dalmen",2022,2,"D Pelucchi"));
    System.out.println(b1.Stampa_brani());
}
