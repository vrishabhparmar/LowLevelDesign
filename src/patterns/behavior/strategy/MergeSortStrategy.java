package patterns.behavior.strategy;

public class MergeSortStrategy implements Strategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted Using Merge Sort");
    }
}
