package day02;

import java.util.Scanner;

public class ex03삼항연산자 {

	
	public static void main(String[] args) {
//		// 홀수, 짝수
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요 >>");
//        
        int num = sc.nextInt();
//        # if  조건문 사용로직
        
//        if(num%2 == 0) {
//        	System.out.println(num + "은 짝수입니다.");
//        }else {
//        	System.out.println(num + "은 홀수입니다.");
//        }
//       # 삼항연산자 로직
        System.out.println((num%2==0)? num + "은 짝수입니다" : num +"은 홀수입니다");
		
		
		
		
		
		
		
		
	}

}
