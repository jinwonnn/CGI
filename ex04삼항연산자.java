package day02;

import java.util.Scanner;

public class ex04삼항연산자 {

	public static void main(String[] args) {
		// 
    Scanner sc = new Scanner(System.in);
    
    System.out.print("첫 번째 정수입력 : ");
    
    int num1 = sc.nextInt();
    
    System.out.print("첫 번째 정수입력 : ");
    
    int num2 = sc.nextInt();
    
    int result1 = num1-num2;
    
    int result2 = num2-num1;
    
    System.out.println
    ((num1>num2)? ("두 수의 차 :" +result1) : ("두 수의 차 : " +result2) );
    
    
    
	}

}
