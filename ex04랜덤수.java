package day03;

import java.util.Random;
import java.util.Scanner;

public class ex04������ {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
			//������ + ������ = ������ ����
		while(true)	{
			int num1 = rd.nextInt(10)+1; 
			System.out.println("ù��° ������ : " + num1);
			
			int num2 = rd.nextInt(10)+1;
			System.out.println("�ι�° ������ : " + num2);
			
			int num3 = rd.nextInt(10)+1;	
				if(num1+num2 == num3) {
				System.out.println(num3 + " Success �����Դϴ�. "
						+ "���α׷��� �����մϴ�");
				break;
			
				}else {
					System.out.println(num3 + " Fail");
					System.out.print( "��� �Ͻðڽ��ϴ� >> (Y/N) ");
					String ans = sc.next();
					if(ans.equals("Y")) {
						continue;
					}else {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
			}
		}

	}
}
