import java.util.Scanner;
public class Car {
	private String name;
	private double speed;
	private double tank;
	
	public Car() {    //�޲ι��캯��
		name="baoma";
		speed=20;
		tank=200;
	}
	public Car(String name,double speed,double tank) {//�вι��캯��
		this.name=name;
		this.speed=speed;
		this.tank=tank;
	}
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�����������ĸ����ԣ�");
		name=scan.nextLine();
		speed=scan.nextDouble();
		tank=scan.nextDouble();
	}
	public void output() {
		System.out.println("��������ĸ����ԣ�"+name+" "+speed+" "+tank);
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
