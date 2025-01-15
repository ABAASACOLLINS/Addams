package fundamentals;

public class nestedloops {
    public static void main( String[]args){
        int col=5;
        int row=2;
        String sym= "@";
        for (int i = 0; i <= row ; i++) {
            System.out.println();
            for (int z=0; z<=col; z++){
                System.out.print(sym);
            }

        }
 /*nested loops first execute the code inside then they finish it and execute the code outside ie they first finish the code inside then they go outside
till the whole code is executed

  */
    }
}
