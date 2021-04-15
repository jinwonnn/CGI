package day03;

import java.util.Scanner;

public class ex03로그인프로그램while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로그인 기능 만들기
			
		// 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		while(true) {
		// 아이디 입력하세요 출력 후 입력받기
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		// 비밀번호를 입력하세요 출력 후 입력받기
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		
		// 아이다가 Hello 이면서 비밀번호가 1234 일때 로그인 성공! >> 프로그램 종료
		if(id.equals("Hello") && pw.equals("1234")){
				
			//성공했을 때
			System.out.println("로그인 성공!");
			break;
		}else {
			//실패했을 때
			System.out.println("아이디와 비밀번호를 확인해주세요~");
			//사용자에게 물어보기 다시하겠습니까? (Y/N)
			System.out.print("재입력 하시겠습니까? (Y/N) ");
			String re = sc.next();
			if(re.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(re.equals("Y")) {
				continue;
			}
				
			
			// Y 입력받기 . 다시하기 // N 입력받기 . 종료하기
			// N을 입력받으면 프로그램 종료까지
		}
		// 둘중 하나라도 틀린 경우에는 아이돠 비밀번호를 확인해주세요 출력1 >> 다시 반복문 출력
		
	}	
		
		
		

	}

}
