package objectOrientedProgramming;

public class encapsulation   { // this is the process of making class attributes private and the only way to get them is by using the get function
    // the only way to modify them is y using the set function
    public static  void  main(String []args){
        encapsulation2 TransactionName=new encapsulation2();
        System.out.println(TransactionName.getName());
TransactionName.setName("collins");
        System.out.println(TransactionName.getName());
        // set methods and get methods can be used for constructors too

    }
}
