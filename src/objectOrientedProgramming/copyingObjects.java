package objectOrientedProgramming;

import java.security.spec.RSAOtherPrimeInfo;

public class copyingObjects {// when copying two objects made from a constructor we make sure we dont use this"fe3=fe1" as both fe3 and fe1 will have the same address so we make a copy method in the class from which the objects are derived
    public static void main(String []args){
        copyingObjects2 Transactionprofile=new copyingObjects2("abbsa",79896);
        copyingObjects2 Transactionprofile2=new copyingObjects2("absa",79897);
        System.out.println(Transactionprofile2);
        System.out.println(Transactionprofile);
        System.out.println(Transactionprofile.getaccName());
        System.out.println(Transactionprofile2.getaccName());
        Transactionprofile2.copy(Transactionprofile);
        System.out.println(Transactionprofile2.getaccName());
        System.out.println(Transactionprofile.getaccName());
    }
}
