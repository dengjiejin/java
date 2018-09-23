import java.util.Scanner;
public class Car {
	private String name;
	private double speed;
	private double tank;
	
	public Car() {    //无参构造函数
		name="baoma";
		speed=20;
		tank=200;
	}
	public Car(String name,double speed,double tank) {//有参构造函数
		this.name=name;
		this.speed=speed;
		this.tank=tank;
	}
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入汽车的个属性：");
		name=scan.nextLine();
		speed=scan.nextDouble();
		tank=scan.nextDouble();
	}
	public void output() {
		System.out.println("输出汽车的个属性："+name+" "+speed+" "+tank);
	}
	
	
	public static void main(String[] args) {
		Car[] car=new Car[5];
		for(int i=0;i<5;i++) {
			car[i]=new Car();
		}
		for(int i=0;i<car.length;i++) {
			car[i].input();
			car[i].output();
		}
	}
}
