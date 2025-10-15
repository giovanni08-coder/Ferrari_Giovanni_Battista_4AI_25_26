public class Griglia {
    public final int x = 3;
    public final int y = 3;
    private char[][] griglia;
    public Griglia(){
        griglia= new char[x][y];
    }
    public void Set_griglia(){
        for (int r=0; r< 3; r++){
            for (int c=0; c<3; c++){
                griglia[r][c] = '|';
            }
        }
    }
    public char[][] Get_griglia(){
        return griglia;
    }
}
