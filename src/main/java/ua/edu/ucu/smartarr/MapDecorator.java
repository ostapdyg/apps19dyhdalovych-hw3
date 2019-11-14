package ua.edu.ucu.smartarr;
import ua.edu.ucu.functions.MyFunction;


// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    public MapDecorator(SmartArray arr, MyFunction fn){
        super(arr);
    }
}
