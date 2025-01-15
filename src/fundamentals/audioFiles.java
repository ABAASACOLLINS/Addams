package fundamentals;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class audioFiles {public static void main(String[]args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
   File music=new File("C:/Users/THINKPAD/Documents/usr/share/mintty/sounds/percussive-gong.wav");
    AudioInputStream bigfun=AudioSystem.getAudioInputStream(music);
    Clip clip= AudioSystem.getClip();
    clip.open(bigfun);

    // restart
   //stop
 //for reset we input clip.set and put 0 as an argument
 //we have to pause the program by adding a scanner



}
}
