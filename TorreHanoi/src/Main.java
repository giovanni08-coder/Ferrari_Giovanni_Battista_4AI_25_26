void InFirstRastrelliera(Rastrelliera r ){
    for (int i = r.numeroDischiPossibili; i >= 1; i--){
        r.InserisciDisco(r,new Disco(i));
    }
}
void main() {
    boolean errore = false;
    Stack<Integer> stack = new Stack<Integer>();
    System.out.println(stack);
    Rastrelliera r = new Rastrelliera(7,"A");
    Rastrelliera r2 = new Rastrelliera(7,"B");
    Rastrelliera r3 = new Rastrelliera(7,"C");
    Map<String,Rastrelliera> rastrellieraMap = new HashMap<>();
    rastrellieraMap.put(r.getNome(),r);
    rastrellieraMap.put(r2.getNome(),r2);
    rastrellieraMap.put(r3.getNome(),r3);
    InFirstRastrelliera(r);
    while (errore == false) {
        System.out.println(r.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        try {
            String mittente = IO.readln("Inserisci la rastrelliera mittente");
            String destinatario = IO.readln("Inserisci la rastrelliera destinataria");
            r.spostaDisco(rastrellieraMap.get(mittente), rastrellieraMap.get(destinatario));
            errore = r.RastrellieraCompleta(r3);
        } catch (Exception e) {
            System.out.println("riprova");
            errore = false;
        }
    }
    System.out.println("Hai vinto");
}
