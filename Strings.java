import java.util.*;

public class Strings {
    public static void main(String[] args){
        // Concatenation of Strings
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();

        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        System.out.println(fullName.length());    // fullName.length()

        // .charAt()  

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // .compareTo()
        // s1 > s2 = +ve
        // s1 < s2 = -ve
        // s1 == s2 = 0
        
        if(firstName.compareTo(lastName)==0)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");


        // .substring(beginIndex , endIndex)
        String name = "My name is Tony Stark";
        System.out.println(name.substring(11 , 15));
        System.out.println(name.substring(11 , name.length()));
        System.out.println(name.substring(16));

        // Strings are immutable......

        String str = "12345";
        int number = Integer.parseInt(str);    // parseInt method of Integer class
        System.out.println(number+" ");

        int num = 12345;
        String s = Integer.toString(num);     // toString method of String class
        System.out.println(s);
    }
}
