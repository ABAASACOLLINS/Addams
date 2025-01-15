package fundamentals;

import java.io.FileWriter;
import java.io.IOException;


public class fileWriters {public static void main(String[]args) throws IOException {
    try {
        FileWriter pen=new FileWriter("C:/Users/THINKPAD/Desktop/ganong.txt");
        pen.write("Ganong is a really good physiology textbook");
        pen.append("isnt it");
        pen.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}
}
