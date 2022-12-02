package arrayexample;
import java.util.Scanner;
public class ReverseArray {
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
	
	//print reverse array
	System.out.println("elements in array:");
	for(i=size-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
}
