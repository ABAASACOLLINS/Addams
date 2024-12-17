public class methods {public static void main(String[]args){
//methods are a block of code that are exucted when invoked (called upon)
String name="Abaasa";
int age=18;
hello(name,age);
int y=56;
int s=4;
    System.out.println(grade(y,s));

}
static void hello(String hello, int k){
    System.out.println("hello, "+hello+" are you below "+k);
}
//return methods dont use void

    static int grade(int g,int r){
    return g*r;
    }

}
