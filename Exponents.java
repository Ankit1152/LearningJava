import java.util.Scanner;

public class Exponents {

    public static void printPower(int x , int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result * x;
        }

        System.out.println("x is to the power of n is :"+ result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
         
        printPower(x , n);
        
        }
}
