package java��ҵ;

//import java.util.Scanner;

public class Manager extends Employee {
	String bonus;
	public Manager() {//�޲ι��캯��
		
	}
	public Manager(String name,String salary,String birthday,String bonus) {//�вι��캯��
		super();
		this.bonus=bonus;
	}
	public void setbonus(String bonus) {//���ý���
		this.bonus=bonus;
	}
	public String getbonus() {//��ȡ����
		return bonus;
	}
	public String PaySalary() {
		return getsalary()+bonus;
	}
	public void print() {//�����Ա��ֵ
		super.print();
		if(bonus!=null) {
		System.out.print("����"+bonus);}
	}
	public int println() {
		super.println();
		if(bonus!=null) {
			System.out.print("����"+bonus);
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
//	public int[] StringSplit(String str) {//�����ʷ�Ƭ��ȡ�ַ������飬�ٽ��ַ�������ת��Ϊ��������
//
//        String[] names = str.split(" ");
//        int[] num=new int[str.length()];
//        for(int i=0;i</*num.length*/12;i++){
//            num[i]=Integer.parseInt(names[i]);
//        }
//        return num;
//	}
}
