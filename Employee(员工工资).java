package java��ҵ;

import java.util.Scanner;

public class Employee {
	private String name;
	private String salary;
	private String birthday;
	
	public Employee() {
		
	}
	public Employee(String name,String salary,String birthday) {
		this.name=name;
		this.salary=salary;
		this.birthday=birthday;
	}
	public String PaySalary() {
		return salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public String getsalary() {
		return salary;
	}
	public void setsalary(String salary) {
		this.salary=salary;
	}
	
	public String getbirthday() {
		return birthday;
	}
	public void setbirthday(String birthday) {
		this.birthday=birthday;
	}
	
	public void print() {
		System.out.print("������"+name+" "+/*"���ʣ�"+salary+" "+*/"���գ�"+birthday+" ");
	}
	
	public int println() {
		System.out.print("������"+name+" "+"���գ�"+birthday+" ");
		return 0;
	}
	
	public int intbonus() {
		return 0;
	}
	
	public int intdividend() {
		return 1;
	}
	
}
