package day04;

import java.util.Scanner;

public class ex10�迭_������ְ����� {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° �Է� >> ");
			arr[i] = sc.nextInt();
		}

		System.out.print("�Էµ� ���� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int max = arr[0];
		int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
				max = arr[i];
			}else {
					min = arr[i];
			}
		}

		System.out.println("�ְ� ���� : " + max);
		System.out.println("���� ���� : " + min);

	}

}
