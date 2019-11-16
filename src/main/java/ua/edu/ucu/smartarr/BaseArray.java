package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] elems;
    private String operation;

    public BaseArray(Object[] elems) {
        this.elems = Arrays.copyOf(elems, elems.length);
        this.operation = "Base Array";
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.elems, this.elems.length);
    }

    @Override
    public String operationDescription() {
        return this.operation;
    }

    @Override
    public int size() {
        return this.elems.length;
    }
}
