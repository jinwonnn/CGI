package day05;

public class ex05�޼ҵ�_10�������� {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = -10;
		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

	}

	public static int close10(int num1, int num2) {
//���׿����� ���
//int n1 = num1 > 10 ? num1-10 : 10-num1;
		
//���밪�� ���ϴ� �Լ��� ����ϴ� ��� -> MathŬ���� 
		int n1 = Math.abs(10-num1);
		int n2 = Math.abs(10-num2); 
		
		int result = 0;
		
		if (n1  < n2 ) {
			result = num1;
		

		} else if (n1 > n2) {
			result = num2;
		

			
		} else if (n1 == n2 ) {
			result = 0;
		
		}
		return result;
	}
}