package day04_If;

import java.util.Scanner;

public class Ex01 {

	/*
 	 # if ���ǽ�
 	  - if ���ǽ� : ���� ��� ���ӹ��� ����
 	  - else : if ������ �����̸� ������ ���ӹ��� ����
 	  - else�� if�� ���ӹ��� ������ ���ְ� ���;� ������ ������ ����
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num=sc.nextInt();
		if (num%3==0) {
			System.out.println(num+"�� 3�� ���");
		} else {
			System.out.println(num+"�� 3�� ��� �ƴ�");
		}
		System.out.println("���� ����� ����");
	}
}
