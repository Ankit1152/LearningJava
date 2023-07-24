import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the Array");
        // int size = sc.nextInt();
        // int marks[] = new int[size];

        // System.out.println("Enter the marks:");

        // for(int i=0; i<size; i++){
        //     marks[i] = sc.nextInt();
        // }
          
        // for(int i=0; i<size; i++){
        //     System.out.println(marks[i]);
        // }

        // System.out.println("*****2nd way of declare the Array*********"); 
        // int marks2[] = {98 , 95 , 99};
        // for(int i=0; i<3; i++){
        //     System.out.println(marks2[i]);
        // }
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value to be search :");
        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("Value at index :"+i);
            }
        }

        
    }
}
