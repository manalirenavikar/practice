package Day5;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		 Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		 int count=0;
		 
		while(number!=0)
		{
		number=number/10;
		count++;
		}
		 
		 System.out.println("Number of digits "+ count );
		 
	}

}
