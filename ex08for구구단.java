package day03;

import java.util.Scanner;

public class ex08for������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		System.out.print("�� �Է� : ");
//		int input = sc.nextInt();
		for (int j = 1; j < 10; j++) {

			for (int i = 1; i < 10; i++) {
				int total = (j * i);
				System.out.print(j + "*" + i + "=" + total + "\t");
			}
			System.out.println();
		}
		
	}

}
