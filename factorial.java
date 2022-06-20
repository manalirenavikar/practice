package Day5;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		 Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		 int fact=1;
		 while(number!=0)
		 {
			  fact=fact*number;
			  number--;
		 }
		 System.out.println("Factorial is" +fact);
	}

}
