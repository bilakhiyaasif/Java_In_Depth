import java.util.*;
import java.text.*;

public class Solution {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        if(payment>=0&&payment<=Math.pow(10.0, 9.0)){
        Locale l;
        Currency c;
        NumberFormat nf;
        

        l=new Locale("en","US");
        nf=NumberFormat.getCurrencyInstance(l);
        //System.out.println("US: " + nf.format(payment));
        String us=nf.format(payment);
        
        l=new Locale("en","IN");
        nf=NumberFormat.getCurrencyInstance(l);
        //System.out.println("India: " + nf.format(payment));
        String india=nf.format(payment);
        
        l=Locale.CHINA;
        nf=NumberFormat.getCurrencyInstance(l);
        //System.out.println("China: " + nf.format(payment));
        String china=nf.format(payment);
        
        l=Locale.FRANCE;
        nf=NumberFormat.getCurrencyInstance(l);
        //System.out.println("France: " + nf.format(payment));
        String france=nf.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        }
        else
        {
            
        }
    }
}
