package djjTest;

import java.util.Scanner;
import java.util.Random;
public class Guess {
	//private String player;
	private int score;
	private int guess;
	
	public Guess() {    //定义无参构造函数
		score=0;
		guess=0;
	}
	
	public static int Guessgame() {       //给定一个0到9的随机数
		int number= (int) (Math.random() * 10);
		return number;
	}
	
	public  int input() {              //玩家输入猜测值
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入猜测的数字：");
		int guess=scan.nextInt();
		return guess;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	//	Scanner scan=new Scanner(System.in);
		Guess[] player=new Guess[3];
		for(int i=0;i<3;i++) {
			player[i]=new Guess();
		}
		for(int i=0;i<5;i++) {
			int number=Guessgame();
			System.out.println(number);
			System.out.println("请三位玩家输入分别数字：");
			
			for(int j=0;j<3;j++) {
				player[j].guess=player[j].input();
			}
			
			if(player[0].guess==number||player[1].guess==number||player[2].guess==number) {
		
			if(player[0].guess==number) {
				System.out.println("玩家1正确");
				player[0].score++;
			}
			if(player[1].guess==number) {
				System.out.println("玩家2正确");
				player[1].score++;
			}
			if(player[2].guess==number) {
				System.out.println("玩家3正确");
				player[2].score++;
			}}
			else System.out.println("三位玩家都错误，正确答案为"+number);
		}
			
		for(int i=0;i<3;i++) {
			System.out.println("玩家"+(i+1)+"的分数为"+player[i].score);
		}
	}

}
