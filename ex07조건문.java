package day02;

import java.util.Scanner;

public class ex07���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.print("3�� 5�� ����Դϴ�");
		}
		else {
			System.out.print("3�� 5�� ����� �ƴմϴ�");
		}

	}

}
