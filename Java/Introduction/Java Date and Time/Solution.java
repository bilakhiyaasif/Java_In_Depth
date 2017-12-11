import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static String getDay(String day, String month, String year){
        Scanner sc=new Scanner(System.in);        
        Calendar c=Calendar.getInstance();
        String r="";
        try
        {
        String inputdate=String.format("%s/%s/%s",day,month,year);
        Date date=new SimpleDateFormat("dd/MM/yyyy").parse(inputdate);
        c.setTime(date);
        
        String day1="";
        
        if(Integer.parseInt(year)>2000&&Integer.parseInt(year)<3000)
        {
           //System.out.println(c.get(Calendar.DAY_OF_WEEK));
            day1 = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,Locale.ENGLISH).toUpperCase();
            
             //System.out.println(dayOfWeek);
           r=day1;
        }
            
        }
        catch(NumberFormatException | ParseException e)
        {
            
        }
        return r;
       
    }
