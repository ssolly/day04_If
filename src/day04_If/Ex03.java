package day04_If;

import java.util.Scanner;

public class Ex03 {

	/*
	  -����
	   if(����) {
	   } else if(����) {
	   } else if(����) {
	   } else {
	   }
	  - ���ǽ��� ���� �� ���� ���� ��
	  - if, else�� ���������� ���ǽĵ� �� ���� ���� �ϳ��� ����
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("�� �Է� : ");
		num=sc.nextInt();
		
		if (num>100) {
			System.out.println(num+" : 100���� ũ��");
		} else if (num>50) {
			System.out.println(num+" : 50���� ũ��");
		} else {
			System.out.println(num + " : 50���� ���� ����");
		}
		System.out.println("���� ����� ����");
	}
}
