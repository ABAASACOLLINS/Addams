package objectOrientedProgramming;

public class pupil {
    String name;
    int age;
    double fees;
    pupil(String name, int age, double fees){
        this.name=name;
        this.age=age;
        this.fees=fees;
        pay(900);
        // the this keyword would differentiate the different objects when instantiated
    };
    void pay(int standardFees){if (this.fees<standardFees){
        System.out.println("fees defaulter");    }
        else {
        System.out.println("non fees defaulter");
    }
    }
}
