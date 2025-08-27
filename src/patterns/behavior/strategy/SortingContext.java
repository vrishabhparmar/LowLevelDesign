package patterns.behavior.strategy;

public class SortingContext {
    // Context holds a reference to one of the Strategies via Strategy interface
    Strategy strategy;

    public SortingContext(Strategy strategy)
    {
        this.strategy = strategy;
    }
    /**
     * To set strategy on runtime.
     */
    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] arr)
    {
        strategy.sort(arr);
    }
}

