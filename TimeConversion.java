import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example
s= 12:00:00PM
Return '12:01:00'.

s= 12:00:00AM
Return '00:01:00'.
 */
public class TimeConversion {

    public static String timeConversion(String s) throws ParseException {
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");//hh- 12 hour format
        DateFormat sf = new SimpleDateFormat("HH:mm:ss"); //HH- 24 hour format
        Date date = df.parse(s);
        return sf.format(date);
    }
    public static void main(String[] args) throws ParseException {
        String s = "08:40:00PM";
        String st = timeConversion(s);
        System.out.println(st);
    }
}
