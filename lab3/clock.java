

package lab3;

import java.util.Calendar;

public class clock {
    public static void main(String[] args) throws InterruptedException {
        
        Calendar cal = Calendar.getInstance();
        Time currentTime = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        while (currentTime.getSecond() < 59) {
            System.out.println(currentTime.toString());
            Thread.sleep(1000);
            currentTime.tick();
        }
    }
}