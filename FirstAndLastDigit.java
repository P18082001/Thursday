//3.write a program to find out first and last digit from a number.
//Input: 3456        first digit: 3    last digit: 6
package basicprograms;
import java.util.Scanner;

public class FirstAndLastDigit {
	public static void main(String[] args) {
		int n,i,temp,first_digit=0,last_digit;
		Scanner sc=new Scanner(System.in);
		//input from user
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		
		//assigne value of n to temp
		temp=n;
		//run loop till n>10
		while(n>10) 
		{
			//first_digit=n;
			n=n/10;
			first_digit=n;
		}
		last_digit=temp%10;
		System.out.println("first digitb of "+temp+" is: "+first_digit);
		System.out.println("last digitb of "+temp+" is: "+last_digit);
	}

}
