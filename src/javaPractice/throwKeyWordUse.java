package javaPractice;

public class throwKeyWordUse {
	int eid;
	String name;
	double sal;
	public throwKeyWordUse() {}
	public throwKeyWordUse(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		if (sal>0) {
			this.sal = sal;	
		}else {
			throw new SalaryException();
		}
		
	}
	void display()
	{
		System.out.println("Employ Details");
		System.out.println("Emp Id: "+ eid);
		System.out.println("Emp Name: "+ name);
		System.out.println("Emp Salary: "+sal);
	}
	
	
}
