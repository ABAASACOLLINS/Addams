package objectOrientedProgramming.interfaces;

public class transaction {
    // interfaces are like paren classes only that other classes can inherit many other interfaces consider them being interfaces
    // in interfaces methods of the interfaces are not implemented and have to be overridden by the classes

    public static void main(String[]args){
    loan Loan =new loan();
    Loan.loanTransaction();
    saving Saving =new saving();
    Saving.savingsTransaction();
    }
}
