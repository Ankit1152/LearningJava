import java.util.Scanner;

public class StrQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String username = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }

        System.out.println(username);
        // String original = sc.next();
        // String result = "";

        // for(int i=0; i<original.length(); i++){
        //     if(original.charAt(i)== 'e'){
        //         result += 'i';
        //     }else{
        //         result += original.charAt(i);
        //     }
        // }
        // System.out.println(result);
    }
}
