package java作业;

public class StockHolder extends Employee {
	String dividend;
	public StockHolder() {
	}
	public StockHolder(String dividend) {
		this.dividend=dividend;
	}
	public void setDividend(String dividend) {
		this.dividend=dividend;
	}
	public String getDividend() {
		return dividend;
	}
	
	public void print() {
		super.print();
		if(dividend!=null) {
		System.out.print("分红："+dividend);}
	}
	public int println() {
		super.println();
		if(dividend!=null) {
			System.out.print("分红 ："+dividend);
			int adividend=Integer.parseInt(dividend);
			return adividend; 
			}
		else return 0;
	}
	public int intdividend() {
		super.intdividend();
		if(dividend!=null) {
			int adividend=Integer.parseInt(dividend);
			return adividend; 
		}
		return 1;
	}
	
}
