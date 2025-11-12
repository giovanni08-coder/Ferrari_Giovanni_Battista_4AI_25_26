void main() {
    Penna p1 = new Penna();
    p1.setMarca("BIC");
    p1.setCancellabile(true);
    p1.setQuantitaInchiostro(1.34);
    p1.setColore("Black");
    System.out.println("I valori della penna sono");
    System.out.println("Marca" + p1.getMarca());
    System.out.println("è cancellabile" + p1.getCancellabile());
    System.out.println("quantità inchiostro: " + p1.getQuantitaInchiostro());
    System.out.println("Colore:" + p1.getColore());
}