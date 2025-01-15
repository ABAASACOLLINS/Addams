package fundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String []args) throws IOException {
        FileReader book=new FileReader("C:/Users/THINKPAD/Desktop/ganong.txt");
        int bookdata= book.read();
        while (bookdata!=-1){
            System.out.print((char) bookdata);
        bookdata=book.read();
        }
        book.close();
    }
}
