package patterns.behavior.strategy;

public class BubbleSortStrategy implements Strategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted using Bubble sort");
    }
}


