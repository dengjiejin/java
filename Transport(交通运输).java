package ��ͨ����;

public interface Transport {
	 String carname="car";			
	 String hightrainname="hightrain";
	 String planename="plane";
	 double gotime=20/60;			//Сʱ
	 double backtime=20/60;			//Сʱ
	 double tickettime=5/60;		//Сʱ
	 double securitytime=2/60;		//Сʱ
	 double waitetime=30/60;		//Сʱ
	 double carspeed=110;			//ǧ��ÿСʱ
	 double hightrainspeed=300;		//ǧ��ÿСʱ
	 double planespeed=800;			//ǧ��ÿСʱ
	 double carprice=0.32;			//ÿ����۸�
	 double hightrainprice=0.45;	//ÿ����۸�
	 double planeprice=0.75;		//ÿ����۸�
	 double[] compute(double distance);
	 void print();
}
