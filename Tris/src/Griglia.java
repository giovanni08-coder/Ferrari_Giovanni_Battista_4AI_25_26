public class Griglia {
    public final int x = 5;
    public final int y = 3;
    public int riga;
    public int colonna;
    private String grill="";
    private static char[][] xy;
    public Griglia(){
        xy= new char[3][3];
    }
    public String Get_griglia(){
        grill="";
        for (int i =0; i<3;i++){
            for (int j=0;j<3;j++) {
                grill+=xy[i][j];
                if (j!=2){
                    grill+="  |";
                }
            }
            grill+="\n";
            grill+="---|---|---";
            grill+="\n";
        }
        return grill;
    }
    public void Set_riga(int riga){
        if (riga>=x){
            throw new IllegalArgumentException("non puoi inserire il simbolo in questa riga");
        }
        this.riga=riga;
    }
    public int Get_riga(){
        return riga;
    }
    public void Set_colonna(int colonna){
        if (colonna>=y){
            throw new IllegalArgumentException("non puoi inserire il simbolo in questa riga");
        }
        this.colonna=colonna;
    }
    public int Get_colonna(){
        return colonna;
    }
    public String Get_simboli_input1(){
        xy[Get_riga()][Get_colonna()]='X';
        return Get_griglia();

    }
    public String Get_simboli_input2(){
        xy[Get_riga()][Get_colonna()]='0';
        return Get_griglia();
    }
}

