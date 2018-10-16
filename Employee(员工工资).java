package java作业;

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
		System.out.print("姓名："+name+" "+/*"工资："+salary+" "+*/"生日："+birthday+" ");
	}
	
	public int println() {
		System.out.print("姓名："+name+" "+"生日："+birthday+" ");
		return 0;
	}
	
	public int intbonus() {
		return 0;
	}
	
	public int intdividend() {
		return 1;
	}
	
}
