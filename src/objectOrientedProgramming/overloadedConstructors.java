package objectOrientedProgramming;

public class overloadedConstructors {// these re constructors with more than one parameter but one name
   int age;
   String primary;
   String name;
    overloadedConstructors(int age,  String primary,String name){
        this.age = age;
        this.name= name;
        this.primary= primary;

    }
    overloadedConstructors(int age, String primary){
        this.age= age;
        this.primary=primary;

    };

}
