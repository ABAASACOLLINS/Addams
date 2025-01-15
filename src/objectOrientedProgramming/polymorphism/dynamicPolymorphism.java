package objectOrientedProgramming.polymorphism;

import javax.swing.*;
import java.util.Objects;

public class dynamicPolymorphism {// in this case we instantiate the object during runtime and the user inputs what the object is
    public static void main(String[]args){
        members memberType;
        String comsumerType= JOptionPane.showInputDialog(null,"press 1 for normal member and 2 for admin");
        if(Objects.equals(comsumerType, "1")){
            memberType=new normalMember();
            JOptionPane.showMessageDialog(null,"welcome our new member");
        } else if (Objects.equals(comsumerType,"2")) {memberType=new normalMember();
            JOptionPane.showMessageDialog(null,"welcome to admin page");

        }
        else {
            JOptionPane.showMessageDialog(null,"please input correct answer");
        }

    }
}