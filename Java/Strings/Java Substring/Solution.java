import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void range(String S,int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            System.out.print(S.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if(S.length()>=1&&S.length()<=100&&start>=0&&start<end&&end>start)
        {
        range(S,start,end);
        }
    }
}
