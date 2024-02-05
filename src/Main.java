import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main  {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date.toLocaleString());
        long time = date.getTime();
        time = time + 600000;
        date.setTime(time);
        System.out.println(date.toLocaleString());


        //yyyy:MM:dd   hh:mm:ss

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

        Date parse = sdf.parse("2023/10/04 00:34:34");
        System.out.println(parse.toLocaleString());


    }

}