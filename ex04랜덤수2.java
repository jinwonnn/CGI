package day03;

import java.util.Random;
import java.util.Scanner;

public class ex04랜덤수2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;

			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();
			if (num1 + num2 == result) {
				System.out.println("Success");
				break;
			} else {
				System.out.println("Fail");
				System.out.print("다시 시작하겠습니까 (Y / N) ");
				String anc = sc.next();
				if (anc.equals("Y")) {
					continue;
				} else {
					System.out.println("종료하곗습니다");
					break;
				}
			}

		}
	}
}
