//write a program to  to calculate factorial number:
//Input=5
//5*4*3*2*1=120
package basicprograms;
import java.util.Scanner;
public class FactorialNumber {
	public static void main(String[] args)
	{
		int n,i,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number which you want: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println("Factorial number of "+n+" is: "+f);
	}

}
