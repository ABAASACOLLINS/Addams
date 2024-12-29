package objectOrientedProgramming;

public class objectArrays2 {
    public static void main(String[]args
    ){
        objectArrays Transactions1= new objectArrays("boy",76,001);
        objectArrays Transactions2= new objectArrays("bro",80,002);
        objectArrays Transactions3= new objectArrays("girl",100,003);
        objectArrays[] Transactions={Transactions1,Transactions2,Transactions3};
        System.out.println(Transactions[1].amount );
    }
}
