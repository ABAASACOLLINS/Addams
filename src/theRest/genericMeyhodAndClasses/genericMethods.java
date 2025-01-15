package theRest.genericMeyhodAndClasses;

public class genericMethods {
public static void main(String []args){
    Integer age=23;
    String name="abaasa";
    Double height=6.4;
    info(name+age+height);
System.out.println(tip(name));

genericClass Name=new genericClass<>("Abaasa");
genericClass number=new genericClass(07000);
    System.out.println(Name.getValue());
    System.out.println(number.getValue());

}public  static <generic> void info(generic f){
        System.out.println("\n"+f+"\n");

    }
    public  static <generic> generic tip(generic g){
    return g;
    }

}



