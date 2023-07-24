public class DiagonalSum {

    public static void diagonalSum(int matrices[][]){   
        int sum=0;

        // for(int i=0; i<matrices.length; i++){               // O(n^2)
        //     for(int j=0; j<matrices[0].length; j++){
        //         // Primary diagonal condition
        //         if(i==j){
        //             sum += matrices[i][j];
        //         }
        //         // Secondary Diagonal condition
        //         else if(i+j == matrices.length-1){
        //             sum += matrices[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);

        // Optimized code for Diagonal sum  Time complexity = O(n)
        for(int i=0; i<matrices.length; i++){
            // pd
            sum += matrices[i][i];
            // sd
            if(i != matrices.length-i-1){
                sum += matrices[i][matrices.length-i-1];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrices[][] = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                            };
        diagonalSum(matrices);
    }
}
