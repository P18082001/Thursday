package oopsconcept;
class Person2 {
	String name ;

}
class empollyee extends Person2{

	double ann_sal,year;
	String n_i_no;
	public double getAnn_sal() {
		return ann_sal;
	}
	public void setAnn_sal(double ann_sal) {
		this.ann_sal = ann_sal;
	}
	
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	
	public String getN_i_no() {
		return n_i_no;
	}
	public void setN_i_no(String n_i_no) {
		this.n_i_no = n_i_no;
	}
	
	public empollyee() {
		super();
		
	}
	
	public empollyee(double ann_sal, double year, String n_i_no) {
		super();
		this.ann_sal = ann_sal;
		this.year = year;
		this.n_i_no = n_i_no;
	}
	
}

public class TLab1 {

	public static void main(String[] args) {
		empollyee e=new empollyee(1000,2022,"100");
		System.out.println("sallary="+e.getAnn_sal());
		System.out.println("year="+e.getYear());
		System.out.println("nin="+e.getN_i_no());
	
	}

}