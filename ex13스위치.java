package day02;

import java.util.Scanner;

public class ex13스위치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		
		int season = sc.nextInt();
		
		String result = "";
		switch(season) {
		case 12:
		case 1:
		case 2:
			result = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			result = "봄";
			break;
		case 6:
		case 7:
		case 8:
			result = "여름";
			break;
		case 9:
		case 10:
		case 11:
			result = "가을";
			break;
		}
		System.out.println(season + "월은 " +  result + "입니다!");
	}

}
