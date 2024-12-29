package objectOrientedProgramming;

public class toStringMethod {

        String debitor= "name";
        String creditor ="otherName";
        int amount=700;

    @Override
    public String toString() {
        return
                debitor + '\n' +
                 creditor + '\n' +
                  amount ;
    }
}
