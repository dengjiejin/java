package hello;

public class hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int N=99;
		for(;N>=0;N--) {
			if(N==1) {
				System.out.println((N+1)+" "+"bottles of beer on the wall "+(N+1)+" bottles of on the wall");
				System.out.println("Take one down");
				System.out.println("Pass it around");
				System.out.println(N+" "+"bottle of beer on the wall");
				continue;
			}
			if(N==0) {
				System.out.println((N+1)+" "+"bottle of beer on the wall "+(N+1)+" bottle of on the wall");
				System.out.println("Take one down");
				System.out.println("Pass it around");
				System.out.println(N+" "+"bottle of beer on the wall");
				System.out.println("NO more bottle of beer on the wall");
				continue;
			}
			System.out.println((N+1)+" "+"bottles of beer on the wall "+(N+1)+" bottles of on the wall");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			System.out.println(N+" "+"bottles of beer on the wall");
			
		}
	}

}
