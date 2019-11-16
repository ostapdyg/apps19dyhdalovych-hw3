package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    private SmartArray smartArray;

    SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    public String operationDescription() {
        return this.smartArray.operationDescription();
    }

    public int size() {
        return this.smartArray.size();
    }

}
