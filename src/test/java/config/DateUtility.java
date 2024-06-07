package config;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class DateUtility {
	
    public static String getFutureDate() throws Exception {
        String dateString = "2024-06-05"; // Your date in yyyy-MM-dd format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = sdf.parse(dateString);
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 5); // Add 1 day
        dt = c.getTime();
        String futureDate = sdf.format(dt);
        String date[] = futureDate.split("-");
        String formattedDate=date[2]+"/"+date[1]+"/"+date[0]+" 12:00 AM";
        return formattedDate;
    }
  
}
