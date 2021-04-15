package day04;

import java.util.Scanner;

public class ex11배열_문자열타입배열 {

	public static void main(String[] args) {
		// 문자열 타입의 배열 생성!
		Scanner sc = new Scanner(System.in);

		char[] game = { '수', '박' };

		System.out.println("==== 수박 게임 Start! =====");
		// 배열의 생성방법
		// 1. 배열선언 후 (크기) -> 값 지정
		// 2. 배열의 선언과 동시에 값 지정
		// 숫자를 입력받을 수 있는 기능
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		// 입력받은 숫자가 짝수, 홀수 판단
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				
				System.out.print(game[0]);
			}else {
				System.out.print(game[1]);
			}

				// '수' , '박' 출력!
			}

		}
	}
