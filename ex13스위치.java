package day02;

import java.util.Scanner;

public class ex13����ġ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		
		int season = sc.nextInt();
		
		String result = "";
		switch(season) {
		case 12:
		case 1:
		case 2:
			result = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			result = "��";
			break;
		case 6:
		case 7:
		case 8:
			result = "����";
			break;
		case 9:
		case 10:
		case 11:
			result = "����";
			break;
		}
		System.out.println(season + "���� " +  result + "�Դϴ�!");
	}

}
