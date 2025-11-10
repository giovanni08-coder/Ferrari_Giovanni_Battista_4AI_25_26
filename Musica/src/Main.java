
void main() {
    //CRUD brano
    Brano b1 = new Brano("Sound of Dalmen",2025,3,"Dj Pelucchi");
    Brano b2 = Brano.creaBrano();
    System.out.println(b1);
    IO.println(b2);
    Brano.AggiungiBrano(new Brano("Sound of Dalmen",2025,3,"Dj Pelucchi"));
    Brano.AggiungiBrano(new Brano("Sound of Dalmen",2022,2,"D Pelucchi"));
    System.out.println(b1.Stampa_brani());
    Brano.Remove_brano(new Brano("Sound of Dalmen",2022,2,"D Pelucchi"));
    System.out.println(b1.Stampa_brani());
    Brano.Modifica_brano(new Brano("Sound of Dalmen",2022,2,"D Pelucchi"),new Brano("Sound of Dalmen",2025,3,"Dj Pelucchi"));
    System.out.println(b1.Stampa_brani());
}
