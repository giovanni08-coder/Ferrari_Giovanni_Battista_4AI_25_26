
void main() {
    //Mago m = new Mago("Gjini");
    //System.out.println(m);
    Personaggio p1 = new Personaggio("lapo");
    Personaggio P2 = new Personaggio("manila");
    Personaggio p3 = new Personaggio("Franci");
    Zombie zombie = new Zombie("Frank");
    zombie.cattura(P2);
    System.out.println(zombie);


}
