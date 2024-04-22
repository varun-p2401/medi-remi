package Notification;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Notify {
    public void checkAlarm(final int a,final int b,final int c){ 
        Thread t = new Thread(){
            public void run() {
                int wl=0;
                while (wl==0){
                    Calendar cal = new GregorianCalendar();
                    int hours = cal.get(Calendar.HOUR);
                    int mins = cal.get(Calendar.MINUTE);
                    int am_pm = cal.get(Calendar.AM_PM);
                    /*String ampm = "ampm";
                    if (am_pm == 0) {
                        ampm = "AM";
                    } 
                    else {
                        ampm = "PM";
                    }*/
                    if(a==hours && b==mins && c==am_pm){
                        JOptionPane.showMessageDialog(null,"It's time to take your medicine!");
                        break;
                    }
                }
            }
        
    };
    t.setPriority(Thread.MIN_PRIORITY);
    t.start();
        
}
    /*public static void main(String[] args){
        Notify ac = new Notify();
        ac.checkAlarm(1,7,"PM");
       
    
}*/
}
    