void main() {
    Forza4 f1=new Forza4();
    f1.Set_griglia();
    System.out.println(f1.Get_griglia());
    System.out.println("Giocatore 1 ");
    String s1 = IO.readln("inserisci il numero della colonna in cui vuoi inserire il gettone: ");
    f1.Set_verifica_string(s1);
    int colonna=Integer.parseInt(f1.Get_colonna());
    colonna-=1;
    f1.Inserisci(colonna);
    System.out.println(f1.Get_griglia());
    System.out.println("Giocatore 1 ");
    String s2 = IO.readln("inserisci il numero della colonna in cui vuoi inserire il gettone: ");
    f1.Set_verifica_string(s2);
    int colonn=Integer.parseInt(f1.Get_colonna());
    colonn-=1;
    f1.Inserisci(colonn);
    System.out.println(f1.Get_griglia());



}
