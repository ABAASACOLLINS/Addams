package fundamentals;

import java.io.File;
// the file class s used to manipulate files it starts checking from the package outwards

public class fileClass {public static void main(String[]args){
    File file=new File("array.java");
    System.out.println(file.isFile()); //checks if file exists or not returns boolean value
    System.out.println(file.getAbsolutePath()); // gets file path
    file.getPath();
    //file.delete for deleting the file

}
}
