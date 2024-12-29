package objectOrientedProgramming;
// objects can be used as arguments provided that they are included in the classes as shown in objectArguments2
public class objectArguments3 {
    public static void main(String[] args) {
        objectArguments store = new objectArguments(200, "asset");
        objectArguments2 retrieve = new objectArguments2();
        System.out.println(retrieve.log(store));
    }
}
