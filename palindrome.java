package Day5;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		 Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		 int no=number;
		 int reversed=0;
		 while(number!=0)
		 {
			 int digit = number % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      number /= 10;
		 }
		 
		 if(no==reversed)
		 {
			 System.out.println("Palindrome");
		 }
		 else
		 {
			 System.out.println("Reverse no is" +reversed);
		 }
		 
	  

}

}