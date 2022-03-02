import java.util.Random;
/**
 * This abstract class follows the template design pattern. The template method,
 * called testSearch(), is used to create a template for getting the time it
 * takes to search an unsorted integer array. This allows for subclasses to
 * implement different sorting/searching algorithms with ease and reduce code
 * duplication.
 * @author Pratham Patel
 * @version 1.0
 * @since 2022-03-01
 */

public abstract class SearchTimeTemplate {
    // member variables
    protected int[] randomNums;
    private long startTime;
    private long endTime;
    protected boolean found;

    /**
     * This method sorts the array for the search algorithm (if needed). This is
     * a variant step in the template method, since its implementation can differ.
     * @param list an array of randomly generated numbers ranging from 0 to 2*size
     */
    protected abstract void sort(int[] list);

    /**
     * This method searches for an integer in the given array. This is a variant
     * step.
     * @param searchNum the number to be searched
     * @param list an array of randomly generated numbers ranging from 0 to 2*size
     */
    protected abstract void search(int searchNum, int[] list);

    /**
     * This method prints the type of search/sort being used. This is also a variant
     * step.
     */
    protected abstract void displayImplementationName();


    /**
     * The next 5 methods are invariant methods, used each time the template
     * method is called. These are useful because they reduce code duplication.
     */
    private void startTime() {
        startTime = System.nanoTime();
    }
    private void endTime() {
        endTime = System.nanoTime();
    }
    private void resetVariables() {this.found = false;}
    private void generateNumbers(int size) {
        randomNums = new int[size];
        // generate numbers
        Random rand = new Random();
        for(int i = 0; i < randomNums.length; i++) {
            randomNums[i] = rand.nextInt(size*2);
        }
    }
    // display whether the number was found and time taken
    private void displayResult(int size) {
        long timeElapsed = endTime - startTime;
        if(found) {
            System.out.println("The number was found in a randomly generated array of " + size + " integers." +
                    "\nThe time taken for this method was " + timeElapsed + " nanoseconds.");
        }
        else {
            System.out.println("The number was not found in a randomly generated array of "  + size + " integers." +
                    "\nThe time taken for this method was " + timeElapsed + " nanoseconds.");
        }
    }

    /**
     * This is a template method for creating a randomly generated integer array,
     * timing the process of searching for the number, then displaying the results.
     * @param searchNum the number to be searched
     * @param size the size of the randomly generated integer array
     */
    public final void testSearch(int searchNum, int size) {
        // intitializing variables
        resetVariables();
        generateNumbers(size);
        // timing the process of searching an unsorted array
        startTime();
        sort(randomNums);
        search(searchNum, randomNums);
        endTime();
        // displaying the results
        displayImplementationName();
        displayResult(size);
    }
}
