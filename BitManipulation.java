import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        System.out.println("**************Get Bit**************");
         // Get bit
    //     int n = 5;
    //     int pos = 3;

    //     int bitmask = 1<<pos;

    //    if((bitmask&n) == 0){
    //     System.out.println("Bit was zero");
    //    } else{
    //     System.out.println("Bit was one");
    //    }

       System.out.println("**************Set Bit**************");
         // Set bit
       
    //    int n = 5;                            0101
    //    int pos = 1;
    //    int bitmask = 1<<pos;                 0001 << 1
    //                                          0010
    //    int new_number = n | bitmask;         0101 = n
    //                                          0010 = bitmask                                            
    //    System.out.println(new_number);       0111 = 7  

       
       System.out.println("**************Clear Bit**************");
       // Clear Bit

    //    int n = 5;                            // 0101
    //    int pos = 2;                           
    //    int bitmask = 1<<pos;                 // 0100

    //    int notbitmask = ~(bitmask);          // 1011

    //    int new_number = notbitmask & n;      // 1011 & 0101 = 0001
    //    System.out.println(new_number );      // 1


       System.out.println("**************Update Bit**************");
       Scanner sc = new Scanner(System.in);
       
       int opr = sc.nextInt();      // opr = 1 :- Set bit    opr = 2 :- Clear bit

       int n = 5;       // 0101
       int pos = 1;

       int bitmask = 1<<pos;     // 0010
       if(opr==1){
         //  Set bit
         int new_number = bitmask | n;      // 0101 | 0010 = 0111
         System.out.println(new_number);    // 7
       }else{
         // clear bit
         int newBitmask = ~(bitmask);      // 1101
         int new_number = newBitmask & n;  //1101 & 0101 = 0101
         System.out.println(new_number);   // 5
       }
       
   }

    
}
