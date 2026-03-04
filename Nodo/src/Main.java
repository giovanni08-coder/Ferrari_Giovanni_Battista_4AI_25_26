
void main() {
    Random r = new Random();
    Albero a = new Albero(new Nodo(r.nextInt(2,100),null,null));
    System.out.println(a.toString());
    int scelta = Integer.parseInt(IO.readln("Vuoi mettere un nodo all'albero, metti 1 se si o 0 se no: "));
    while (scelta==1){
        int valore = Integer.parseInt(IO.readln("Inserisci il valore dell'albero che vuoi inserire"));
        a.inserisci(valore,a.getRoot());
        System.out.println(a.toString());
        scelta = Integer.parseInt(IO.readln("Vuoi rimettere un nodo all'albero, metti 1 se si o 0 se no: "));
    }
}
