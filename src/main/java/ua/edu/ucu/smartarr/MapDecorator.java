package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    private final static String Operation = "Map";

    public MapDecorator(SmartArray arr, MyFunction fn) {
        super(arr);
    }
}
