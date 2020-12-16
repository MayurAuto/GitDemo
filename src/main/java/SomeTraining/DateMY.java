package SomeTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMY {
    public static void main(String args[]){
//        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//        System.out.println(sdf.format(d));
//        System.out.println(d.toString());
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.AM_PM));
    }
}
