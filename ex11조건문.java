package day02;

import java.util.Scanner;

public class ex11���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		
		int grade = sc.nextInt();
				
		
		
//		if ( grade >= 90) {
//			System.out.println("A�����Դϴ�");
//		}else if( 90 > grade && grade >= 80 ){
//			System.out.println("B�����Դϴ�");
//		}else if( 80 > grade && grade >= 70 ){
//			System.out.println("C�����Դϴ�");
//		}else if( 70 > grade){
//			System.out.println("F�����Դϴ�");
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
		
		System.out.println(result + "�����Դϴ�.");		
		
		
		
	}

}
