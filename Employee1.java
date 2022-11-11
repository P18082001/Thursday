package oopsconcept;
import java.util.Scanner;

class EmployeeA{
		int id;
		String name,designation;
		float basicsalary;
		

	public void add(int id,String name,String designation,float basicsalary)
	{	
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicsalary=basicsalary;
	}

	public void display()
	{
		 System.out.println("ID="+id);
		 System.out.println("Name="+name);
		 System.out.println("designation="+designation);
		 System.out.println("basicsalary="+basicsalary);
	}
	
}
public class Employee1 {
	public static void main(String[] args) {
		int id;
		String name,designation;
		float basicsalary;
		float ai;
		
		
	Scanner sc=new Scanner(System.in);
		EmployeeA emp1=new EmployeeA();
		System.out.println("Enter employee id: ");
		id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter employee name: ");
		name=sc.nextLine();
		System.out.println("Enter employee designation: ");
		designation=sc.nextLine();
		System.out.println("Enter employee basicsalary: ");
		basicsalary=sc.nextFloat();
		System.out.println("=================================");
		
		
	//	Employee emp2=new Employee();
		emp1.add(id, name, designation, basicsalary);
		emp1.display();
	
		
		ai=basicsalary*12;
		System.out.println("Annual income is:"+ai);
		
		if(designation=="manager")
			System.out.println("Traval allowanse is:2000 ");
		else
			System.out.println("Traval allowanse is:1500 ");
		
	}

}
