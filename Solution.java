import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
   public static void main(String[] args) {
        // Return the minimum number of characters to make the password strong
              int ans =0;
			  Scanner sc=new Scanner(System.in);
               String password=sc.nextLine();
			   int n=password.length();
			  //int count =0;
               boolean small=false,caps=false,numeric=false,special=false;
				   // System.out.println("else");
                 for(int i=0;i<password.length();i++)
                         {
					 
                       if(password.charAt(i)>=48 && password.charAt(i)<=57 )
							 
						        small=true;
						
						if   (password.charAt(i)>=65 && password.charAt(i)<=90 ) 

								 caps=true;
							 

						   if (password.charAt(i)>=97 && password.charAt(i)<=122)
						   		 numeric=true;
						   


						   if(password.charAt(i)=='!' || password.charAt(i)=='@' ||                                                      password.charAt(i)=='#' || password.charAt(i)=='$' ||                                                      password.charAt(i)=='%' || password.charAt(i)=='^' || 
                               password.charAt(i)=='&'  || password.charAt(i)=='*'|| 
                               password.charAt(i)=='(' || password.charAt(i)==')' || 
                               password.charAt(i)=='-' || password.charAt(i)=='+')
						  
							  special=true;
					
					  }
					  if(small==false)
						  ans++;
                      if(caps==false)
						  ans++;
                      if(numeric==false) 
						  ans++;
                      if(special==false) 
						  ans++;
				   
                    ans=Math.max(ans,6-password.length());
                  
                   
                  return ans;
    }

   
}
