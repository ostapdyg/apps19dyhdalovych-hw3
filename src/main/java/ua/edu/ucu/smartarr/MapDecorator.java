package ua.edu.ucu.smartarr;

import java.util.Arrays;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private MyFunction funct;

    public MapDecorator(SmartArray arr, MyFunction fn) {
        super(arr);
        this.operation = "Map " + this.operation;
        this.funct = fn;
    }

    @Override
    public Object[] toArray() {
        return Arrays.stream(this.smartArray.toArray()).
                      map(o -> this.funct.apply(o)).toArray();
    }
}
