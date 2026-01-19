/*
Si scriva infine una classe ProvaData dotata del solo metodo main che
fa inserire all'utente un
numero a sua scelta di date (da memorizzare in un array) chiedendo ogni
volta all'utente il tipo di
formattazione che vuole utilizzare per la data inserita, e al termine
stampa tutte le date inserite
ognuna con la formattazione scelta.
 */
int Inseriscigiorno(){
    return Integer.parseInt(IO.readln("inserisci giorno"));
}
int inseriscimese(){
    return Integer.parseInt(IO.readln("inserisci mese"));
}
int Inseriscianno(){
    return Integer.parseInt(IO.readln("inserisci anno"));
}
void main() {
    int ndate=0;
    boolean errore=true;
    while (errore) {
        errore=false;
        try {
            ndate = Integer.parseInt(IO.readln("Inserisci un numero il numero di date che vuoi creare"));
            if (ndate<=0){
                System.out.println("Non puoi inserire questo numero di date");
                errore=true;
            }
        } catch (NumberFormatException e) {
            System.out.println("errore");
            errore=true;
        }
    }
    errore=true;
    String[] date = new String[ndate];
    int contatore=0;
    for (int i=0;i<date.length;i++){
        int scelta = 0;
        while (errore) {
            errore=false;
            try {
                scelta = Integer.parseInt(IO.readln("Inserisci in che modo vuoi inserire la data se numerica o estesa, metti o 1 o 2"));
                if (scelta<1 || scelta>2){
                    errore=true;
                    System.out.println("errore,riprova");
                }
            } catch (NumberFormatException e) {
                System.out.println("errore");
                errore=true;
            }
        }
        errore=true;
        if (scelta==1){
            date[contatore] = (new DataNumerica(Inseriscigiorno(),inseriscimese(),Inseriscianno()).stringaFormattata());
            contatore++;
        }
        if (scelta==2){
            date[contatore] = new DataEstesa(Inseriscigiorno(),inseriscimese(),Inseriscianno()).stringaFormattata();
            contatore++;
        }
    }
    for (int j=0;j<date.length;j++){
        System.out.println("data " + (j+1) + " = " + date[j]);
    }
}
