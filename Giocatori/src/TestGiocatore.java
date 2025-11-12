void main() {
    Giocatore totti = new Giocatore();
    totti.setNome("Francesco Totti");
    totti.setCapitano(true);
    totti.setGoal(307);
    totti.setGoalNazionale(9);

    System.out.println("Informazioni sul giocatore: ");
    System.out.println("Nome" + totti.getNome());
    System.out.println("Capitano: " + totti.getCapitano());
    System.out.println("Goal: " + totti.getGoal());
    System.out.println("Goal in nazionale: " + totti.getGoalNazionale());

    Giocatore zanetti = new Giocatore("Javier Zanetti",true,21,0);

    Giocatore delPiero = new Giocatore();
    System.out.println("Inserisci i dati sulla casa2");
    delPiero.setNome(IO.readln("inserisci il nome del giocatore"));
    delPiero.setCapitano(Boolean.parseBoolean(IO.readln("Capitano (true o false)")));
    delPiero.setGoal(Integer.parseInt(IO.readln("inserisci il numero di goal")));
    delPiero.setGoalNazionale(Integer.parseInt(IO.readln("inserisci il numero di goal in nazionale")));


}