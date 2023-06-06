package Collections;

import java.util.ArrayDeque;

/*
 * An ArrayDeque (also known as an “Array Double Ended Queue”, pronounced as “ArrayDeck”) is a special kind of a growable array that allows us to add or remove an element from both sides.

 * An ArrayDeque implementation can be used as a Stack (Last-In-First-Out) or a Queue(First-In-First-Out).
 */

public class ArrayDequeueHelper {
    public static void main(String[] args) {
        
        /*
         * Insert elements using offer(), offerFirst() and offerLast()

        offer() - inserts the specified element at the end of the array deque
        offerFirst() - inserts the specified element at the beginning of the array deque
        offerLast() - inserts the specified element at the end of the array deque

         */

         ArrayDeque<String> animals= new ArrayDeque<>();
        // Using offer()
        animals.offer("Dog");

        // Using offerFirst()
        animals.offerFirst("Cat");

        // Using offerLast()
        animals.offerLast("Horse");
        System.out.println("ArrayDeque: " + animals); //ArrayDeque: [Cat, Dog, Horse]

         // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element); //Head Element: Dog

        // Using peekFirst()
        String firstElement = animals.peekFirst();
        System.out.println("First Element: " + firstElement); //Head Element: Dog

        // Using peekLast
        String lastElement = animals.peekLast();
        System.out.println("Last Element: " + lastElement); //Last Element: Horse

        // Using poll()
        String element1 = animals.poll();
        System.out.println("Removed Element: " + element1);//Removed Element: Dog
        System.out.println("New ArrayDeque: " + animals); //New ArrayDeque: [Cat, Cow, Horse]

        // Using pollFirst()
        String firstElement1 = animals.pollFirst();
        System.out.println("Removed First Element: " + firstElement1); //Removed First Element: Cat

        // Using pollLast()
        String lastElement1 = animals.pollLast();
        System.out.println("Removed Last Element: " + lastElement1); //Removed Last Element: Horse

/*
 * element() - Returns an element from the head of the array deque.
contains(element) - Searches the array deque for the specified element. If the element is found, it returns true, if not it returns false.
size() - Returns the length of the array deque.
toArray() - Converts array deque to array and returns it.
clone() - Creates a copy of the array deque and returns it.
 */
    }
}
