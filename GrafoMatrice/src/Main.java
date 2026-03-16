void main() {
    GrafoListaAdiacenza g = new GrafoListaAdiacenza(4);

    g.aggiungiArco(0, 1, 5);
    g.aggiungiArco(0, 2, 3);
    g.aggiungiArco(1, 3, 7);
    g.stampa();

}
