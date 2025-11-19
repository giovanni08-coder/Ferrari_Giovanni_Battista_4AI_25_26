char cambia_turno(char simbolo,Griglia griglia){
    if (griglia.controllaVincita()=='N'){
        if (simbolo == griglia.SIMBOLO_X){
            simbolo=griglia.SIMBOLO_O;
        }
        else simbolo=griglia.SIMBOLO_X;
    }
    return simbolo;
}
void main() {
    Griglia griglia = new Griglia();
    char simbolo = 'X';
    while (griglia.controllaVincita() == 'N') {
        String s1 = IO.readln("Giocatore inserisci la riga in cui mettere il tuo simbolo: ");
        String s2 = IO.readln("Giocatore inserisci la colonna in cui mettere il tuo simbolo: ");
        griglia.inserisciSimbolo(simbolo, Integer.parseInt(s2), Integer.parseInt(s1));
        griglia.cambia_griglia();
        System.out.println(griglia.Get_griglia());
        griglia.controllaVincita();
        simbolo = cambia_turno(simbolo, griglia);
    }
    System.out.println("Ha vinto il giocatore: ");
    System.out.println(griglia.controllaVincita());
}
