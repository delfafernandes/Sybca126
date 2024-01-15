package hell;

import java.util.Scanner;
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		
		int num1,num2, add, sub;
		System.out.println("Enter the num 1 :");
		num1=scan.nextInt();
		System.out.println("Enter the num 2 :");
		num2=scan.nextInt();
		add= num1+num2;
		System.out.println("Sum is"+ add);
		
	}

}
