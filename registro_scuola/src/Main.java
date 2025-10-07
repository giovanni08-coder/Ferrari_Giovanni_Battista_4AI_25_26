//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// registro scuola: permette l'inserimento visualizzazione eliminazione e modifica di targhe
// Se la targa è presenta nella lista di targhe la mia targa può entrare
    public static void Menu(){
        System.out.println("Premi 1 per inserire una targa");
        System.out.println("Premi 2 per visualizzare le targhe presenti in lista");
        System.out.println("Premi 3 per eliminare una targha ");
        System.out.println("Premi 4 per cercare la targa e per sapere " +
                "se la targa in ingresso può entrare ");
    }
public static String Lettere_in_Grande(String a){
    String l="";
        for (int i = 0; i < a.length(); i++) {
            if (i == 0 || i == 1) {
                char b = Character.toUpperCase(a.charAt(i));
                l = l + b ;
            }
    }

    System.out.println(l);
    return a;
}
public static void Inserimento(List<String>a){
    boolean errore=true;
    while (errore) {
        errore=false;
        System.out.println("Inserisci la targa del mezzo utilizzato: ");
        String b=IO.readln();
        if (b.matches("[a-zA-Z]{2}[0-9]{3}[a-zA-Z]{2}")) {
            a.add(b);
        } else {
            System.out.println("messaggio errato");
            errore=true;
        }
    }
}

    public static void Elimina(){

    }
    public static void Modifica(){

    }
    public static void Visualizza(){

    }
    public static void Cerca(){

    }
    void main() {
    String d="aa123bb";
        //Menu();
        List<String> li= new ArrayList<String>();
        //Inserimento(li);
        String f= Lettere_in_Grande(d);
        System.out.println(f);

}
