package oopsconcept;

public class PerfectNumber1 {
	public static void main(String args[])
	{
		int i,j,n,sum=0;
		System.out.println("The Perfect number between 1 to 50 is:");
		for(i=1;i<=50;i++)
		{
		    for(j=1;j<i;j++)
		    {
		    	if(i%j==0)
		    	{
		    		sum=sum+j;
		    	}
		    }
		    if(i==sum)
		    {
		    	System.out.println(i);
		    }
		    sum=0;
		}
	}
}
    
		 

		       