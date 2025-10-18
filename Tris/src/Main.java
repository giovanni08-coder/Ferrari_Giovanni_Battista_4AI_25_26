void main() {
    Griglia g1 = new Griglia();
////   int[][] matrix = new int[3][3];
    int[][] matrix2 = new int[3][3];
    /*
    for (int i = 0; i < matrix.length; i++)
    {
        // length returns number of rows
        System.out.print("row " + i + " : ");
        for (int j = 0; j < matrix[i].length; j++)
        {
            // here length returns # of columns corresponding to current row
            System.out.print("col " + j + "  ");
        }
    }*/
    matrix2[1][0]=1;
    matrix2[0][0]=5;
    matrix2[1][2]=8;
/*
   for (int i =0; i<3;i++){
       for (int j=0;j<3;j++) {
           System.out.print(matrix2[i][j]);
           if (j!=2){
               System.out.print( "  |");
           }
       }
       System.out.println();
       System.out.println("---|---|---");
   }*/
    g1.Set_griglia();
    System.out.println(g1.Get_griglia());

}
