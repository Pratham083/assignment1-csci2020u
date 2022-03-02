import java.util.Arrays;
/**
 * This class extends the SearchTimeTemplate abstract class. It uses bubble sort
 * O(n^2) for the sort method and binary search O(log(n)) for the search method.
 * @author Pratham Patel
 * @version 1.0
 * @since 2022-03-01
 */
public class BubbleBinary extends SearchTimeTemplate {
    // My implementations of bubble sort and binary search
    @Override
    protected void sort(int[] list) {
        for(int i = 0; i < list.length-1 ; i++) {
            for(int a = 0; a < list.length-i-1; a++) {
                if(list[a] > list[a+1]){
                    // swap values
                    int temp = list[a];
                    list[a] = list[a+1];
                    list[a+1] = temp;
                }
            }
        }
    }
    @Override
    protected void search(int searchNum, int[] list) {
        if(list.length > 1) {
            int midpoint = list.length/2;
            int[] leftHalf = Arrays.copyOfRange(list, 0,midpoint);
            int[] rightHalf = Arrays.copyOfRange(list, midpoint, list.length);
            if(searchNum < list[midpoint]) {
                search(searchNum,leftHalf);
            }
            else if(searchNum > list[midpoint]) {
                search(searchNum,rightHalf);
            }
            else {
                found = true;
            }
        }
        else if(list.length == 1){
            if(searchNum == list[0]) {
                found = true;
            }
        }
    }
    @Override
    protected void displayImplementationName() {
        System.out.println("------------------Bubble Sort + Binary Search------------------");
    }
}
