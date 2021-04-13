package day02;

import java.util.Scanner;

public class ex12스위치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int grade = sc.nextInt();
		String result = ""; // 변수 만들어 로직 줄이기
		
		// switch 문의 식은 실제 값으로 표현이 되어야 한다.
		// 스스로 멈출 수 있는 기능을 가지고 있지 않다. -> break 사용 필요!
		// 90 ~ 99 / 10 = 9 -> case 는 실제값만 가능하기에 
		switch(grade/10) {
		case 10:
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;			
		// 그 어느곳에도 해당하지 않는 녀석들
		default:
			result = "D";
			break;
		}
		System.out.println( result + " 학점 입니다.");
		
		
		
		
		
		
	}

}
