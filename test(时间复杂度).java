package cn.djj;

import java.util.*;
public class test {
	public static void main(String[] args) {
		Set<Integer> hashset=new HashSet<Integer>();
		Set<Integer> treeset=new TreeSet<Integer>();
		List<Integer> arraylist=new ArrayList<Integer>();
		List<Integer> linkedlist=new LinkedList<Integer>();
		for(int m=10000;m<=1000000;m=m+10000) {
			for(int i=1;i<=m;i++) {//分别向hashset,treeset,arraylist.linklist中添加数据
				hashset.add(i);
				treeset.add(i);
				arraylist.add(i);
				linkedlist.add(i);
			}
			
			//HashSet的遍历，并且计算遍历时间
			Iterator<Integer> value1=hashset.iterator();
			long begintime1=System.nanoTime();
			while(value1.hasNext()) {
				value1.next();
			}
			long endtime1=System.nanoTime();
			System.out.println((endtime1-begintime1)/10000);
			hashset.clear();
			
			//TreeSet的遍历，并且计算遍历时间
			Iterator<Integer> value2=treeset.iterator();
			long begintime2=System.nanoTime();
			while(value2.hasNext()) {
				value2.next();
			}
			long endtime2=System.nanoTime();
			System.out.println((endtime2-begintime2)/10000);
			treeset.clear();
			
			//ArrayList的遍历，并且计算遍历时间
			Iterator<Integer> value3=arraylist.iterator();
			long begintime3=System.nanoTime();
			while(value3.hasNext()) {
				value3.next();
			}
			long endtime3=System.nanoTime();
			System.out.println((endtime3-begintime3)/10000);
			arraylist.clear();
			
			//LinkedList的遍历，并且计算遍历时间
			Iterator<Integer> value4=linkedlist.iterator();
			long begintime4=System.nanoTime();
			while(value4.hasNext()) {
				value4.next();
			}
			long endtime4=System.nanoTime();
			System.out.println((endtime4-begintime4)/10000);
			linkedlist.clear();
			
			System.out.println("**************");
		}
	}
}
