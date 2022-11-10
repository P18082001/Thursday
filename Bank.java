package oopsconcept;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int amount,wd,d;
		Scanner cs=new Scanner(System.in);
	System.out.println("Enter balance in your account");
	amount=cs.nextInt();
		System.out.println("Enter ammount want you widraw");
		wd=cs.nextInt();
		if (wd<=amount) {
			System.out.println("succsefully widrawal");
		}
		else {
			System.out.println("Enter lessor number ");
		}
		int av=amount-wd;
		System.out.println("current bal "+av);
		System.out.println("Enter the deposite number ");
		d=cs.nextInt();
		System.out.println("deposite succsesfully ");
		System.out.println("Now avalable balance is "+(av+d));
	}
}