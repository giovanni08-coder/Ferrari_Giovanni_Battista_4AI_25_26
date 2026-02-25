void main() {
//errori: se io tolgo l'inserimento e mi prendo tutto quello che c'è scritto nel file
//
 /*
List<Persona> persone = new ArrayList<>();
persone.add(new Bambino("Ciccio","Pasticcio",55,LocalDate.of(2025,2,12)));
persone.add(new Persona("Alessio","Amato",43));
persone.add(new Persona("Carlo","Bacuzzi",18));
persone.add(new Persona("Ciccio","Pasticcio",55));
persone.add(new Laureato("Ciccio","Pasticcio",55,"Italiano"));
//salvare la lista delle persone
    try {
        GestorePersoneFile.SalvaPersone(persone);
    } catch (IOException e) {
        System.out.println("Errore di scrittura dei dati su file");
    }
persone.clear();
*/
//ricaricare la lista dal file
    try {

        GestorePersoneFile.caricaPersone();
    } catch (IOException e) {
        System.out.println("Errore di lettura dei dati su file");
    }

try {
    Gfg.Scrivi_binario();
} catch (Exception e) {
    throw new RuntimeException(e);
}
    try {
        Gfg.Leggi_binario();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
//Stampa della lista
/*
for (Persona p: persone){
    System.out.println(p);
}*/

}
