/*
 * Your task is to write an ArrayList like data structure
 * to store a list of integers.
 *
 * The data should be stored in “list”, an int array,
 * and the array size should double when it runs out of room.
 *
 * A constructor and a print method are given.
 *
 * You must write the getAL() and putAL() methods
 * which retrieve or append an item to the list.
 */

// DO NOT MODIFY CODE STARTING HERE
class IntArrayList {
    private static final int INIT_CAP = 10;

    private int[] list; // store data here
    private int count; // number of entries added so far

    IntArrayList() {
        list = new int[INIT_CAP];
    }

    void printAL() {
        for(int i = 0; i < count; i++) {
            System.out.println(i + ": " + list[i]);
        }
    }
    // DO NOT MODIFY CODE ABOVE HERE

    // Return the value at “index” from the list or -1
    int getAL(int index) {
        // YOUR CODE HERE
        return 0;
    }

    // Add “newInt” to the end of the list
    void putAL(int newInt) {
        // YOUR CODE HERE
    }
}