package ua.edu.ucu.smartarr;

import java.util.Arrays;

import ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    private MyPredicate predicate;


    public FilterDecorator(SmartArray arr, MyPredicate pr) {
        super(arr);
        this.predicate = pr;
        this.operation = "Filter " + this.operation;

    }
    @Override
    public Object[] toArray() {
        return Arrays.stream(this.smartArray.toArray()).
                      filter(o->this.predicate.test(o)).toArray();
    }
}
