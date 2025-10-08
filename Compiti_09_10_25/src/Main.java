void main() {
/*Classe Studente
Crea una classe Studente che rappresenti uno studente in una scuola. La classe dovrà avere i seguenti attributi e metodi:
Attributi
nome: stringa che rappresenta il nome dello studente.
cognome: stringa che rappresenta il cognome dello studente.
matricola: stringa che rappresenta il numero di matricola.
annoIscrizione: intero che rappresenta l'anno di iscrizione dello studente.
voti: lista di numeri decimali che rappresenta i voti ottenuti dallo studente
Metodi
Costruttore: che inizializza i valori degli attributi.
AggiungiVoto(float voto): metodo per aggiungere un voto alla lista dei voti.
CalcolaMedia(): metodo che restituisce la media dei voti.
StampaDettagli(): metodo per stampare i dettagli dello studente, inclusi nome, cognome, matricola, anno di iscrizione e media dei voti.


 */
Automobile auto= new Automobile();
Studente studente= new Studente();
    System.out.println(auto.toString());
    auto.getAggiorna_Chilometraggio(200000);
    System.out.println(auto.getKm());
    System.out.println(auto.calcolaetà());
    studente.Aggiungi_voto(7);
    studente.Aggiungi_voto(4);
    studente.Aggiungi_voto(5);
    System.out.println(studente.CalcolaMedia());
    System.out.println(studente.toString());
}
