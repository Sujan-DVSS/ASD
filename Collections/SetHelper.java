package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetHelper {

    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(); // hashset is a set which doesn't maintain the order of elements
        Set<Integer> ls = new LinkedHashSet<>(); // hashset is a set which maintains the order of elements
        Set<Integer> ms = new TreeSet<>(Comparator.reverseOrder());// hashset is a set which maintains the order of elements. For reverse order new TreeSet<>(Comparator.reverseOrder());

        s.add(1);
        s.add(30);
        s.add(2);
        s.add(10);
        System.out.println(s); // [1,30,2,10] or [1,10,2,30] or ...so on

       System.out.println(s.contains(1)); //contains returns true if element present otherwise false

        ls.add(1);
        ls.add(30);
        ls.add(2);
        ls.add(10);

       

        System.out.println(ls); //[1,30,2,10] maintains insetion order

         //remove() - removes the specified element from the set
         //removeAll() - removes all the elements from the set

        ls.remove(1);
        System.out.println(ls); //[30,2,10]

        //convert set to list
        List<Integer> list = new ArrayList<Integer>(ls);
        System.out.println(list);

        ms.add(1);
        ms.add(30);
        ms.add(2);
        ms.add(10);

        /* access elements */

        // Calling iterator() method
        Iterator<Integer> iterate = ms.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        //for loop

        for(Integer ele: ms){
            System.out.print(ele + " "); //30 20 10 0
        }

        System.out.println(ms); //Treeset provides sorted order of the elements


        //isEmpty
        System.out.println(s.isEmpty()); //true or false

        //empty the set

        s.clear();
        System.out.println(s.isEmpty());


        
    }
    
}
