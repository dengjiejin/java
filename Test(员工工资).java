package java��ҵ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
	static double turnover=Math.random()*1000000000;
	static Set<Employee>treeset;
	static HashMap<Employee,int[]> map1=new HashMap<Employee,int[]>();
	//******************************
	public void getfile(File file) {
		BufferedReader reader=null;
		String temp=null;
		try{
				reader=new BufferedReader(new FileReader(file));
				while((temp=reader.readLine())!=null){
					
					if(temp.equals("Ա����")) {
						Employee employee1=new Employee();
						temp=reader.readLine();
						employee1.setname(temp);
						temp=reader.readLine();
						employee1.setsalary(temp);
						temp=reader.readLine();
						employee1.setbirthday(temp);
						treeset.add(employee1);
					}
					
					if(temp.equals("����")) {
						Manager manager1=new Manager();
						temp=reader.readLine();
						manager1.setname(temp);
						temp=reader.readLine();
						manager1.setsalary(temp);
						temp=reader.readLine();
						manager1.setbirthday(temp);
						temp=reader.readLine();
						manager1.setbonus(temp);
						int[] num=StringSplit(manager1.getbonus());//������ÿ���µĽ����Ƭ����ת��Ϊ��������
						map1.put(manager1,num);//������;���Ľ�����ӵ�map1������
						treeset.add(manager1);
						//System.out.println();
					}
					if(temp.equals("�ɶ���")) {
						StockHolder stockholder1=new StockHolder();
						temp=reader.readLine();
						stockholder1.setname(temp);
						temp=reader.readLine();
						stockholder1.setsalary(temp);
						temp=reader.readLine();
						stockholder1.setbirthday(temp);
						temp=reader.readLine();
						stockholder1.setDividend(temp);
						treeset.add(stockholder1);
					}
				}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(reader!=null){
				try{
					reader.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	//*********************************
	public int[] StringSplit(String str) {//�����ʷ�Ƭ��ȡ�ַ������飬�ٽ��ַ�������ת��Ϊ��������

        String[] names = str.split(" ");//���ո��Ƭ�������ַ���������
        int[] num=new int[str.length()];
        for(int i=0;i</*num.length*/12;i++){//���ַ�������ת��Ϊ��������
            num[i]=Integer.parseInt(names[i]);
        }
        return num;//������������
	}
	//**************************
	public int Profit(HashMap<Employee,int[]> hashmap,HashMap<Employee,int[]>hash1) {//������������
		int profit=0;
		for(Map.Entry<Employee, int[]>entry:hashmap.entrySet()) {//����hashmap,��������Ա���Ĺ���֮��
			for(int i=0;i<entry.getValue().length/*12*/;i++) {
			profit=profit+entry.getValue()[i];
					}
		}
		int bonus=0;
		for(Map.Entry<Employee, int[]>entry:hash1.entrySet()) {//����hsah1,�������о�����֮��
			for(int i=0;i<12;i++) {
				bonus=bonus+entry.getValue()[i];
			}
		}
		profit=(int)(turnover-profit-bonus);
		return profit;//�������
	}
	//*********************************
	public int StockHolderDividend(HashMap<Employee,int[]> hashmap) {//�ɶ��ֺ죬����������İٷ�֮ʮ����
		Profit(hashmap,map1);
		//System.out.println();
		return (int)(Profit(hashmap,map1)*0.01);
	}
	//*********************************
	public void paysalary(HashMap<Employee,int[]> hashmap) {//���ҹ���
		Scanner scan=new Scanner(System.in);
		System.out.print("������������");
		String name=scan.nextLine();//����Ա��������
		for(Map.Entry<Employee, int[]>entry:hashmap.entrySet()) {//����hashmap�е�Ԫ��
			if(entry.getKey().getname().equals(name)) {//�ж�����������Ƿ���Employee�еĳ�Աname���
				if(entry.getKey().intbonus()!=0) {//�ж��Ƿ�Ϊ����
					System.out.println("��Ա��Ϊ����");
					System.out.print("�������·ݣ�");
					int i=scan.nextInt();
					System.out.println(i+"�¹���Ϊ��"+entry.getValue()[i-1]);//�����Ա��������ݵĹ���
					for(Map.Entry<Employee, int[]>entry1:map1.entrySet()) {//����map1�е�Ԫ��
						if(entry1.getKey().getname().equals(name)) {//�ж�����������Ƿ���map1��Employee����ĳ�Աname���
							System.out.println(i+"�½���Ϊ��"+entry1.getValue()[i-1]);//�����Ա�������·ݵĽ���
						}
					}
				}
				else if(entry.getKey().intdividend()==0) {//�жϸ�Ա���Ƿ�Ϊ�ɶ�
						System.out.println("��Ա��Ϊ�ɶ�");
						System.out.print("�������·ݣ�");
						int i=scan.nextInt();
						if(i!=12) {//��������·ݲ���12����δ���ֺ�ʱ��
							System.out.println("��δ���ֺ�ʱ��");
						}
						else System.out.println("�ɶ���ĩ�ֺ�Ϊ��"+StockHolderDividend(hashmap));
					}
				else {//������ͨԱ���Ĺ���
					System.out.print("�������·ݣ�");
					int i=scan.nextInt();
					System.out.println(i+"�µĹ���Ϊ��"+entry.getValue()[i-1]);
					}
			}
		}
	}
	//******************
	public void PrintInformation(HashMap<Employee,int[]> map) {
        for(Map.Entry<Employee, int[]>entry:map.entrySet()) {//����hashmap�е�Ԫ�أ������ÿλԱ������Ϣ������
        	entry.getKey().print();
        	System.out.println();
        	System.out.print("һ�µ�ʮ���¹���:");
        	for(int i=0;i<entry.getValue().length/*12*/;i++) {
        		System.out.print(entry.getValue()[i]+" ");
        	}
        	if(entry.getKey().intbonus()!=0) {//�����Ա��Ϊ�����������Ա��һ��ʮ���µĽ���
        		System.out.println();
        		System.out.print("һ�µ�ʮ���µĽ���:");
        		for(Map.Entry<Employee, int[]>entry1:map1.entrySet()) {
        			if(entry.getKey().getname().equals(entry1.getKey().getname())) {
        				for(int i=0;i<12;i++) {
        					System.out.print(entry1.getValue()[i]+" ");
        				}
        			}
        		}
        	}
        	System.out.println();
        }
	}
	//************************
	public static void main(String[] args) throws IOException {
		HashMap<Employee,int[]> map=new HashMap<Employee,int[]>();
		
		//System.out.println(turnover);
		File file=new File("F:\\д�ְ�\\�½��ı��ĵ�.txt");//���ı��ļ��ж�ȡԱ����
		treeset=new HashSet<Employee>();
		Test test=new Test();
		test.getfile(file);
		
        Iterator<Employee> lter1=treeset.iterator();//����treeset�е�Ԫ�أ���������ӵ�hashmap��
        while(lter1.hasNext()) {
        	Employee emp= new Employee();
        	emp=lter1.next();
        	int [] num=test.StringSplit(emp.getsalary());
        	map.put(emp, num);
        }
        test.PrintInformation(map);//�������Ա������Ϣ
        
        System.out.println(test.Profit(map,map1));//�������
        
        boolean flag=true;
        while(flag==true) {
        	Scanner scan=new Scanner(System.in);
        	test.paysalary(map);//������
        	System.out.print("�Ƿ��������,������true/false:");
        	flag=scan.nextBoolean();
        }
		}
	}
