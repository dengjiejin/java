package 交通运输;

public interface Transport {
	 String carname="car";			
	 String hightrainname="hightrain";
	 String planename="plane";
	 double gotime=20/60;			//小时
	 double backtime=20/60;			//小时
	 double tickettime=5/60;		//小时
	 double securitytime=2/60;		//小时
	 double waitetime=30/60;		//小时
	 double carspeed=110;			//千米每小时
	 double hightrainspeed=300;		//千米每小时
	 double planespeed=800;			//千米每小时
	 double carprice=0.32;			//每公里价格
	 double hightrainprice=0.45;	//每公里价格
	 double planeprice=0.75;		//每公里价格
	 double[] compute(double distance);
	 void print();
}
