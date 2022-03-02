/**
 * This program measures the time taken to search in an unsorted integer array.
 * It uses the template method to easily implement different search/sort methods
 * while reducing code duplication.
 * @author Pratham Patel
 * @version 1.0
 * @since 2022-03-01
 */
public class Main {
    public static void main(String[] args) {
        // choose a search number from 0 - size*2
        SearchTimeTemplate linearTest = new Linear();
        linearTest.testSearch(5, 1000);

        SearchTimeTemplate bubbleBinaryTest = new BubbleBinary();
        bubbleBinaryTest.testSearch(5, 1000);

        SearchTimeTemplate timBinary = new TimBinary();
        timBinary.testSearch(5, 1000);
    }
}
