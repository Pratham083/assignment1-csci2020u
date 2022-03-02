import java.util.Arrays;
/**
 * This class extends the SearchTimeTemplate abstract class. It uses the java
 * Arrays library for the sorting and searching methods. The Arrays library uses
 * Timsort O(nlog(n)) and binary search O(log(n)).
 * @author Pratham Patel
 * @version 1.0
 * @since 2022-03-01
 */

public class TimBinary extends SearchTimeTemplate{
    // simple implementations of the variant methods of the template class
    @Override
    protected void sort(int[] list) {
        Arrays.sort(list);
    }
    @Override
    protected void search(int searchNum, int[] list) {
        int result = Arrays.binarySearch(list, searchNum);
        if(result >= 0) {
            this.found = true;
        }
    }
    @Override
    protected void displayImplementationName() {
        System.out.println("------------------Timsort + Binary Search------------------");
    }
}
