/*
 * Your task is to write an ArrayList like data structure
 * to store a list of items of any type.
 *
 * Within a list, all the items have the same type.
 *
 * The data should be stored in “list”, an array,
 * and the array size should double when it runs out of room.
 *
 * A constructor and a print method are given.
 *
 * You must write the getAL() and putAL() methods
 * which retrieve or append an item to the list.
 */

// DO NOT MODIFY CODE STARTING HERE
class ArrayList<E> {
    private static final int INIT_CAP = 10;

    private E[] list; // store data here
    private int count; // number of entries added so far

    ArrayList() {
        list = (E[]) new Object[INIT_CAP];
    }

    void printAL() {
        for(int i = 0; i < count; i++) {
            System.out.println(i + ": " + list[i]);
        }
    }
    // DO NOT MODIFY CODE ABOVE HERE

    // Return the value at “index” from the list or null
    E getAL(int index) {
        // YOUR CODE HERE
        return null;
    }

    // Add “newObj” to the end of the list
    void putAL(E newObj) {
        // YOUR CODE HERE
    }
}
