package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] elems;
    private String operation;

    public BaseArray(Object[] elems) {
        this.elems = elems;
        this.operation = "Base Array";
    }

    @Override
    public Object[] toArray() {
        return this.elems;
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
