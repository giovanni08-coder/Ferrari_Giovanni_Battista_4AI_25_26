void main() {
    char[][] griglia=new char[6][7];
    String grill="";
    Forza4 f1=new Forza4(griglia);
    f1.Set_griglia(griglia,grill);
    System.out.println(f1.Get_griglia());
    System.out.println("Giocatore 1 ");
    String s1 = IO.readln("inserisci il numero della colonna in cui vuoi inserire il gettone: ");
    f1.Set_verifica_string(s1);
    int colonna=Integer.parseInt(f1.Get_colonna());
    colonna-=1;


}
