public class Revision{
    public static boolean isDuplicate(int array[]){
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        System.out.println(isDuplicate(array));
    }
}