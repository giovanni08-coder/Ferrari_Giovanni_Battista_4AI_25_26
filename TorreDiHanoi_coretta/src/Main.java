void SpostaDisco(Torri torreMittente,Torri torreDestinatario){
    if (torreMittente.getStack() == null ){
        throw new IllegalArgumentException("Non puoi togliere qualcosa che non c'è");
    }
    if (torreDestinatario   .getStack().size()==0 || torreMittente.getStack().get(torreMittente.getStack().size() - 1) < torreDestinatario.getStack().get(torreDestinatario.getStack().size() - 1)) {
        torreDestinatario.InserisciDisco(torreMittente.getStack().get(torreMittente.getStack().size() - 1));
        torreMittente.getStack().pop();
    }
    else {
        throw new IllegalArgumentException("Non puoi inserire questo disco");
    }
}
void InFirstRastrelliera(Torri r ){
    for (int i = r.getNdischiPossibili(); i >= 1; i--){
        r.InserisciDisco(i);
    }
}
void main() {
    boolean errore = false;
    Torri r = new Torri(7);
    Torri r2 = new Torri(7);
    Torri r3 = new Torri(7);
    Map<Integer,Torri> rastrellieraMap = new HashMap<>();
    rastrellieraMap.put(1,r);
    rastrellieraMap.put(2,r2);
    rastrellieraMap.put(3,r3);
    InFirstRastrelliera(r);
    while (errore == false) {
        System.out.println(r.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        try {
            int mittente =  Integer.parseInt(IO.readln("Inserisci la torre mittente"));
            int destinatario = Integer.parseInt(IO.readln("Inserisci la torre destinataria"));
            SpostaDisco(rastrellieraMap.get(mittente), rastrellieraMap.get(destinatario));
            errore = r3.Vittoria();
        } catch (Exception e) {
            System.out.println("Errato, riprova");
            errore = false;
        }
    }
    System.out.println("Hai vinto");

}
