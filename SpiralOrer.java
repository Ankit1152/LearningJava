public class SpiralOrer {

    public static void printSpiral(int matrices[][]){
        int rowStart = 0;
        int rowEnd = matrices.length-1;
        int colStart = 0;
        int colEnd = matrices[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            // top
            for(int j=colStart; j<=colEnd; j++){
                System.out.print(matrices[rowStart][j]+" ");
            }
            // Right
            for(int i=rowStart+1; i<=rowEnd; i++){
                System.out.print(matrices[i][colEnd]+" ");
            }
            // bottom
            for(int j=colEnd-1; j>=colStart; j--){
                System.out.print(matrices[rowEnd][j]+" ");
            }
            // left
            for(int i=rowEnd-1; i>=rowStart+1; i--){
                System.out.print(matrices[i][colStart]+" ");
            }

            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrices[][] = {{1,5,7,9,10,11},
                            {6,10,12,13,20,21},
                            {9,25,29,30,32,41},
                            {15,55,59,63,68,70},
                            {40,70,79,81,95,105}};
    
        // printSpiral(matrices)
    }
}
