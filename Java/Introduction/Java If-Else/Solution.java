/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Wikipedia if-else flow chart

Source: Wikipedia

Task
Given an integer, , perform the following conditional actions:

    If is odd, print Weird
    If is even and in the inclusive range of to , print Not Weird
    If is even and in the inclusive range of to , print Weird
    If is even and greater than , print Not Weird

Complete the stub code provided in your editor to print whether or not is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3

Sample Output 0

Weird

Sample Input 1

24

Sample Output 1

Not Weird

Explanation

Sample Case 0:
is odd and odd numbers are weird, so we print Weird.

Sample Case 1:
and is even, so it isn't weird. Thus, we print Not Weird.
*/
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n>=1 && n<=100)
            {
            if(n%2==1){
              ans = "Weird";
            }
            else
            {
             if(n%2==0)
             {
                ans = "Not Weird"; 
                if(n>=2 && n<=5)
                {
                    ans = "Not Weird"; 
                }
                if(n>=6 && n<=20)
                {
                    ans = "Weird"; 
                }
                if(n>20)
                {
                    ans = "Not Weird"; 
                } 
                 
             }
                
            }
                
            }
            else
            {
                ans="n is not in constraints";
            }
            System.out.println(ans);
            
        }
    }


