void main() {
    char[][] matrix2 = new char[3][3];
    Griglia g1 = new Griglia(matrix2);
    boolean errore=true;
    boolean errore2=true;
    boolean errore3=true;
    boolean errore4=true;
    g1.Set_griglia(matrix2);
    System.out.println(g1.Get_griglia());
    while ((!g1.Vittoria_condizione(matrix2))&&(!g1.MatricePiena(matrix2))){
        errore=true;
        if(!g1.Vittoria_condizione(matrix2)&&(!g1.MatricePiena(matrix2))) {
            while (errore) {
                String s1 = IO.readln("Giocatore 1 inserisci la riga in cui mettere il tuo simbolo: ");
                int riga = Integer.parseInt(s1);
                g1.Set_riga(riga,errore);
                errore=g1.Verfica_riga();
            }
            errore=true;
            while (errore){
                String s2 = IO.readln("Giocatore 1 inserisci la colonna in cui mettere il tuo simbolo: ");
                int colonna = Integer.parseInt(s2);
                g1.Set_colonna(colonna,errore);
                errore=g1.Verfica_colonna();
            }
            System.out.println(g1.Get_simboli_input1(matrix2));

        }
        errore=true;
        if (!g1.Vittoria_condizione(matrix2) && (!g1.MatricePiena(matrix2))) {
            while (errore) {
                String s3 = IO.readln("Giocatore 2 inserisci la riga in cui mettere il tuo simbolo: ");
                int rig = Integer.parseInt(s3);
                g1.Set_riga(rig,errore);
                errore=g1.Verfica_riga();
            }
            errore=true;
            while (errore) {
                String s4 = IO.readln("Giocatore 2 inserisci la colonna in cui mettere il tuo simbolo: ");
                int colonn = Integer.parseInt(s4);
                g1.Set_colonna(colonn, errore);
                errore = g1.Verfica_colonna();
            }
            System.out.println(g1.Get_simboli_input2(matrix2));
        }
    }
    System.out.println(g1.Vittoria(matrix2));
 }


