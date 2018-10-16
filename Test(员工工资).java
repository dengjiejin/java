package java作业;

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
					
					if(temp.equals("员工：")) {
						Employee employee1=new Employee();
						temp=reader.readLine();
						employee1.setname(temp);
						temp=reader.readLine();
						employee1.setsalary(temp);
						temp=reader.readLine();
						employee1.setbirthday(temp);
						treeset.add(employee1);
					}
					
					if(temp.equals("经理：")) {
						Manager manager1=new Manager();
						temp=reader.readLine();
						manager1.setname(temp);
						temp=reader.readLine();
						manager1.setsalary(temp);
						temp=reader.readLine();
						manager1.setbirthday(temp);
						temp=reader.readLine();
						manager1.setbonus(temp);
						int[] num=StringSplit(manager1.getbonus());//将经理每个月的奖金分片，并转换为整型数组
						map1.put(manager1,num);//将经理和经理的奖金添加到map1集合中
						treeset.add(manager1);
						//System.out.println();
					}
					if(temp.equals("股东：")) {
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
	public int[] StringSplit(String str) {//将工资分片提取字符串数组，再将字符串数组转换为整型数组

        String[] names = str.split(" ");//按空格分片，放入字符串数组中
        int[] num=new int[str.length()];
        for(int i=0;i</*num.length*/12;i++){//将字符串数组转换为整型数组
            num[i]=Integer.parseInt(names[i]);
        }
        return num;//返回整型数组
	}
	//**************************
	public int Profit(HashMap<Employee,int[]> hashmap,HashMap<Employee,int[]>hash1) {//计算年终利润
		int profit=0;
		for(Map.Entry<Employee, int[]>entry:hashmap.entrySet()) {//遍历hashmap,计算所有员工的工资之和
			for(int i=0;i<entry.getValue().length/*12*/;i++) {
			profit=profit+entry.getValue()[i];
					}
		}
		int bonus=0;
		for(Map.Entry<Employee, int[]>entry:hash1.entrySet()) {//遍历hsah1,计算所有经理奖金之和
			for(int i=0;i<12;i++) {
				bonus=bonus+entry.getValue()[i];
			}
		}
		profit=(int)(turnover-profit-bonus);
		return profit;//输出利润
	}
	//*********************************
	public int StockHolderDividend(HashMap<Employee,int[]> hashmap) {//股东分红，按年终利润的百分之十计算
		Profit(hashmap,map1);
		//System.out.println();
		return (int)(Profit(hashmap,map1)*0.01);
	}
	//*********************************
	public void paysalary(HashMap<Employee,int[]> hashmap) {//查找工资
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入姓名：");
		String name=scan.nextLine();//输入员工的姓名
		for(Map.Entry<Employee, int[]>entry:hashmap.entrySet()) {//遍历hashmap中的元素
			if(entry.getKey().getname().equals(name)) {//判断输入的姓名是否与Employee中的成员name相等
				if(entry.getKey().intbonus()!=0) {//判断是否为经理
					System.out.println("该员工为经理");
					System.out.print("请输入月份：");
					int i=scan.nextInt();
					System.out.println(i+"月工资为："+entry.getValue()[i-1]);//输出该员工输入年份的工资
					for(Map.Entry<Employee, int[]>entry1:map1.entrySet()) {//遍历map1中的元素
						if(entry1.getKey().getname().equals(name)) {//判断数入的姓名是否与map1中Employee对象的成员name相等
							System.out.println(i+"月奖金为："+entry1.getValue()[i-1]);//输出该员工输入月份的奖金
						}
					}
				}
				else if(entry.getKey().intdividend()==0) {//判断该员工是否为股东
						System.out.println("该员工为股东");
						System.out.print("请输入月份：");
						int i=scan.nextInt();
						if(i!=12) {//如果输入月份不是12，则未到分红时间
							System.out.println("还未到分红时间");
						}
						else System.out.println("股东年末分红为："+StockHolderDividend(hashmap));
					}
				else {//查找普通员工的工资
					System.out.print("请输入月份：");
					int i=scan.nextInt();
					System.out.println(i+"月的工资为："+entry.getValue()[i-1]);
					}
			}
		}
	}
	//******************
	public void PrintInformation(HashMap<Employee,int[]> map) {
        for(Map.Entry<Employee, int[]>entry:map.entrySet()) {//遍历hashmap中的元素，即输出每位员工的信息及工资
        	entry.getKey().print();
        	System.out.println();
        	System.out.print("一月到十二月工资:");
        	for(int i=0;i<entry.getValue().length/*12*/;i++) {
        		System.out.print(entry.getValue()[i]+" ");
        	}
        	if(entry.getKey().intbonus()!=0) {//如果该员工为经理，则输出该员工一到十二月的奖金
        		System.out.println();
        		System.out.print("一月到十二月的奖金:");
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
		File file=new File("F:\\写字板\\新建文本文档.txt");//从文本文件中读取员工信
		treeset=new HashSet<Employee>();
		Test test=new Test();
		test.getfile(file);
		
        Iterator<Employee> lter1=treeset.iterator();//遍历treeset中的元素，并将其添加到hashmap中
        while(lter1.hasNext()) {
        	Employee emp= new Employee();
        	emp=lter1.next();
        	int [] num=test.StringSplit(emp.getsalary());
        	map.put(emp, num);
        }
        test.PrintInformation(map);//输出所有员工的信息
        
        System.out.println(test.Profit(map,map1));//输出利润
        
        boolean flag=true;
        while(flag==true) {
        	Scanner scan=new Scanner(System.in);
        	test.paysalary(map);//发工资
        	System.out.print("是否继续查找,请输入true/false:");
        	flag=scan.nextBoolean();
        }
		}
	}
