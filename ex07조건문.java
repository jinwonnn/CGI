package day02;

import java.util.Scanner;

public class ex07조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.print("3과 5의 배수입니다");
		}
		else {
			System.out.print("3과 5의 배수가 아닙니다");
		}

	}

}
