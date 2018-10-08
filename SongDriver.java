package cn.djj;

import java.util.*;
public class SongDriver {
	public Master master;
	public Player player;
	
	public SongDriver() {//��ʼ��Master��Player
	}
	public static void main(String[] args) {
			SongDriver  songdriver=new SongDriver();
		    songdriver.master=new Master();
			songdriver.player=new Player();	

			songdriver.player.bookanSong();//��ҵ��
			songdriver.master.bookanplay();//�����˲��Ÿ���
		}
} 

class Song {
	private String songname;//��������
	private String singer;//����
	private double time;//����ʱ��
	
	public Song(String songname,String singer,double time) {
		//�вι��캯��
		this.songname=songname;
		this.singer=singer;
		this.time=time;
	}
	public Song() {
	}
	public String getsongname() {//��ȡ����
		return songname;
	}
	public void setsongname(String songname) {//���ø���
		this.songname=songname;
	}
	
	public String getsinger() {//��ȡ����
		return singer;
	}
	public void setsinger(String singer) {//���ø���
		this.singer=singer;
	}
	
	public double gettime() {//��ȡʱ��
		return time;
	}
	public void settime(double time) {//����ʱ��
		this.time=time;
	}
}

class Master {
	static List<Song>listsong;//�����б�
	public Master() {//��ʼ��List
		listsong=new ArrayList<Song>();
	}
	public void bookanplay() {//���Ÿ���
		Iterator<Song> iterator3=Master.listsong.iterator();
		while(iterator3.hasNext()) {//����listsong�е�Ԫ��
			Song s=iterator3.next();
			System.out.println("������"+s.getsongname()+" "+"����"+s.getsinger()+" "+"ʱ��"+s.gettime());
		}
	}
}

class Player {
	public Player() {
	}
	public void bookanSong() {
		boolean flag=true;
		while(flag) {
		Song song1=new Song();
		Scanner scan=new Scanner(System.in);
		System.out.println("������������֣�ʱ����");
		song1.setsongname(scan.nextLine());
		song1.setsinger(scan.nextLine());
		song1.settime(scan.nextDouble());
		Master.listsong.add(song1);
		System.out.println("�Ƿ������Ӹ�����ѡ��true/false:");
		flag=scan.nextBoolean();
		}
	}
}
