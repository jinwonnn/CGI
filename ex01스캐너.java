package day02;

import java.util.Scanner;

public class ex01스캐너 {

	public static void main(String[] args) {
		//1. 스캐너 기능 불러오기
		
		Scanner sc = new Scanner(System.in);
				
	
		//2. Java점수 입력이라는 출력문을 작성
		System.out.print("Java 점수 입력 : ");
				
				
		//3. 사용자에게 점수 입력받기
		int score1 = sc.nextInt();
		
		
		
		//4. Web점수 입력이라는 출력문 작성
		System.out.print("Web 점수 입력 : ");
		
		//5. 사용자에게 점수를 입력받기
		int score2 = sc.nextInt();
		
		//6. Android 점수 입력 출력문 작성
		System.out.print("Android 점수 입력 : ");		
		
		//7. 사용자에게 점수를 입력받기
		int score3 = sc.nextInt();
		
		// **중복 코드 변수로 만들어 효율적으로 사용하기
		int total = (score1 + score2 + score3);
				
		//8. 합계와 평균 출력받기
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + total/3);
		
	}

}
