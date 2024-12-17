package objectOrientedProgramming;

public class overloadedConstructors2 { public static void main(String[]args){
    overloadedConstructors pupil= new overloadedConstructors(78,"seven","abaasa");
    System.out.println(pupil.age);
    System.out.println(pupil.primary);
    System.out.println(pupil.name
    );
    if (pupil.age>12){
        System.out.println(" the child is too old for primary seven");
    }
}
}
