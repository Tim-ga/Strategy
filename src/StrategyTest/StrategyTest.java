package StrategyTest;

import StrategyBody.*;
import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void execute() {
        int[] expectedArray = {0,1,2,3,4,5,6,7,8,9};
        int[] actualArray1 = {3,8,1,6,5,0,4,2,9,7};
        int[] actualArray2 = {3,8,1,6,5,0,4,2,9,7};

        SortingContext context = new SortingContext();

        context.setSorter(new SelectionSort());
        context.execute(actualArray1);
        Assert.assertArrayEquals(expectedArray, actualArray1);

        context.setSorter(new BubbleSort());
        context.execute(actualArray2);
        Assert.assertArrayEquals(expectedArray, actualArray2);
    }
}
