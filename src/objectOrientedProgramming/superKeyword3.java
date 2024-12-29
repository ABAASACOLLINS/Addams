package objectOrientedProgramming;

import java.lang.reflect.AccessFlag;

public class superKeyword3 extends superKeyword2{
    int myAccountBal;
    superKeyword3(String name,int bal,int mybal){
        super(name,bal);
        this.myAccountBal=mybal;
    }
}
