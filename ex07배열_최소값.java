package day04;

public class ex07�迭_�ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ּҰ� ���ϱ�
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int num = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < num) {
				num = arr[i];
			}

		}
		System.out.println("�ּҰ���" + num);

	}

}
