package ��ͨ����;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	static Map<String,double[]> hashmap=new HashMap<String,double[]>();
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("����������أ�");
		String beginplace=scan.nextLine();
		System.out.print("������Ŀ�ĵأ�");
		String endplace=scan.nextLine();
		System.out.print("���������");
		double distance=scan.nextInt();
		Car car=new Car();
		Plane plane=new Plane();
		HighTrain hightrain=new HighTrain();
		hashmap.put(Transport.carname, car.compute(distance));
		hashmap.put(Transport.planename, plane.compute(distance));
		hashmap.put(Transport.hightrainname, hightrain.compute(distance));
		for (Entry<String, double[]> entry : hashmap.entrySet()) {
			System.out.println(beginplace+"��"+endplace+"����"+entry.getKey()+"�����ʱ��Ϊ"+entry.getValue()[0]);
			}
//		car.print();
//		plane.print();
//		hightrain.print();
	}

}
