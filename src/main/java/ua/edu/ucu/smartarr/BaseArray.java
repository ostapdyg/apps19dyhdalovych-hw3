package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] elems;
    private String operation;

    public BaseArray(Object[] elems) {
        this.elems = elems;
        this.operation = "";
    }

    public Object[] toArray() {
        return this.elems;
    }

    public String operationDescription() {
        return this.operation;
    }

    public int size() {
        return this.elems.length;
    }
}
