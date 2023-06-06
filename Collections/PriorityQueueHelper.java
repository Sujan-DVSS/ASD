package Collections;

import java.util.PriorityQueue;

/*
 *

The PriorityQueue class provides the functionality of the heap data structure.

It implements the Queue interface.

Unlike normal queues, priority queue elements are retrieved in sorted order.

Suppose, we want to retrieve elements in the ascending order. In this case, the head of the priority queue will be the smallest element. Once this element is retrieved, the next smallest element will be the head of the queue.

It is important to note that the elements of a priority queue may not be sorted. However, elements are always retrieved in sorted order.



 */

public class PriorityQueueHelper {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //push

        pq.offer(40);
        pq.offer(20);
        pq.offer(25);
        pq.offer(30);

        System.out.println(pq);

        //Min value is returned

        System.out.println(pq.peek()); //20

        //pop 
        System.out.println(pq.poll()); //min element of the pq is popped
        System.out.println(pq); //[25,30,40]

        /*
         * contains(element) - Searches the priority queue for the specified element. If the element is found, it returns true, if not it returns false.
         * size() - Returns the length of the priority queue.
         * toArray() -Converts a priority queue to an array and returns it.
         */
    }
}
