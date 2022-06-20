package Day5;

import java.util.Scanner;

public class EvenOddNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		 Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		 int ecount=0;
		 int ocount=0;
		 while(number!=0)
			{
			number=number/10;
			
			if(number%2==0)
			{
			ecount++;
			}
			else
			{
				ocount++;
			}
			
			}
			 
			 System.out.println("Number of even digits:"+ ecount +" Number of odd digits:" +ocount );

	}

}
