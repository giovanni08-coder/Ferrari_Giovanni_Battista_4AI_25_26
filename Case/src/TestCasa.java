void main() {
    Casa casa = new Casa();

    casa.setNome("Ripamonti");
    casa.setFibraOttiva(true);
    casa.setMetriQuadrati(17.5);
    casa.setNumStanze(5);

    System.out.println("Informazioni sulla casa: ");
    System.out.println("Nome" + casa.getNome());
    System.out.println("Fibra ottica presente: " + casa.getFibraOttiva());
    System.out.println("Metri quadrati: " + casa.getMetriQuadrati());
    System.out.println(" Nume stanze: " + casa.getNumStanze());

    Casa casa2 = new Casa();
    System.out.println("Inserisci i dati sulla casa2");
    casa2.setNome(IO.readln("inserisci il nome della casa"));
    casa2.setFibraOttiva(Boolean.parseBoolean(IO.readln("Cancellabile (true o false)")));
    casa2.setMetriQuadrati(Double.parseDouble(IO.readln("Inserisci i metri quadrati")));
    casa2.setNumStanze(Integer.parseInt(IO.readln("inserisci il numero delle stanze")));

    System.out.println("Informazioni sulla casa: ");
    System.out.println("Nome" + casa2.getNome());
    System.out.println("Fibra ottica presente: " + casa2.getFibraOttiva());
    System.out.println("Metri quadrati: " + casa2.getMetriQuadrati());
    System.out.println(" Nume stanze: " + casa2.getNumStanze());
}