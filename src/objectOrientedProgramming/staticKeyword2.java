package objectOrientedProgramming;

public class staticKeyword2 {
    // the static keyword is used to variables and methods
    // if it is used the class owns the static member(variable or method onto which static has been used )
    // in that case the static member can be referred to using the class name or the object name(instance name) but preferably the class name
        public static void main(String[]args){
            staticKeyword transa =new staticKeyword(60);
            staticKeyword transactionLog= new staticKeyword(4001);
            System.out.println(staticKeyword.transactionId);
            staticKeyword.transactionlogs();
            // in this case we can see that since there are two instances our transaction id integer variable has added 1 twice
            // this is because the class owns the variable and it adds itself according to the objects
            
        }
    }
