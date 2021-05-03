import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// View가 되는 부분
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// 반복문의 진행여부를 확인할 수 있는 변수
		boolean isOk = true;
		
		MusicPlayer mp = new MusicPlayer();
		Music song;
		
		while(isOk) {
			
		// 사용자가 볼 수 있는 기능	
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				song = mp.play();
				System.out.println(mp.musicInfo(song));
			}else if(menu == 2) {
				mp.stop();
			}else if(menu == 3) {
				song = mp.nextPlay();
				System.out.println(mp.musicInfo(song));
			}else if(menu == 4) {
				song = mp.prePlay();
				System.out.println(mp.musicInfo(song));				
			}else if(menu == 5) {
//				break;
				isOk = false;
			}
		
		
		
		}
	}

}
