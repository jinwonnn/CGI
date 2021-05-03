
public class Music {
	// 음악에 대한 정보만 저장할 수 있는 Model -> Value Object (VO Class)
	
	// 노래제목, 가수이름, 플레이타임, 노래경로
	private String title;
	private String singer;
	private int playTime;
	private String musicPath;
	
	// 정보들을 추가 해 줄수있는 생성자 메소드
	public Music(String title, String singer, int playTime, String musicPath) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.musicPath = musicPath;
	}

	// 정보를 가지고 올 수 있는 getter() 생성

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public void setMusicPach(String musicPath) {
		this.musicPath = musicPath;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
