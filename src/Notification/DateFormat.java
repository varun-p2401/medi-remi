package Notification;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DateFormat {
    public void CheckAppointment(final int a,final int b,final int c, final int d, final int e, final int f){ 
        Thread t = new Thread(){
            public void run() {
                int wl=0;
                while (wl==0){
                    Calendar cal = new GregorianCalendar();
                    int hours = cal.get(Calendar.HOUR);
                    int mins = cal.get(Calendar.MINUTE);
                    int am_pm = cal.get(Calendar.AM_PM);
                    int date = cal.get(Calendar.DATE);
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    /*String ampm = "ampm";
                    if (am_pm == 0) {
                        ampm = "AM";
                    } 
                    else {
                        ampm = "PM";
                    }*/
                    if(a==hours && b==mins && c==am_pm && d==date && e==month && f==year){
                        JOptionPane.showMessageDialog(null,"You have doctor appointment now");
                        break;
                    }
                }
            }
        
    };
    t.setPriority(Thread.MIN_PRIORITY);
    t.start();
        
}
    /*public static void main(String[] args){
        DateFormat ac = new DateFormat();
        ac.CheckAppointment(3,47,1,7,5,2021);
    }*/
    
}
