package day05;

public class ex01�޼ҵ�_�Ű����� {

	public static void main(String[] args) {
	
		// �޼ҵ� ȣ���ϱ�
		int result =addNumber(2, 3);
		System.out.println(result);
		
		//������ ������� �ʰ� �޼ҵ� ����� Ȯ���ϱ�
		System.out.println(addNumber(1,9));
	}

		// �޼ҵ� �����ϱ�
		// : Ŭ������ �������� �ٸ� �޼ҵ�� ��ġ�� �ȵȴ�.
		// : ���θ޼ҵ� �Ʒ����� ���Ӱ� ����!
		
		// �޼ҵ��� ����
		// 1. ���������� - public ( Ŭ������ ����/�ܺ� ���� ������ ����)
		// 2. ����Ÿ�� : �޼ҵ尡 ȣ��ǰ� �� ���� ������� ���� Ÿ��
		//    - int, String, Char.. -> �޼ҵ� ���� return Ű���� ���!
		//    - Ÿ���� ���� ��� -> void
		// 3. �޼ҵ��� �̸�
		// 4. �޼ҵ� ������ ���� ���� ���� -> �޼ҵ忡 ���� �Է� ��(x��) -> �Ű����� ��� �Ҹ�
		
	// �Ű����� O , ����Ÿ�� O > �޼ҵ�
	public static int addNumber(int num1, int num2) {
		int result = num1 + num2 ;
		
		return result;
	}
		
		
		
		
		
		
		
	

}
