package objectOrientedProgramming;

import java.util.Random;

public class globalVariables {
    Random red =new Random();
    int number;
    int total=600;
    globalVariables(){
        number=0;


    }
    void rollCall(){
        number=red.nextInt(600);
        System.out.println(number);
    }
}
