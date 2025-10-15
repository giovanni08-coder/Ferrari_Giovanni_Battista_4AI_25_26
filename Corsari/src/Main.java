void main() {
    final int righe = 5;
    final int colonne = 30;
    char[][] mare = new char[righe][colonne];


    //inizializzo il mare
    for (int i=0; i < righe; i++){
        for (int c = 0; c < colonne; c++){
            mare[i][c] = '~';
        }
    }
    // posiziono corsari e ostacoli
    mare[0][0] = 'R';
    mare[1][29] = 'A';
    mare[3][12] = 'N';
    mare[3][2] = '+';
    mare[1][8] = '0';
    mare[3][5] = '@';
    for (int i=0; i < righe; i++){
        for (int c = 0; c < colonne; c++){
            IO.print(mare[i][c]);

        }
        IO.println();
    }
    // individuo nel mare i corsari
    for (int i=0; i < righe; i++){
        for (int c = 0; c < colonne; c++){
            if (Character.isLetter(mare[i][c])){
                IO.println("Trovato corsaro: " + mare[i][c] );
                IO.println("(" + "in riga: " + i + " colonna: " + c + ")");
            }
        }
        IO.println();
    }
    //creo un muro
    int r1,c1,l;
    r1=1;
    c1=15;
    l=3;

    for (int u=0; u<l;u++){
        mare[r1 +u][c1] = '|';
    }
    //stampo il mare
    for (int i=0; i < righe; i++){
        for (int c = 0; c < colonne; c++){
            IO.print(mare[i][c]);

        }
        IO.println();
    }
}
