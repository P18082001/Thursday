//WAP to print multiplication table
package basicprograms;
import java.util.Scanner; 

public class MultiplicationTable {
	public static void main(String[] args)
	{
		int n,T,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		while(i<=10)
		{
			T=n*i;
			System.out.println(T);
			i++;
		}
	}
}
