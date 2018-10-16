package java作业;

//import java.util.Scanner;

public class Manager extends Employee {
	String bonus;
	public Manager() {//无参构造函数
		
	}
	public Manager(String name,String salary,String birthday,String bonus) {//有参构造函数
		super();
		this.bonus=bonus;
	}
	public void setbonus(String bonus) {//设置奖金
		this.bonus=bonus;
	}
	public String getbonus() {//获取奖金
		return bonus;
	}
	public String PaySalary() {
		return getsalary()+bonus;
	}
	public void print() {//输出成员的值
		super.print();
		if(bonus!=null) {
		System.out.print("奖金："+bonus);}
	}
	public int println() {
		super.println();
		if(bonus!=null) {
			System.out.print("奖金："+bonus);
			int abonus=Integer.parseInt(bonus);
			return abonus; 
			}
		else return 0;
	}   
	public int intbonus() {
		super.intbonus();
		if(bonus!=null) {
//			int abonus=Integer.parseInt(bonus);
			return 1; 
		}
		return 0;
	}
//	public int[] StringSplit(String str) {//将工资分片提取字符串数组，再将字符串数组转换为整型数组
//
//        String[] names = str.split(" ");
//        int[] num=new int[str.length()];
//        for(int i=0;i</*num.length*/12;i++){
//            num[i]=Integer.parseInt(names[i]);
//        }
//        return num;
//	}
}
