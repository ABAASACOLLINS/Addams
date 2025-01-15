package fundamentals;

import java.util.ArrayList;

public class forEach { public static void main (
        String[]args
){
    // for each loops are used to iterate arrays and collections like arraylist
    //they are more readable but less flexible
    String[] feathers={"quills","down"};
    for (String i: feathers){
        System.out.println(i);
        // for these loops we use (i) not indexin ot normal indexing

    }
    ArrayList<Integer> board=new ArrayList();
    board.add(1);
    board.add(2);
    for(Integer i:board ){
        System.out.println(i);
    }
}
}
