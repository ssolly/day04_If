package day04_If;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*������ �Է� ������ ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
	       
	       A : 90�� �̻�, B : 80�� �̻�, C : 70�� �̻�, D : 60�� �̻�, F : �� ��
	       �� ��ȿ�� ������ 0~100�� �Դϴ�.
	    */
		
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("���� �Է� : ");
		score=sc.nextInt();
		if (score>0 && score<=100) {
			if (score>=90) {
				System.out.println("A");
			} else if (score>=80) {
				System.out.println("B");
			} else if (score>=70) {
				System.out.println("C");
			} else if (score>=60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("��ȿ���� ���� �����Դϴ�");
		}
		
		/*
		 ������ �Է� �޾� ¦������ Ȧ�� ���� ��� �ϱ�
		 */
		int num;
		System.out.print("���� �Է� : ");
		num=sc.nextInt();
		if (num%2==0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		/*
		 ������� �Է¹޾� ���� �´� ������ ����ϴ� ���α׷� �����
		 */
		int month;
		System.out.print("�� �Է� : ");
		month=sc.nextInt();
		if (month==12||month==1||month==2) {
			System.out.println("�ܿ�");
		} else if (month>=3&&month<6) {
			System.out.println("��");
		} else if (month>=6&&month<9) {
			System.out.println("����");
		} else if (month>=9&&month<12) {
			System.out.println("����");
		} else {
			System.out.println("�߸��� ���Դϴ�");
		}
		
		/*
		 Ű�� ü���� �Է¹ް� bmi�� ȯ���ؼ� 18.5 ���ϴ� ��ü��, 18.5~24.9�� ����, 
		 25�̻��� ������ ��� (bmi ���� : ü��/(Ű*Ű), Ű�� m���� )
		 */
		double height,weight,bmi;
		System.out.print("Ű �Է� : ");
		height=(sc.nextDouble())*0.01;
		System.out.print("������ �Է� : ");
		weight=sc.nextDouble();
		
		bmi=weight/(height*height);
		
		if (bmi>=25) {
			System.out.printf("bmi %.2f : ��\n",bmi);
		} else if (bmi>=18.5&&bmi<25) {
			System.out.printf("bmi %.2f : ����\n",bmi);
		} else {
			System.out.printf("bmi %.2f : ��ü��\n",bmi);
		}
		
		/*
		 ���̸� �Է¹ް� 8������� 1000��, 14������� 1500��, 17������� 3000��, 
		 �������� 5000���� ������ ����Ͻÿ�.
		 */
		int age;
		System.out.print("���� �Է� : ");
		age=sc.nextInt();
		if (age<=8) {
			System.out.println("1000��");
		} else if (age<=14) {
			System.out.println("1500��");
		} else if (age<=17) {
			System.out.println("3000��");
		} else {
			System.out.println("5000��");
		}
		
	}
}
