package day04_If;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		/*점수를 입력 받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.
	       
	       A : 90점 이상, B : 80점 이상, C : 70점 이상, D : 60점 이상, F : 그 외
	       ※ 유효한 점수는 0~100점 입니다.
	    */
		
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수 입력 : ");
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
			System.out.println("유효하지 않은 점수입니다");
		}
		
		/*
		 정수를 입력 받아 짝수인지 홀수 인지 출력 하기
		 */
		int num;
		System.out.print("정수 입력 : ");
		num=sc.nextInt();
		if (num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		/*
		 몇월인지 입력받아 월에 맞는 계절을 출력하는 프로그램 만들기
		 */
		int month;
		System.out.print("월 입력 : ");
		month=sc.nextInt();
		if (month==12||month==1||month==2) {
			System.out.println("겨울");
		} else if (month>=3&&month<6) {
			System.out.println("봄");
		} else if (month>=6&&month<9) {
			System.out.println("여름");
		} else if (month>=9&&month<12) {
			System.out.println("가을");
		} else {
			System.out.println("잘못된 월입니다");
		}
		
		/*
		 키와 체중을 입력받고 bmi로 환산해서 18.5 이하는 저체중, 18.5~24.9는 정상, 
		 25이상은 비만으로 출력 (bmi 계산법 : 체중/(키*키), 키는 m기준 )
		 */
		double height,weight,bmi;
		System.out.print("키 입력 : ");
		height=(sc.nextDouble())*0.01;
		System.out.print("몸무게 입력 : ");
		weight=sc.nextDouble();
		
		bmi=weight/(height*height);
		
		if (bmi>=25) {
			System.out.printf("bmi %.2f : 비만\n",bmi);
		} else if (bmi>=18.5&&bmi<25) {
			System.out.printf("bmi %.2f : 정상\n",bmi);
		} else {
			System.out.printf("bmi %.2f : 저체중\n",bmi);
		}
		
		/*
		 나이를 입력받고 8살까지는 1000원, 14살까지는 1500원, 17살까지는 3000원, 
		 나머지는 5000원이 나오게 출력하시오.
		 */
		int age;
		System.out.print("나이 입력 : ");
		age=sc.nextInt();
		if (age<=8) {
			System.out.println("1000원");
		} else if (age<=14) {
			System.out.println("1500원");
		} else if (age<=17) {
			System.out.println("3000원");
		} else {
			System.out.println("5000원");
		}
		
	}
}
