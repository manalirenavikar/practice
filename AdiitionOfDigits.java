package Day5;

import java.util.Scanner;

public class AdiitionOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		 Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		
		 int sum;
		 for(sum=0; number!=0; number=number/10)  
		 {  
		 //finds the last digit and add it to the variable sum      
		 sum = sum + number % 10;  
		 }  
		 
		System.out.println("Addition of number is"+ sum);
	}

}
