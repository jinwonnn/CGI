package day04;

import java.util.Scanner;

public class ex11�迭_���ڿ�Ÿ�Թ迭 {

	public static void main(String[] args) {
		// ���ڿ� Ÿ���� �迭 ����!
		Scanner sc = new Scanner(System.in);

		char[] game = { '��', '��' };

		System.out.println("==== ���� ���� Start! =====");
		// �迭�� �������
		// 1. �迭���� �� (ũ��) -> �� ����
		// 2. �迭�� ����� ���ÿ� �� ����
		// ���ڸ� �Է¹��� �� �ִ� ���
		System.out.print("���ڸ� �Է����ּ��� >> ");
		int num = sc.nextInt();
		// �Է¹��� ���ڰ� ¦��, Ȧ�� �Ǵ�
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				
				System.out.print(game[0]);
			}else {
				System.out.print(game[1]);
			}

				// '��' , '��' ���!
			}

		}
	}
