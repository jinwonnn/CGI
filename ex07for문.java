package day03;

import java.util.Scanner;

public class ex07for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 정수를 입력받아 1~입력받은 수 까지
// 출력! ex)7 -> 1~7까지 더하기		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 > ");
		int num = sc.nextInt();
		int i = 0;
		
		for(i=1; i<=num; i++) {
			System.out.print(i+ " ");
		}
		int total = i+i;
		System.out.println("정수들의 합 : " + total);
		
	}

}
