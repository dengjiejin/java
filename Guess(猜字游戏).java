package djjTest;

import java.util.Scanner;
import java.util.Random;
public class Guess {
	//private String player;
	private int score;
	private int guess;
	
	public Guess() {    //�����޲ι��캯��
		score=0;
		guess=0;
	}
	
	public static int Guessgame() {       //����һ��0��9�������
		int number= (int) (Math.random() * 10);
		return number;
	}
	
	public  int input() {              //�������²�ֵ
		Scanner scan=new Scanner(System.in);
		System.out.print("������²�����֣�");
		int guess=scan.nextInt();
		return guess;
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	//	Scanner scan=new Scanner(System.in);
		Guess[] player=new Guess[3];
		for(int i=0;i<3;i++) {
			player[i]=new Guess();
		}
		for(int i=0;i<5;i++) {
			int number=Guessgame();
			System.out.println(number);
			System.out.println("����λ�������ֱ����֣�");
			
			for(int j=0;j<3;j++) {
				player[j].guess=player[j].input();
			}
			
			if(player[0].guess==number||player[1].guess==number||player[2].guess==number) {
		
			if(player[0].guess==number) {
				System.out.println("���1��ȷ");
				player[0].score++;
			}
			if(player[1].guess==number) {
				System.out.println("���2��ȷ");
				player[1].score++;
			}
			if(player[2].guess==number) {
				System.out.println("���3��ȷ");
				player[2].score++;
			}}
			else System.out.println("��λ��Ҷ�������ȷ��Ϊ"+number);
		}
			
		for(int i=0;i<3;i++) {
			System.out.println("���"+(i+1)+"�ķ���Ϊ"+player[i].score);
		}
	}

}
