/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Amst
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	//int num=s.nextInt();
	int i;
              int number, temp, total = 0;

        for(i=a;i<b;i++)
        {
        	number=i;
        
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
             if(total == number)
            System.out.println(number);
        
        }}
		
	}
}
