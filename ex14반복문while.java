package day02;

import java.util.Scanner;

public class ex14반복문while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(num<10) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}	//괄호가 위에 있어야 반복계속하고 num값이 10 이상일시 괄호 나와서 최종 종료문 도달
		
		System.out.print("종료되었습니다.");
	}
}