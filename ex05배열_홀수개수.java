package day04;

public class ex05�迭_Ȧ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭���� �� �ʱ�ȭ
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int cnt = 0;
		// Ȧ�� �� ���
		System.out.print("arr�� ����ִ� Ȧ���� ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				cnt++;
				System.out.print(arr[i] + " " );

			}
		}
		System.out.print("�̸� " + cnt + " �� �Դϴ�.");
		// Ȧ�� ���� ���

	}

}
