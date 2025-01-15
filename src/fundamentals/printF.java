package fundamentals;

public class printF {public static void main(
        String[]args
){// this is for manipulating texts

    System.out.printf("this is a format string %b",false);
    // use a comma and a conversion character which is a percentage sign in the quotes as shown above
    // % then the first letter of the variable
    /*
    boolean %b
    String  %s
    float and double %f
    d for integers

    they have characteristics ie -width(minimum number of chracters to display at the % sign
   )
    -precision number of decimal points after a float or a double
can be + for positive sign before the number and can be, for a thousand separator

     */
    System.out.printf("this is a format string %b",false);
    System.out.println();
    System.out.printf("the boy is %10f",5.5);


    }
}
