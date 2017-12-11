import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution { 
 public static boolean flag=false;
  static int B;
  static int H;
  static
  {
       Scanner sc=new Scanner(System.in);
       B=sc.nextInt();
       H=sc.nextInt();
       if(B>=-100&&B<=100&&H>=-100&&H<=100)
       {
       if(B>0&&H>0)
       {
           flag=true;   
       }
       else
       {
           flag=false;
       }
       }
       else
       {
           
       }
      if(!(flag))
                {
                  System.out.println("java.lang.Exception: Breadth and height must be positive");  
                }
  }
  
  
  public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

