package cn.djj;

import java.util.*;
public class SongDriver {
	public Master master;
	public Player player;
	
	public SongDriver() {//初始化Master和Player
	}
	public static void main(String[] args) {
			SongDriver  songdriver=new SongDriver();
		    songdriver.master=new Master();
			songdriver.player=new Player();	

			songdriver.player.bookanSong();//玩家点歌
			songdriver.master.bookanplay();//主持人播放歌曲
		}
} 

class Song {
	private String songname;//歌曲名称
	private String singer;//歌手
	private double time;//歌曲时长
	
	public Song(String songname,String singer,double time) {
		//有参构造函数
		this.songname=songname;
		this.singer=singer;
		this.time=time;
	}
	public Song() {
	}
	public String getsongname() {//获取歌名
		return songname;
	}
	public void setsongname(String songname) {//设置歌名
		this.songname=songname;
	}
	
	public String getsinger() {//获取歌手
		return singer;
	}
	public void setsinger(String singer) {//设置歌手
		this.singer=singer;
	}
	
	public double gettime() {//获取时长
		return time;
	}
	public void settime(double time) {//设置时长
		this.time=time;
	}
}

class Master {
	static List<Song>listsong;//歌曲列表
	public Master() {//出始化List
		listsong=new ArrayList<Song>();
	}
	public void bookanplay() {//播放歌曲
		Iterator<Song> iterator3=Master.listsong.iterator();
		while(iterator3.hasNext()) {//遍历listsong中的元素
			Song s=iterator3.next();
			System.out.println("歌曲："+s.getsongname()+" "+"歌手"+s.getsinger()+" "+"时长"+s.gettime());
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
		System.out.println("输入歌名，歌手，时长：");
		song1.setsongname(scan.nextLine());
		song1.setsinger(scan.nextLine());
		song1.settime(scan.nextDouble());
		Master.listsong.add(song1);
		System.out.println("是否继续添加歌曲，选择true/false:");
		flag=scan.nextBoolean();
		}
	}
}
