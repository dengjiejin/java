package ��ͨ����;

public class Car implements Transport {
	double price=0;
	double time=0;
	Car(){}
	public double[] compute(double distance) {
		time=gotime+backtime+tickettime+securitytime+waitetime+distance/carspeed;
		price=distance*carprice;
		double[] com;
		com= new double[]{time,price};
		return com;
	}

		public void print() {
			System.out.println(carname+"���ѵ�ʱ��Ϊ��"+time+"�۸�Ϊ��"+price);
		}
}

