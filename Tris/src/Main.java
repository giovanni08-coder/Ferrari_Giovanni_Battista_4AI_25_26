void main() {

////   int[][] matrix = new int[3][3];
    char[][] matrix2 = new char[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matrix2[i][j]=' ';
            }
        }
    Griglia g1 = new Griglia(matrix2);
    System.out.println(g1.Get_griglia(matrix2));
    while ((!g1.Vittoria_condizione(matrix2))&&(!g1.MatricePiena(matrix2))){
        if(!g1.Vittoria_condizione(matrix2)&&(!g1.MatricePiena(matrix2))) {
            String s1 = IO.readln("Giocatore 1 inserisci la riga in cui mettere il tuo simbolo: ");
            int riga = Integer.parseInt(s1);
            g1.Set_riga(riga);
            String s2 = IO.readln("Giocatore 1 inserisci la colonna in cui mettere il tuo simbolo: ");
            int colonna = Integer.parseInt(s2);
            g1.Set_colonna(colonna);
            System.out.println(g1.Get_simboli_input1(matrix2));

        }
        if (!g1.Vittoria_condizione(matrix2) && (!g1.MatricePiena(matrix2))) {
            String s3 = IO.readln("Giocatore 2 inserisci la riga in cui mettere il tuo simbolo: ");
            int rig = Integer.parseInt(s3);
            g1.Set_riga(rig);
            String s4 = IO.readln("Giocatore 2 inserisci la colonna in cui mettere il tuo simbolo: ");
            int colonn = Integer.parseInt(s4);
            g1.Set_colonna(colonn);
            System.out.println(g1.Get_simboli_input2(matrix2));
        }
    }
    System.out.println(g1.Vittoria(matrix2));
 }


