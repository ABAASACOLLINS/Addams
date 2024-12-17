import java.util.ArrayList;

public class arrayLists {
    public static void main(String[]args){
//ArrayLsts are resizable arrays ie elements can be added or removed
//only store referenced data types
        ArrayList<Integer> age =new ArrayList<Integer>();
        age.add(1);
        age.add(2);
        age.add(3);
        //add method just adds the elemnt to the next index
        for (int i = 0; i <age.size() ; i++) {
            System.out.println(age.get(i));
// for ArrayLists we use size not length
            //and we use get not index


        }
        age.set(2,5);
        for (int z = 0; z <age.size() ; z++) {
            System.out.println(age.get(z));}
        age.remove(0);
            for (int y = 0; y <age.size() ; y++) {
                System.out.println(age.get(y));}
        age.clear();
                for (int j = 0; j <age.size() ; j++) {
                    System.out.println(age.get(j));}
                //2D ARRAY LIST
        ArrayList<ArrayList<String>> tribes= new ArrayList();
          ArrayList<String> Uganda= new ArrayList();
          Uganda.add("baganda");
          Uganda.add("banayankole");
        ArrayList<String> Kenya= new ArrayList();
        Kenya.add("Kikuyu" +
                "Madi");
        ArrayList<String> Rwanda= new ArrayList();
        Rwanda.add("Hutu" +
                "Tutsi");
        tribes.add(Uganda);
        tribes.add(Kenya);
        tribes.add(Rwanda);
        System.out.println(tribes
        );



    }
}
