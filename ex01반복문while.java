package day03;

import java.util.Scanner;

public class ex01반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num2 = 0;
		
		int num1 = 0;
		
		//숫자입력 출력문 작성
		while(true) {
			System.out.print("숫자입력 : ");
			//숫자입력받기
			int input = sc.nextInt();
			
			//-1 입력시 종료
			if (input == -1){
				System.out.println("종료되었습니다");
				break; //반복문 종료
			}
			
			else if (input%2==0) {
				num2++;
			}
			else {
				num1++;
			}
			System.out.println("짝수의 개수 : " + num2);
			System.out.println("홀수의 개수 : " + num1);
			}
			
			
		

		

	}

}
