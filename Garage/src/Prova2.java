void main() {
    Map<Integer,Scouterino> dizionario = new HashMap<>();
    dizionario.put(500,new Scouterino("KTM ", "QCDL27", 15000, LocalDate.of(2005, 1, 29)));
    System.out.println(dizionario.keySet());
}