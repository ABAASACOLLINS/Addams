package objectOrientedProgramming;

import javax.swing.*;

public class oop {// an object is a bundle of defining attributes and methods
 // we create a class either outside the main class or in another java class fil
public static void main(String[]args){
    students school =new students();
    System.out.println(school.fees);
    school.notPay();
// how to use constructors-methods that  create  different  object
    String Name=JOptionPane.showInputDialog(
            "input name"
    );
    int Age= Integer.parseInt(JOptionPane.showInputDialog("input student age"));
   double fees= Double.parseDouble(JOptionPane.showInputDialog("Input student fees"));
        pupil Agaba= new pupil(Name,Age,fees);
    System.out.println(Agaba.name);
    String thisname=JOptionPane.showInputDialog(
            "input name"
    );
    int thisAge= Integer.parseInt(JOptionPane.showInputDialog("input student age"));
    double thisfees= Double.parseDouble(JOptionPane.showInputDialog("Input student fees"));
    pupil Abaasa= new pupil(thisname,thisAge,thisfees);
    System.out.println(Abaasa.name);
    System.out.println(Abaasa.fees);
    if (Abaasa.fees>=700){
        JOptionPane.showMessageDialog(null,"fees payment is complete");
    } else if (Abaasa.fees<700) {JOptionPane.showMessageDialog(null,"fees defaulter");

    }
}
}
