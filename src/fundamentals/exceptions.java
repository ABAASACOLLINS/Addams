package fundamentals;

public class exceptions {public static void main(String[]args) {
    // exeptions are errors that disrupt running of code
    //if any piec of code is risky we can use the try method and the catch method
    try {
        System.out.println(5 / 0);
    } catch (ArithmeticException e) {
        System.out.println("you cant divide by zero");
    }
    // we use the finally method to see if the code was run an it runs whether there's an exception or not


    finally {
        System.out.println("have a nice day");
    }
}
}
