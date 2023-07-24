import java.util.*;

public class Factorial {

    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for(int i=n; i>1; i--){
           fact = fact * i;
        }
        System.out.println("Factorial of given number is :"+fact); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        printFactorial(a);
    }
}
