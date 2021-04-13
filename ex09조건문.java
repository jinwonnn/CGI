package day02;

import java.util.Scanner;

public class ex09조건문 {

	public static void main(String[] args) {
		// 반올림은 %10 // 10으로 나눈 나머지를 구하면됌
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int num = sc.nextInt();
		
		int n = num%10; //반올림 뒷자리 구하기 
		int result = 0;
		if (n >=5) {
			result = (num/10+1) *10; //10으로 나눈 몫 +1 , 1의자리는 *10으로 reset
		}else {
			result = (num/10) *10;
		}
		
 	
		System.out.println("반올림 수 : " + result);

	}

}
