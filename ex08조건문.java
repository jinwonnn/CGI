package day02;

import java.util.Scanner;

public class ex08조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
//		if (num % 2 == 0) {
//			System.out.println(num +"은 짝수입니다");
//		}
//		else { 
//			System.out.println(num + "은 홀수입니다");
//			}
		// #특정 영역에서 선언이 된 변수는 , 그 영역에서만 사용이 된다 -> 지역변수
		if (num % 2 == 0) {
			String result = "짝수";
			System.out.println(num + "은" + result +"입니다");
		}else {
			String result = "홀수";
			System.out.println(num + "은" + result +"입니다");
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
