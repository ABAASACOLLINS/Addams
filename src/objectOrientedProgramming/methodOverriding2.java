package objectOrientedProgramming;

import java.util.Random;

public class methodOverriding2 {
    String accountName;
    Random random=new Random();
    int memberId=random.nextInt();
    void details(){
        accountName="redOne";
        System.out.println(memberId+" "+accountName);
    }
}
