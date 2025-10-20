void main() {
    char[][] matrix2 = new char[3][3];
    Griglia g1 = new Griglia(matrix2);
    boolean errore;
    g1.Set_griglia(matrix2);
    System.out.println(g1.Get_griglia());
    while ((!g1.Vittoria_condizione(matrix2))&&(!g1.MatricePiena(matrix2))) {
        errore = true;
        if (!g1.Vittoria_condizione(matrix2) && (!g1.MatricePiena(matrix2))) {
            while (errore) {
                while (errore) {
                    while (errore){
                        String s1 = IO.readln("Giocatore 1 inserisci la riga in cui mettere il tuo simbolo: ");
                        g1.Verifica_stringa(s1,errore);
                        errore = g1.Verfica_riga();
                    }
                    int riga = Integer.parseInt(g1.Get_stringa());
                    g1.Set_riga(riga, errore);
                    errore = g1.Verfica_riga();
                    if (errore){
                        System.out.println("non puoi inserire una riga non presente nella griglia");
                    }
                }
                errore = true;
                while (errore) {
                    while (errore) {
                        String s2 = IO.readln("Giocatore 1 inserisci la colonna in cui mettere il tuo simbolo: ");
                        g1.Verifica_stringa(s2,errore);
                        errore = g1.Verfica_riga();
                    }
                    int colonna = Integer.parseInt(g1.Get_stringa());
                    g1.Set_colonna(colonna, errore);
                    errore = g1.Verfica_riga();
                    if (errore){
                        System.out.println("non puoi inserire una colonna non presente nella griglia");
                    }
                }
                g1.Set_simboli_input1(matrix2, errore);
                errore = g1.Verfica_riga();
                if (errore){
                    System.out.println("non puoi inserire questa combinazione perchè è già presente un simbolo");
                }
            }
            System.out.println(g1.Get_griglia());
        }


            errore = true;
            if (!g1.Vittoria_condizione(matrix2) && (!g1.MatricePiena(matrix2))) {
                while (errore) {

                    while (errore) {
                        while (errore) {
                            String s3 = IO.readln("Giocatore 2 inserisci la riga in cui mettere il tuo simbolo: ");
                            g1.Verifica_stringa(s3,errore);
                            errore = g1.Verfica_riga();
                        }
                        int rig = Integer.parseInt(g1.Get_stringa());
                        g1.Set_riga(rig, errore);
                        errore = g1.Verfica_riga();
                        if (errore){
                            System.out.println("non puoi inserire una riga non presente nella griglia");
                        }
                    }
                    errore = true;
                    while (errore) {
                        while (errore) {
                            String s4 = IO.readln("Giocatore 2 inserisci la colonna in cui mettere il tuo simbolo: ");
                            g1.Verifica_stringa(s4,errore);
                            errore = g1.Verfica_riga();
                        }
                        int colonn = Integer.parseInt(g1.Get_stringa());
                        g1.Set_colonna(colonn, errore);
                        errore = g1.Verfica_riga();
                        if (errore){
                            System.out.println("non puoi inserire una colonna non presente nella griglia");
                        }
                    }
                    g1.Set_simboli_input2(matrix2, errore);
                    errore = g1.Verfica_riga();
                    if (errore){
                        System.out.println("non puoi inserire questa combinazione perchè è già presente un simbolo");
                    }

                }
            }
        System.out.println(g1.Get_griglia());
        }
    System.out.println(g1.Vittoria(matrix2));

 }


