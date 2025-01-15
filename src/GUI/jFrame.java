package GUI;

import javax.swing.*;
import java.awt.*;

public class jFrame {
    public static void main (
            String [] args
    ){
        JFrame myFrame= new JFrame();
        myFrame.setSize(480,490); // this is the x,y values
        //myFrame.setResizable();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("Java");
        myFrame.getContentPane().setBackground(new Color(0x123456));
// setting an icon
        ImageIcon icon =new ImageIcon("C:\\Users\\THINKPAD\\Desktop\\the-dark-knight-rises-batman-dark-christian-bale-wallpaper-preview.jpg");
        myFrame.setIconImage(icon.getImage());

        myFrame.setVisible(true);
        // alternatively one can create a class to which the JFrame class is a parent then copy the code above into a constructor and replace the myFrame with this.
        // then create an instance of that class in another class and run

    }
}
