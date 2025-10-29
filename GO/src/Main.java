void stampaGioco(char[][] gri, int d){
    for (int r=0;r<d; r++){
        for (int c=0;c< d;c++){
            IO.print(gri[c][r]);
            IO.print(' ');
        }
        IO.println();

    }
}
void main() {
    boolean finito=false;
    GO g = new GO(1);
    while (!finito) {
        IO.print("X ha " + g.GetnumPietre('X') + " pietre");
        IO.println("O ha " + g.GetnumPietre('O') + " pietre");
        stampaGioco(g.getGriglia(), g.getdimGriglia());
        try {

            String s = IO.readln("Dove vuoi mettere la prossima pietra?");
            int r = Integer.parseInt(s);
            s = IO.readln();
            int c = Integer.parseInt(s);
            g.mossa(r, c);
        } catch (Exception e) {
            IO.println(e.getMessage());
        }
    }
        char[][] gri = g.getGriglia();
        gri[3][3] = 'z';
}
