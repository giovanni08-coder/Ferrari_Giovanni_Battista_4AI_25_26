void main() {
    Penna penna1 = new Penna();
    penna1.setMarca("BIC");
    penna1.setCancellabile(true);
    penna1.setQuantitaInchiostro(1.34);
    penna1.setColore("Black");
    System.out.println("I valori della penna sono");
    System.out.println("Marca" + penna1.getMarca());
    System.out.println("è cancellabile" + penna1.getCancellabile());
    System.out.println("quantità inchiostro: " + penna1.getQuantitaInchiostro());
    System.out.println("Colore:" + penna1.getColore());

    Penna penna2 = new Penna();
    penna2.setMarca(IO.readln("inserisci la marca della penna"));
    penna2.setCancellabile(Boolean.parseBoolean(IO.readln("Inserisci se la penna è cancellabile (true o false)")));
    penna2.setQuantitaInchiostro(Double.parseDouble(IO.readln("Inserisci la quantità dell'inchiostro")));
    penna2.setColore(IO.readln("Inserisxci il colore"));

    System.out.println("I valori della penna2 sono");
    System.out.println("Marca" + penna2.getMarca());
    System.out.println("è cancellabile" + penna2.getCancellabile());
    System.out.println("quantità inchiostro: " + penna2.getQuantitaInchiostro());
    System.out.println("Colore:" + penna2.getColore());
}