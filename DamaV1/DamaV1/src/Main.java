void main() {
    Scacchiera scacchiera;
    try {
        scacchiera = new Scacchiera();
    } catch (DamaException e) {
        throw new RuntimeException(e);
    }

}
void disegnascacchiera(Pedina[][] s){
    for (int r=0; r<scacchiera.N_CASELLE; r++){
        String riga = "";
        for (int c =0;c< scacchiera.N_CASELLE;c++){
            if (s[r][c != null]){
                if(s[r][c] = new Pedina(r+1,c+1, Pedina.Colore.BIANCO)){
                    if (s[r][c].getTipo()== Pedina.Tipo.DAMA){
                        riga +="n";
                    }
                    else {
                        riga+="N";
                    }

                }
                if (s[r][c] = new Pedina(r+1,c+1, Pedina.Colore.NERO)){
                    if (s[r][c].getTipo()== Pedina.Tipo.DAMA){
                        riga += "b";
                    }
                    else {
                        riga+="B";
                    }
                }
            }
        }
    }
}
