package objectOrientedProgramming;

public class staticKeyword {
    int transaction;
     static int transactionId=100;
    staticKeyword(int transaction){
        this.transaction=transaction;
        transactionId++;
    }
    static void transactionlogs(){
        System.out.println("Transaction log: "+transactionId);
    }
}
