void main() {
List<Persona> persone = new ArrayList<>();

persone.add(new Persona("Alessio","Amato",43));
persone.add(new Persona("Carlo","Bacuzzi",18));
persone.add(new Persona("Ciccio","Pasticcio",55));
persone.add(new Bambino("Ciccio","Pasticcio",55,60));
persone.add(new Laureato("Ciccio","Pasticcio",55,"Italiano"));
//salvare la lista delle persone
    try {
        GestorePersoneFile.SalvaPersone(persone);
    } catch (IOException e) {
        System.out.println("Errore di scrittura dei dati su file");
    }
persone.clear();

//ricaricare la lista dal file
    try {

        List<Persona> personas = GestorePersoneFile.caricaPersone();
        for (int i =0;i<personas.size();i++){
            if (personas.get(i) instanceof Bambino){
            }
        }
    } catch (IOException e) {
        System.out.println("Errore di lettura dei dati su file");
    }

//Stampa della lista
for (Persona p: persone){
    System.out.println(p);
}

}
