package theRest.genericMeyhodAndClasses;
import java.math.*;
import java.util.Timer;
import java.util.TimerTask;

public class repeatingTasks {public static void main(String[]args){

    Timer timer=new Timer();

    TimerTask task=new TimerTask() {
        int counter=10;
        @Override
        public void run() {

            if (counter>0){

                System.out.println(counter+"seconds");
                counter--;

            }
            else {
                System.out.println("your done");
            }
        }
    };
    timer.scheduleAtFixedRate(task,3000,1000);
}
}
