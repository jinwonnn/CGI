package day03;

import java.util.Random;
import java.util.Scanner;

public class ex04랜덤수 {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
			//랜덤수 + 랜덤수 = 랜덤수 게임
		while(true)	{
			int num1 = rd.nextInt(10)+1; 
			System.out.println("첫번째 랜덤수 : " + num1);
			
			int num2 = rd.nextInt(10)+1;
			System.out.println("두번째 랜덤수 : " + num2);
			
			int num3 = rd.nextInt(10)+1;	
				if(num1+num2 == num3) {
				System.out.println(num3 + " Success 정답입니다. "
						+ "프로그램을 종료합니다");
				break;
			
				}else {
					System.out.println(num3 + " Fail");
					System.out.print( "계속 하시겠습니다 >> (Y/N) ");
					String ans = sc.next();
					if(ans.equals("Y")) {
						continue;
					}else {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
			}
		}

	}
}
