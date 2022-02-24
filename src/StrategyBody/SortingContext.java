package StrategyBody;

public class SortingContext {
    private Sorter sorter;

    public void setSorter(Sorter sorter){
        this.sorter = sorter;
    }

    public void execute(int [] array){
        sorter.sort(array);
    }
}
