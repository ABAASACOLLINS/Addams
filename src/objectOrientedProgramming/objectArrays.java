package objectOrientedProgramming;


import javax.management.monitor.StringMonitor;

public class objectArrays {
    String name;
    int amount;
    int accountNumber;
    objectArrays(String name, int amount , int accountNumber){
        this.name=name;
        this.amount =amount;
        this.accountNumber=accountNumber;

    }

    @Override
    public String toString() {
        return  name + '\n' +
                 amount +"\n"+
                 accountNumber ;
    }
}

