void main() {
    Othello gioco = new Othello();
    System.out.println(gioco.Stampa_griglia());
    gioco.Stampa_soluzioni(3,2);
    System.out.println(gioco.Stampa_griglia());
}
