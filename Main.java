import java.util.Scanner;

public class Main {

    public static int printGreatest(int a , int b){
        if(a>b)
            return a;
         else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greatest among two numbers is : "+printGreatest(a, b));
    }
}
