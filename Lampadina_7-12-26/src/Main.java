//crea lampadine, accenda tutte le lampadine,
//conta le lampadine bruciate;
//posiziona le lampadine a caso sullo schermo
//butta le lampadine rotte
//numera accensioni andate a buon fine

   /*
    Lampadina l1 = new Lampadina();
    Lampadina l2 = new Lampadina();
    Lampadina l3 = new Lampadina();
    l1.posiziona(100,150);
    l2.posiziona(100,100);

    for (int i =0;i<=200;i++){
        l1.accendi();
        l1.spegni();
    }

    System.out.println(l1);
    System.out.println(l2);
     */
List<Lampadina> lista_Lampadine = new ArrayList<>();
void creaLampadine(List <Lampadina>lista_Lampadine) {
    int lampadine;
    boolean errore = true;
    while (errore) {
        try {
            lampadine = Integer.parseInt(IO.readln("Inserisci il numero di lampadine che vuoi creare"));
            if (lampadine > 0 && lampadine < 1000) {
                for (int i = 0; i < lampadine; i++) {
                    lista_Lampadine.add(new Lampadina());
                }
                errore = false;
            } else {
                System.out.println("Riprova non puoi");
            }
        } catch (NumberFormatException e) {
            System.out.println("Errore Numerico");
        }
    }
}

void accendiTutto(List <Lampadina>lista_Lampadine){
    if (lista_Lampadine.isEmpty()){
        System.out.println("Non puoi accendere delle lampadine poichè non ci sono lampadine");
    }
    for (int i=0;i<lista_Lampadine.size();i++){
        lista_Lampadine.get(i).accendi();
    }
}
void Spegni_Tutte(List <Lampadina>lista_Lampadine){
    if (lista_Lampadine.isEmpty()){
        System.out.println("Non puoi accendere delle lampadine poichè non ci sono lampadine");
    }
    for (int i=0;i<lista_Lampadine.size();i++){
        lista_Lampadine.get(i).spegni();
    }
}
void posiziona_lampadine(List <Lampadina>lista_Lampadine){
    Random random = new Random();
    if (lista_Lampadine.isEmpty()){
        System.out.println("Non puoi posizionare delle lampadine poichè non ci sono lampadine");
    }
    for (int i =0;i<lista_Lampadine.size();i++){
        lista_Lampadine.get(i).posiziona(random.nextInt(1000), random.nextInt(1000));
    }
}
void throwNastyLamp(List <Lampadina>lista_Lampadine){
    for (int i=0;i<lista_Lampadine.size();i++){
        if (lista_Lampadine.get(i).getStato()==StatoLampadina.ROTTA){
            lista_Lampadine.remove(lista_Lampadine.get(i));
        }
    }
}
String nAccensioni(List <Lampadina>lista_Lampadine){
    int accensioni = 0;
    for (int i=0;i<lista_Lampadine.size();i++){
        accensioni += lista_Lampadine.get(i).getAccensioni();
    }
    return "Le accensioni andate a buon fine sono: " + accensioni;
}
void AccendiOne(List <Lampadina>lista_Lampadine){
    int lampadina = Integer.parseInt(IO.readln("Inserisci l'indice della lampadina che vuoi accendere"));
    lista_Lampadine.get()
}
void SpegniOne(List <Lampadina>lista_Lampadine){

}
void Menu(){
    System.out.println("Premi 1 per creare tot lampadine");
    System.out.println("Premi 2 per accenderle tutte");
    System.out.println("Premi 3 per spegnerle tutte");
    System.out.println("Premi 4 per posizionarle a caso");
    System.out.println("Premi 5 per buttattare le lampadine rotte");
    System.out.println("Prmei 6 per visualizzare il numero di accensioni andate a buon fine");
    System.out.println("Premi 7 per accendere una lampadina");
    System.out.println("Premi 8 per spegnere una lampadina");
}
void main() {
    creaLampadine(lista_Lampadine);
    posiziona_lampadine(lista_Lampadine);
    accendiTutto(lista_Lampadine);
    System.out.println(lista_Lampadine);

    System.out.println(nAccensioni(lista_Lampadine));
}
