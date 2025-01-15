package objectOrientedProgramming;

public class copyingObjects2 {// in this method we will use encapsulation because it is a good practise and we will use set and get methods to retrieve the private attributes
    private String accName;
    private int accNumber;
    copyingObjects2(String accName,int accNumber){
        this.setAccName(accName);
        this.setAccNumber(accNumber);
    }
    // you can also use a constructor to copy

    copyingObjects2(copyingObjects2 y){this.copy(y);}
    public String getaccName(){
        return accName;
    }
    public int getaccNumber(){
        return accNumber;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public void copy(copyingObjects2 X){
        this.setAccName(X.getaccName());
        this.setAccNumber(X.getaccNumber());
    }
}
