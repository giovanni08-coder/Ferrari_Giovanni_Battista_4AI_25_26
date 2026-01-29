//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {





    Scacchiera scacchiera = null;
    try {
        scacchiera = new Scacchiera();
        Pedina[][] s = scacchiera.getScacchiera();
        Pedina attaccante = s[3][3];
        System.out.println(attaccante.getRiga() +"," +attaccante.getColonna());
        scacchiera.muovi(attaccante, 3,3);

        System.out.println(scacchiera.conta(Pedina.Colore.NERO));
        System.out.println(scacchiera.conta(Pedina.Colore.BIANCO));
    }
    catch (Exception e){
        System.out.println(e.getMessage());

    }


    System.out.println("SCACCHIERA ORIGINALE");
    disegnaScacchiera(scacchiera.getScacchiera());


}

void disegnaScacchiera(Pedina[][] s){
    for (int r = 0; r < Scacchiera.N_CASELLE; r++){
        String riga = "";
        for (int c = 0; c < Scacchiera.N_CASELLE; c++){
            if (s[r][c] != null) {
                if (s[r][c].getColore() == Pedina.Colore.NERO){
                    if (s[r][c].getTipo()==Pedina.Tipo.DAMA){
                        riga += "n";
                    }
                    else {
                        riga += "N";
                    }
                }
                else{
                    if (s[r][c].getTipo()==Pedina.Tipo.DAMA){
                        riga += "b";
                    }
                    else {
                        riga += "B";
                    }
                }
            }
            else{
                riga+=" ";
            }
        }
        System.out.println(riga);
    }
}
