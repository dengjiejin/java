package ��ͨ����;

public class Plane implements Transport {
	double price=0;
	double time=0;
	public Plane() {}
	public double[] compute(double distance) {
		time=gotime+backtime+tickettime+securitytime+waitetime+distance/planespeed;
		price=distance*planeprice;
		double[] com;
		com= new double[]{time,price};
		return com;
	}
	public void print() {
		System.out.println(planename+"���ѵ�ʱ��Ϊ��"+time+"�۸�Ϊ��"+price);
	}
}
