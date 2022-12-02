package arrayexample;

import java.util.Scanner;

public class NegativeNumberInArray {
	public static void main(String[] args) {
		int arr[],i,size;
		Scanner sc=new Scanner(System.in);
		
		//take array length from user
		System.out.println("Enter size of Array:");
		size=sc.nextInt();
		arr=new int[size];
		
		//input from user
		System.out.println("enter elements in array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Negative number in array");
		for(i=0;i<size;i++)
		{
			if(arr[i]<0)
				System.out.println(arr[i]);
		}
	}

}
