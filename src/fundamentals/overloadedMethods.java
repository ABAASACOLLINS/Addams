package fundamentals;

public class overloadedMethods {public static void main(String[]args){
    //methods ave parameters which are data types and the number of variables
    //the parameters must correspond with the arguments when the string is invoked
// for overloaded methods the methods have the same name but different parameters as the both great methods have different number of variables required

    int f=great(8,5);
    System.out.println(f);
    int c=great(6,7);
    System.out.println(c);
    System.out.println(great(4,6,7));
}
static int great(int f,int g){return f+g;}
    static int great (int h, int j,int t){return h*j-t;}
}
