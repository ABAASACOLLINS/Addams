package objectOrientedProgramming.interfaces;

public class loan implements transactionClass,accountTypes{
    @Override
    public void loanTransaction() {
        System.out.println("the creditor is the bank");

    }

    @Override
    public void savingsTransaction() {
        System.out.println(" the creditor is the customer");

    }

    @Override
    public void loanAccount() {

    }

    @Override
    public void savingAccount() {

    }
}
// this shows the loan class implementing two interfaces