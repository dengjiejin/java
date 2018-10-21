package 交通运输;

public class HighTrain implements Transport{
	double price=0;
	double time=0;
	public HighTrain() {}
	public double[] compute(double distance) {
		time=gotime+backtime+tickettime+securitytime+waitetime+distance/hightrainspeed;
		price=distance*hightrainprice;
		double[] com;
		com= new double[]{time,price};
		return com;
		}

		public void print() {
			System.out.println(hightrainname+"花费的时间为："+time+"价格为："+price);
		}
	
}
