void main() {
    Televisione t1 = new Televisione("Samsung");
    Televisione t2 = t1;
    t1 = new Televisione("Xiaomi"); // Una nuova istanza viene creata nell'heap,
                                                    // quella vecchia rimane vacante
    // t1.Televisione("Samsung"); -> non si può chiamare più volte il costruttore
    Televisione t3 = new Televisione("Lenovo");
    // t1 è un'istanza della classe Televisione

    // t2.canale = 51; // Quello che viene modificato in
                    // t2 viene modificato anche in t1,
                    // essendo che condividono il riferimento
                    // allo stesso oggetto
    /*IO.println("T1" + t1.volume); // 0
    IO.println(t1.canale); // 0
    IO.println(t1.marca); // null
    IO.println(t1.dimesione); // 0.0f
    IO.println(t1.colore); // false
    IO.println(t1.accesa + "\n"); // false

    IO.println("T2" + t2.volume);
    IO.println(t2.canale);
    IO.println(t2.marca);
    IO.println(t2.dimesione);
    IO.println(t2.colore);
    IO.println(t2.accesa + "\n");

    IO.println("T3" + t3.volume);
    IO.println(t3.canale);
    IO.println(t3.marca);
    IO.println(t3.dimesione);
    IO.println(t3.colore);
    IO.println(t3.accesa);*/
    int canale=-1;
    try {
        String c=IO.readln("inserisci un canale: ");
        canale=Integer.parseInt(c);

    } catch (Exception e) {
        System.out.println("formato non corretto");
    }
    if (canale!=-1){
        t1.impostaCanale(canale);
        System.out.println("il nuovo canale è: " + t1.canaleCorrente());
    }
}

