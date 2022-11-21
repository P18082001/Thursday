package oopsconcept;

class Person3 
{
	String bdate;
}

class Teachar extends Person3
{
	double salary=10000;
	String subject="english";
}
	
class Student1 extends Person3
{
	int stud_id=1;
}

class colleage extends Student1
{
	String clg_name="acharay ",year="2000";
}

public class ThusLab3 {
	public static void main(String[] args) {
		Teachar t=new Teachar();
		Student1 s=new Student1();
		colleage c=new colleage();
		System.out.println("sallry "+t.salary+ "  "+"subject  "+t.subject);
		System.out.println("stud id "+s.stud_id);
		System.out.println("collage "+c.clg_name+" "+"year"+c.year);
	}

}
