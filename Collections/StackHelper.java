package Collections;

import java.util.Stack;

/*

Methods in Stack Class 

empty()

It returns true if nothing is on the top of the stack. Else, returns false.

peek()

Returns the element on the top of the stack, but does not remove it.

pop()

Removes and returns the top element of the stack. An ‘EmptyStackException’ 

An exception is thrown if we call pop() when the invoking stack is empty.

push(Object element)

Pushes an element on the top of the stack.

search(Object element)

It determines whether an object exists in the stack. If the element is found,

It returns the position of the element from the top of the stack. Else, it returns -1.

Methods inherited from class java.util.Vector

METHOD


add(Object obj)	Appends the specified element to the end of this Vector.
add(int index, Object obj)	Inserts the specified element at the specified position in this Vector.
addAll(Collection c)	
Appends all of the elements in the specified Collection to the end of this Vector, 

in the order that they are returned by the specified Collection’s Iterator.

addAll(int index, Collection c)	Inserts all the elements in the specified Collection into this Vector at the specified position.
addElement(Object o)	Adds the specified component to the end of this vector, increasing its size by one.
capacity()	Returns the current capacity of this vector.
clear()	Removes all the elements from this Vector.
clone()	Returns a clone of this vector.
contains(Object o)	Returns true if this vector contains the specified element.
containsAll(Collection c)	Returns true if this Vector contains all the elements in the specified Collection.
copyInto(Object []array)	Copies the components of this vector into the specified array.
elementAt(int index)	Returns the component at the specified index.
elements()	Returns an enumeration of the components of this vector.
ensureCapacity(int minCapacity)	
Increases the capacity of this vector, if necessary, to ensure that it can hold 

at least the number of components specified by the minimum capacity argument.

equals()	Compares the specified Object with this Vector for equality.
firstElement()	Returns the first component (the item at index 0) of this vector.
get(int index)	Returns the element at the specified position in this Vector.
hashCode()	Returns the hash code value for this Vector.
indexOf(Object o)	
Returns the index of the first occurrence of the specified element in this vector, or -1 

if this vector does not contain the element.

indexOf(Object o, int index)	Returns the index of the first occurrence of the specified element in this vector, searching forwards from the index, or returns -1 if the element is not found.
insertElementAt(Object o, int index)	Inserts the specified object as a component in this vector at the specified index.
isEmpty()	Tests if this vector has no components.
iterator()	Returns an iterator over the elements in this list in proper sequence.
lastElement()	Returns the last component of the vector.
lastIndexOf(Object o)	
Returns the index of the last occurrence of the specified element in this vector, or -1

 If this vector does not contain the element.

lastIndexOf(Object o, int index)	
Returns the index of the last occurrence of the specified element in this vector, 

searching backward from the index, or returns -1 if the element is not found.

listIterator()	Returns a list iterator over the elements in this list (in proper sequence).
listIterator(int index)	
Returns a list iterator over the elements in this list (in proper sequence), 

starting at the specified position in the list.

remove(int index)	Removes the element at the specified position in this Vector.
remove(Object o)	Removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged.
removeAll(Collection c)	Removes from this Vector all of its elements that are contained in the specified Collection.
removeAllElements()	Removes all components from this vector and sets its size to zero.
removeElement(Object o)	Removes the first (lowest-indexed) occurrence of the argument from this vector.
removeElementAt(int index)	Deletes the component at the specified index.
removeRange(int fromIndex, int toIndex)	Removes from this list all the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
retainAll(Collection c)	Retains only the elements in this Vector that are contained in the specified Collection.
set(int index, Object o)	Replaces the element at the specified position in this Vector with the specified element.
setElementAt(Object o, int index)	Sets the component at the specified index of this vector to be the specified object.
setSize(int newSize)	Sets the size of this vector.
size()	Returns the number of components in this vector.
subList(int fromIndex, int toIndex)	Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive.
toArray()	Returns an array containing all of the elements in this Vector in the correct order.
toArray(Object []array)	
Returns an array containing all of the elements in this Vector in the correct order; the runtime

 type of the returned array is that of the specified array.

toString()	Returns a string representation of this Vector, containing the String representation of each element.
trimToSize()	Trims the capacity of this vector to be the vector’s current size.

*/



public class StackHelper {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        /* LIFO Approach. Implemented Using Linked List */
// Default size 10
// size = 2*n when elements are exceeding more than 10

        //push function
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        System.out.println(st); // [10,20,30,40]

        //pop 
        st.pop();
        System.out.println(st); //[10,20,30]

        //Top Element
        System.out.println(st.peek()); //30

        System.out.println(st.isEmpty()); //returns true of stack is empty
        System.out.println(st);

        //Search for an element

        System.out.println(st.search(10)); // returns position from top. If not found returns -1

    }
}
