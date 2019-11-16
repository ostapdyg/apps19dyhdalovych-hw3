package ua.edu.ucu.smartarr;

import java.util.Arrays;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    private MyComparator comparator;

    public SortDecorator(SmartArray arr, MyComparator cmp) {
        super(arr);
        this.comparator = cmp;
        this.operation = "Sort " + this.operation;
    }

    @Override
    public Object[] toArray() {
        return Arrays.stream(this.smartArray.toArray()).
                      sorted(this.comparator).toArray();
    }

}
