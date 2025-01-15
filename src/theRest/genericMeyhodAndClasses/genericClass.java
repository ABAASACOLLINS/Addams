package theRest.genericMeyhodAndClasses;

public class  genericClass<Generic> {
    Generic y;
    genericClass(Generic y){
        this.y=y;

    }
    public Generic getValue(){
        return y;
        // generic classes can have two parameters by putting in the <> parameters two objects and
        // then the constructor also has two objects
        // for example in hash maps
        // for bounded data types where you have the items in the generic class specified then you can use <generic extends number> to show that it should be a number


    }
}
