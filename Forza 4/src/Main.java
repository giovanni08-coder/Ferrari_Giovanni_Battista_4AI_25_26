void main() {
    Forza4 f1=new Forza4();
    f1.Set_griglia();
    System.out.println(f1.Get_griglia());
    System.out.println("Giocatore 1 ");
    boolean errore=true;
    while (errore) {
        while (errore) {
            String s1 = IO.readln("inserisci il numero della colonna in cui vuoi inserire il gettone: ");
            if (s1.equals("") || !s1.matches("[1-7]")) {
                throw new IllegalArgumentException("non puoi inserire il seguente valore ");
            }
            int colonna = Integer.parseInt(s1);
            f1.Inserisci(colonna);
            f1.Set_griglia();
            System.out.println(f1.Get_griglia());
            errore=f1.Verifica_vittoria();
        }
        while (errore) {
            System.out.println("Giocatore 2 ");
            String s2 = IO.readln("inserisci il numero della colonna in cui vuoi inserire il gettone: ");
            if (s2 == "" || !s2.matches("[1-7]")) {
                throw new IllegalArgumentException("non puoi inserire il seguente valore ");
            }
            int colonn = Integer.parseInt(s2);
            f1.Inserisci(colonn);
            f1.Set_griglia();
            System.out.println(f1.Get_griglia());
            errore = f1.Verifica_vittoria();
        }
    }
    System.out.println(f1.Chi_vince());



}
