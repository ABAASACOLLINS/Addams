package objectOrientedProgramming.interfaces;

public class saving implements transactionClass{
    @Override
    public void loanTransaction() {
        System.out.println("the creditor is the bank");

    }

    @Override
    public void savingsTransaction() {
        System.out.println(" the creditor is the customer");

    }
}
