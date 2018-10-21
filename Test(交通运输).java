package 交通运输;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	static Map<String,double[]> hashmap=new HashMap<String,double[]>();
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入出发地：");
		String beginplace=scan.nextLine();
		System.out.print("请输入目的地：");
		String endplace=scan.nextLine();
		System.out.print("请输入距离");
		double distance=scan.nextInt();
		Car car=new Car();
		Plane plane=new Plane();
		HighTrain hightrain=new HighTrain();
		hashmap.put(Transport.carname, car.compute(distance));
		hashmap.put(Transport.planename, plane.compute(distance));
		hashmap.put(Transport.hightrainname, hightrain.compute(distance));
		for (Entry<String, double[]> entry : hashmap.entrySet()) {
			System.out.println(beginplace+"到"+endplace+"乘坐"+entry.getKey()+"所需的时间为"+entry.getValue()[0]);
			}
//		car.print();
//		plane.print();
//		hightrain.print();
	}

}
