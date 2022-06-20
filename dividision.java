package Day5;

import java.util.Scanner;

public class dividision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		 Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		
		 int sum;
		 for(sum=0; number!=0; number=number/10)
		 {
			 System.out.println(number);
		 }
		 
	}

}
