import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <Integer>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);          // [10, 20, 30, 40]

        //  Get elements
        int element = list.get(0);
        System.out.println(element);       // 10

        // add element in between 
        list.add(2,25);
        System.out.println(list);          //  [10, 20, 25, 30, 40]

        // Set element 
        list.set(0,35);
        System.out.println(list);          // [35, 20, 25, 30, 40]

        // delete element
        System.out.println(list.remove(3)); // 30
        System.out.println(list);          // [35, 20, 25, 40]

        // size
        int size = list.size();
        System.out.println(size);          // 4

        //  Loops
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");   // 35 20 25 40
        }
        System.out.println();

        // using foreach loop
        for (Integer value : list) {
            System.out.print(value+" ");       //  35 20 25 40
        }
        
        System.out.println();

        //  Using Iterator in Collections
        Iterator <Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");    //  35 20 25 40
        }

        System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.println(list);              //  [20, 25, 35, 40]

        // addAll()        Add all the elements of the another list in the current list
        List <Integer> newList = new ArrayList<>();       // Creation of another list
        newList.add(100);
        newList.add(200);
        list.addAll(newList);
        System.out.println(list);                    //  [20, 25, 35, 40, 100, 200]

        //  removes the value directly from the list
        list.remove(Integer.valueOf(200));
        System.out.println(list);                    //  [20, 25, 35, 40, 100]

         // contains()  it returns true or false
        System.out.println(list.contains(100));     // true

        //  clear() the list
        list.clear();
        System.out.println(list);                    // []



    }
}
