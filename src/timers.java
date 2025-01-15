import java.sql.Struct;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class timers {
    public static void main(String[]args){
        // timer is an option that allows t schedule tasks in a backgroumd thread
        //TimerTask the task scheduled

        Timer time=new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                System.out.println("the boy is running");
            }
        };
        time.schedule(task,3780);
        Calendar calendar= Calendar.getInstance();
        calendar.set(Calendar.YEAR,2025);
        calendar.set(Calendar.MONTH,Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH,5);
        calendar.set(Calendar.HOUR_OF_DAY,16);
        time.schedule(task,calendar.getTime());


    }
}
