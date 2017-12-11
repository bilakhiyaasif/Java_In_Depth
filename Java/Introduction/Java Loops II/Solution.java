import java.util.*;
import java.io.*;
import java.util.Scanner;


class Solution{
    public static void main(String []argh){
       	Scanner sc =new Scanner(System.in);
		int q=0;
		int a=0,b=0,n=0;
		
		
		q=sc.nextInt();
		if(q>=0&&q<=500)
		{

		String s="";
		for(int f=0;f<q;f++)
		{
		a=sc.nextInt();
		b=sc.nextInt();
		n=sc.nextInt();
	   
	   if(a>=0&&a<=50&&b>=0&&b<=50&&n>=1&&n<=15){
 		int twores=0;
		int x=1;
	
		int r=(a+b);
		if(s.equals(""))
		{
			s=s+r+" ";
		}
		else
		{
			s=s+"\n";
			s=s+r+" ";
		}

		for(int i=1;i<n;i++)
		{
			
			x=(pow1(2,i)*b);
			r=r+x;
		    s=s+r+" ";
			
			
			
			
			
		}
	   }
	   else
	   {
		  
	   }
		
		
	}
	System.out.println(s);
		}
		else
		{
			
		}
    }
    public static int pow1(int a,int res)
	{
	//int a=2;
	//int res=15;
	int ans=1;
	for(int i=0;i<=res;i++)
	{
		if(i==0)
		{
			ans=ans*1;
			//System.out.println(ans);
		}
		else
		{
		ans=ans*a;
		//System.out.println(ans);
		}
	}
	return ans;
	}
}
