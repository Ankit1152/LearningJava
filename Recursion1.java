import java.util.Scanner;

public class Recursion1 {

    //  To print number from 5 to 1
    // public static void printNum1(int n){
    //     if(n==0)
    //     return;
    //     System.out.println(n);
    //     printNum1(n-1);
    // }

    //  To print number from 1 to 5
    // public static void printNum2(int n){
    //     if(n==6)
    //     return;
    //     System.out.println(n);
    //     printNum2(n+1);
    // }

    //  To print the sum of first n natural numbers
    // public static void printSum(int i, int n, int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=i;
    //     printSum(i+1,n,sum);
    // }

    //  To print fibonacci series
    // public static void printfib(int a, int b, int n){
    //     if(n==0){
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     printfib(b, c, n-1);
    // }

    public static int calcPow(int x, int n){
        if(x==0)
            return 0;

        if(n==0)
            return 1;
         
        int xpownm1 = calcPow(x, n-1);
        int xpown = x*xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        // int n = 5;
        // printNum1(n);      
        // printNum2(1);
        // printSum(1,5,0);

        // Scanner sc = new Scanner(System.in);
        // int a=0, b=1, n;
        // n = sc.nextInt();
        // System.out.println(a);
        // System.out.println(b);

        // printfib(a,b,n-2);

        int x=2 , n=5;
        int ans = calcPow(x , n);
        System.out.println(ans);



    }
}
