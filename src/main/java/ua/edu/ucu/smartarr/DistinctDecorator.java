package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {


    public DistinctDecorator(SmartArray arr) {
        super(arr);
        this.operation = "Distinct " + this.operation;

    }

    @Override
    public Object[] toArray() {
        return Arrays.stream(this.smartArray.toArray()).
                      distinct().toArray();
    }
}
