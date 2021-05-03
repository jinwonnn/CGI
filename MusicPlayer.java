import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	// 음악의 재생을 제어하는 클래스 -> Controller 
	
	// 노래를 담을수 있도록 만들기
	
	// 여러개의 음악을 담을수 있는 가변리스트(ArrayList) 생성
	ArrayList<Music> list = new ArrayList<>();
	
	// MP3Player 클래스를 사용하기 위한 객체 생성
	MP3Player mp3 = new MP3Player();
	Music song ;
	
	// 플레이 되고 있는 곡의 인덱스 번호를 기억하기 위한 변수 생성
	int num = 0;
	
	
	
	
	// 여러개의 음악을 리스트에 추가해줄 생성자 메소드
	public MusicPlayer() {
	      
	      list.add(new Music("라일락", "아이유", 40, "music/lilac.mp3"));
	      list.add(new Music("On the ground", "로제", 90, "music/On the ground.mp3"));
	      list.add(new Music("parachute", "John K", 100, "music/parachute.mp3"));
	      list.add(new Music("peaches", "Justin Bieber", 10, "music/peaches.mp3"));
	      list.add(new Music("Rollin", "브레이브 걸스", 117, "music/rollin.mp3"));
	   
	   }
	
	// 노래를 재생하기 위한 메소드 생성
	public Music play() {
		Music song = list.get(num);
		
		// 재생의 조건 추가하기 -> 현재 재생되고 있는 노래가 없을때만 노래를 재생!
		// boolean 타입의 isPlaying() : 재생되는 음악이 있다 (true) / false
		if(!mp3.isPlaying()) {
			//MP3Player의 ()
			mp3.play(song.getMusicPath());
		}
		
		// MP3Player의 Play()
//		mp3.play(song.getMusicPath());
		// 요녀석이 위에있는 조건이랑 중복으로 재생이 되어서 
		// 재생을 하면 두개가 재생되고 스탑시에 하나만 멈추고 있었어요! 한번 확인하시면 될꺼에요!
		
		return song;
	}
	
	// 음악 재생시 정보를 보여주는 메소드 생성
	public String musicInfo(Music song) {
		
		return song.getTitle() + ", " + song.getSinger() + ", " + changeTime(song);
	}
	
	// 재생시간을 분/초로 나눠주는 메소드
	public String changeTime(Music song) {
		return (song.getPlayTime() / 60) + "분" + (song.getPlayTime() % 60) + "초";
	}
	
	// 음악재생을 멈춰줄 수 있는 메소드
	public void stop() {
		if(mp3.isPlaying()) {
			mp3.stop();
			
		}
	}
	
	// 다음곡을 재생하기 위한 메소드
	public Music nextPlay() {
		// 0 > 1 > 2 > 3 > 4 > 0
		if(num < list.size()-1) {
			num++;
		}else {
			num = 0;
		}
		
		// 현재 재생되고 있는 노래가 있다면 곡을 정지해 주자
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		song = list.get(num);
		mp3.play(song.getMusicPath());
		return song;
		
	}
	
	// 이전 곡 메소드
	public Music prePlay() {
		if(num < list.size()-1) {
			num--;
		}else {
			num = 0;
		}
		
		// 현재 재생되고 있는 노래가 있다면 곡을 정지해 주자
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		song = list.get(num);
		mp3.play(song.getMusicPath());
		return song;
	}
	
	
	
	
}
