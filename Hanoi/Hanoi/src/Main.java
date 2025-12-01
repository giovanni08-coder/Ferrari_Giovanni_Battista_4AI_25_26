List<Integer> Dischi(int numero_dischi, List<Integer> li){
    for (int i =numero_dischi-1; i< 0 ;i++){
        li.add(i);
    }
    return li ;
}
void main() {
    boolean errore = false;
    List<Integer> l1 = new ArrayList<>();
    int numeroDischi = Integer.parseInt(IO.readln("Inserisci la torre mittente"));
    l1= Dischi(numeroDischi,l1);
    Rastrelliera rust = new Rastrelliera(3,numeroDischi,l1);
    while (errore == false) {
        System.out.println(rust.getRastrelliera());
        try {
            int mittente = Integer.parseInt(IO.readln("Inserisci la torre mittente"));
            int destinatario = Integer.parseInt(IO.readln("Inserisci la torre destinataria"));
            rust.spostaDisco(mittente,destinatario);
            errore = rust.vittoria();
        } catch (Exception e) {
            System.out.println("Errato, riprova");
            errore = false;
        }
    }
}
