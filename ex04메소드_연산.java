package day05;

public class ex04�޼ҵ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(3,5);
		
		
		sub(3,5);
		
		
		mul(3,5);
		
		
		div(3,5);
		
				
	}
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void sub(int num1, int num2) {
		System.out.println(num1 > num2 ? num1 - num2 : num2 - num1); //ū ������ ������ ����
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);



	}
}

