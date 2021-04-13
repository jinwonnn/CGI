package day02;

import java.util.Scanner;

public class ex10조건문 {
	
	public static void main(String[] args) {
		//일한 시간 입력 받아 총 임금을 계산하는 시급계산기 만들기. 시급 : 5000원, 8시간 초과 1.5배
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간 : ");
		
		int input = sc.nextInt();
		
//		double overtime = (input-8)*1.5;
//		
//		if(input>8) {
//			System.out.println("총 임금은" + ((input*5000)+(overtime*5000)) + "원 입니다.");
//		}else {
//			System.out.println("총 임금은" + (input*5000) + "원 입니다.");
//		}
		int result = 0;
		
		if(input<=8) {
			result = input*5000;
		}else {
			result = 40000 + (int)((input-8)*5000*1.5); //형변환 실수에 int !
		}
		
		System.out.println("총 임금은 " + result + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
