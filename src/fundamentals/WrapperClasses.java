public class WrapperClasses {public static void main(
        String[]args
){
    // Wrapperclass these convert primitive data to reference data(strings) ie access all the reference data types
    /*
    the wrapper class act as both reference data types and primitive data types
    boolean  Boolean
    int  Integer
    char  Character
    double Double
    float Float

     */
    Double a =3.7;
    if (a==3.8){
        System.out.println("enough");
    }
else {
        System.out.println("not enough");

    }
    System.out.println(a.toString());

}
}
