/**
 * This class extends the SearchTimeTemplate abstract class. It implements a linear
 * search method. This class shows how the template design pattern is flexible,
 * since linear search doesn't need to use the sort() method.
 * @author Pratham Patel
 * @version 1.0
 * @since 2022-03-01
 */
public class Linear extends SearchTimeTemplate {
    // No sort needed for linear search
    @Override
    protected void sort(int[] list) { }
    @Override
    protected void search(int searchNum, int[] list) {
        for(int i = 0; i<list.length; i++) {
            if(list[i] == searchNum) {
                found = true;
                return;
            }
        }
    }
    @Override
    protected void displayImplementationName() {
        System.out.println("------------------Linear Search------------------");
    }
}
