package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListHelper {
    public static void main(String[] args) {
        
        /* Types of Initializations */

        //1. Empty list

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println(arr.size()); // 0

        //2. List with size
        ArrayList<Integer> arr1 = new ArrayList<>(10);

        System.out.println(arr1.size()); //10 allocated by the JVM

        //3. ArrayList with known values

        ArrayList<Integer> values = new ArrayList<>() {
            {
            add(1);
            add(2);
            add(3);
            }
        };
        System.out.println(values); //[1,2,3]

        //4. Convert An Static Array to arrayList
        ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(newArr); //[1, 2, 3, 4, 5]

        //5. Intialize an ArrayList Using List

        List<String> list = new ArrayList<>(List.of("abc","bca","ade"));

        System.out.println(list); //[abc, bca, ade]

/*---------------------------------------------------------------------------------- */

        /* Various methods of ArrayList */

/*---------------------------------------------------------------------------------- */

        // Add an Element

        arr.add(1);
        arr.add(2);
        arr.add(4);

        System.out.println(arr); //[1,2,4]

        // Add an element at a specific index

        arr.add(1,10); //(index,value)

        System.out.println(arr); //[1,10,2,4]

        // Add all the values of another ArrayList

        arr.addAll(values);

        System.out.println(arr); //[1, 10, 2, 4, 1, 2, 3]

        //Check if an element exists in the list

        System.out.println(arr.contains(1)); //true
        System.out.println(arr.contains(100)); //false

        //Find Index of first Occurence of an element

        System.out.println(arr.indexOf(1)); // 0

        //Find Index of Last Occurence of an element

        System.out.println(arr.lastIndexOf(1)); // 4

        //Emptying an List

        values.clear();

        //Remove an Element at a particular Index

        arr.remove(3);
        System.out.println(arr); //4 is removed -> [1, 10, 2, 1, 2, 3]

        //Remove an Element without Knowing its index

        arr.remove(Integer.valueOf(1)); // First Occurence of the given value is removed

        System.out.println(arr); // [10, 2, 1, 2, 3]

        //Deep Copy of an Arr

        Object temp =  arr.clone();
        System.out.println(temp); //[10, 2, 1, 2, 3]

        //Copy elements from one to another list while intialzing 

        ArrayList<Integer> copyArr = new ArrayList<>(arr);
        System.out.println(arr); //[10, 2, 1, 2, 3]
        System.out.println(copyArr); //[10, 2, 1, 2, 3]

        // AccessElements in a list

        System.out.println(arr.get(0)); // 10
        System.out.println(arr.get(1)); // 2

        //Change the value of an element 

        System.out.println(arr.set(0, 1)); // returns the previous value ar index 0 -> 10
        System.out.println(arr);// [1, 2, 1, 2, 3]

/*---------------------------------------------------------------------------------- */
        /* Looping Through elements of ArrayList */
/*---------------------------------------------------------------------------------- */

        //1. Simple For

        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        System.out.println();

        //2. New For

        for(Integer element: arr)
            System.out.print(element + " ");
        System.out.println();

        //3. forEach

        arr.forEach(a->{
            System.out.print(a + " ");
        });
        System.out.println();

        //4. Using Iterator 

        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}
