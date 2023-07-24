import java.util.*;

public class Vote {

    public static void toCheck(int age){
        if(age>18)
            System.out.println("Eligible for voting...");
         else
             System.out.println("Not eligible for vote");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
         
        toCheck(age);
    }
}
