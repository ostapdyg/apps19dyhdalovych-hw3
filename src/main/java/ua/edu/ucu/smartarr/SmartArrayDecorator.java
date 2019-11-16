package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;
    protected String operation = "decorator";

    SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return this.smartArray.operationDescription() + ", " + this.operation;
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }

}
