import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(array[j]<array[i]){

                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(array[i]+" ");
        }
    }

}
