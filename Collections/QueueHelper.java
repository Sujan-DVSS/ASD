package Collections;

import java.util.LinkedList;
import java.util.Queue;



public class QueueHelper {
    public static void main(String[] args) {
        /* QUEUE - FIFO*/
        /*TC - Insert - O(1), Delete - O(1), Count - O(size), Top - O(1) */

        Queue<Integer> q = new LinkedList<>();

        //Insert (from rear)

        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q); //[10,20,30]
        //Delete (from front)

        q.poll(); // 10 is removed
        System.out.println(q); //[20,30]

        //Front Element
        System.out.println(q.peek()); //20

        


        
    }
}
