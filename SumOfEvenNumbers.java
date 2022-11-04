//wap to find out sum of even number from 1 to n
package basicprograms;
import java.util.Scanner;
public class SumOfEvenNumbers {
	public static void main(String[] args)
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		//input from the user
		System.out.println("Enter the Number: ");
		n=sc.nextInt();
		
		//runs for loop till i<=n
		for(i=0;i<=n;i+=2)
		{
			sum=sum+i;
		}
		System.out.println("The sum of even number from 0 to "+n+ " is:"+sum);
	}
}
