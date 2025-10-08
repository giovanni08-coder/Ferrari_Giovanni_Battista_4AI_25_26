
void main() {
    Mostro a= new Mostro();
    Mostro a2= new Mostro();
    a.Cambianome("Franco");
    System.out.println("il primo mostro è: " + a.mostranome() + " power " + a.mostraenergia());
    System.out.println("il primo mostro è: " + a2.mostranome() + " power " + a2.mostraenergia());

    Player p1= new Player();
    p1.setNome("Fede");
    p1.setId("Dragon58");
    System.out.println("Il nome del player è: " + p1.getNome());
    Player p2 = new Player();
    p2.setNome("Coumba");
    p2.setId("Dragon08");

    IO.println(p1.toString());
    IO.println(p2.toString());

}
