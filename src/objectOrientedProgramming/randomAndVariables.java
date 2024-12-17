package objectOrientedProgramming;

import java.util.Random;

public class randomAndVariables {
    //Global variables-  these are variables declared outside of any method but inside a class
    // global is better
    // Local variales are variables declared inside a method and are only available to that method

      randomAndVariables() {
        Random random = new Random();
        int studentNumber = 0;
        call(studentNumber, random);

    }

     void call(int studentNumber, Random random) {
        studentNumber = random.nextInt(6) + 1;
        System.out.println(studentNumber);
    }


    void call(int studentNumber, int i) {
    }
}
