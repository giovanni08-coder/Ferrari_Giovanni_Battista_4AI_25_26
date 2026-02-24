
void main() {
    List<Frutto> frutti = new ArrayList<>();
    Random r = new Random();
    List<String> fruttiO = Arrays.asList("banana","fragole","mela","anguria");
    List<String> FruttiE = Arrays.asList("mango","avocado","lemon");
    int scelta1 = Integer.parseInt(IO.readln("Quanti frutti vuoi"));
    for (int i =0; i<scelta1; i++){
        int scelta = Integer.parseInt(IO.readln("Vuoi un frutto Ordinario o esotico, scrivi 1 o 2 "));
        if (scelta==1){
            Ordinario ordinario = null;
            try {
                ordinario = new Ordinario("bassa",r.nextDouble(1.1,5.5),fruttiO.get(r.nextInt(0,fruttiO.size())),"AB12DC",false);
            } catch (Exception e) {
                System.out.println("da sempre errore perchè c'è il controllo sugli id che non possono essere uguali");
            }
            frutti.add(ordinario);
        }
        if (scelta==2){
            Esotico esotics = null;
            try {
                esotics = new Esotico("alta",r.nextDouble(1.1,5.5),fruttiO.get(r.nextInt(0,fruttiO.size())),"AB12DC",true);

            } catch (Exception e) {
                System.out.println("da sempre errore perchè c'è il controllo sugli id che non possono essere uguali");
            }
            frutti.add(esotics);
        }
    }
    System.out.println(frutti);
}
