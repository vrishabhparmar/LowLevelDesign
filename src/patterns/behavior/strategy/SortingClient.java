package patterns.behavior.strategy;

public class SortingClient {

    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new MergeSortStrategy());
        sortingContext.executeStrategy(new int[]{1,23,4});

        SortingContext sortingContext2 = new SortingContext(new BubbleSortStrategy());
        sortingContext2.executeStrategy(new int[]{1,23,4});
    }

}
