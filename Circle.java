import java.util.Scanner;

public class Circle {
    public static Double findCircumference(Double r){
      return 2*3.14*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();

        System.out.println("Circumference of a Circle is :"+findCircumference(r));
    }
}
