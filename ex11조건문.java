package day02;

import java.util.Scanner;

public class ex11조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		
		int grade = sc.nextInt();
				
		
		
//		if ( grade >= 90) {
//			System.out.println("A학점입니다");
//		}else if( 90 > grade && grade >= 80 ){
//			System.out.println("B학점입니다");
//		}else if( 80 > grade && grade >= 70 ){
//			System.out.println("C학점입니다");
//		}else if( 70 > grade){
//			System.out.println("F학점입니다");
//		}
		String result = "";
		if (grade >= 90) {
			result = "A";
		}else if (grade >= 80) {
			result = "B";
		}else if (grade >= 70) {
			result = "C";
		}else {
			result = "F";
		}
		
		System.out.println(result + "학점입니다.");		
		
		
		
	}

}
