package objectOrientedProgramming;

public class inheritance {
    // for inheritance there is a paren class and there is a child class(the one that extends)
    String[] Transactionclasses= {"over","mid","under"};
    int[] amount={100000,30000,10000};
    void TransactionClass(int transferamt){
        if (transferamt>amount[0]){
            System.out.println(Transactionclasses[0]);
        }
    }
}
