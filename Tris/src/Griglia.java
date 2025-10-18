public class Griglia {
    public final int x = 2;
    public final int y = 2;
    public int riga;
    public int colonna;
    private static char[][] griglia;
    private String grill="";
    private static char[][] xy;
    public Griglia(){
        griglia= new char[x][y];
    }
    public void Set_griglia(){
        for (int r=0; r< 2; r++){
            for (int c=0; c<2; c++){
                    this.griglia[r][c] = '|';
            }
        }
    }
    public String Get_griglia(){
        for (int r=0; r< 2; r++){
            for (int c=0; c<2; c++){
                if(griglia[r][c]!='Ø') {
                    grill += griglia[r][c];
                }
            }
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
    public void Get_simboli_input1(){
        xy[Get_riga()][Get_colonna()]='X';
    }
    public void Get_simboli_input2(){
        xy[Get_riga()][Get_colonna()]='0';
    }
}

