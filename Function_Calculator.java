package com.basic;

import java.util.Scanner;

public class Function_Calculator {

	public static void main(String[] args) {
		int num1, num2, result;
		num1 = num2 = result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter num1");
		num1 = sc.nextInt();

		System.out.println("enter num2");
		num2 = sc.nextInt();

		System.out.println("The menu is: \n 1.add \n 2.subtract \n 3.multiply \n 4.divide \n 5.exit");
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			result = add(num1, num2);
			System.out.println("result is " + result);
			break;
		case 2:
			result = sub(num1, num2);
			System.out.println("result is " + result);
			break;
		case 3:
			result = mul(num1, num2);
			System.out.println("result is " + result);
			break;
		case 4:
			result = div(num1, num2);
			System.out.println("result is " + result);
			break;
		default:
			System.out.println("not in the menu");
			break;
		}

	}

	static int add(int no1, int no2) {
		return no1 + no2;
	}

	static int sub(int no1, int no2) {
		return no1 - no2;
	}

	static int mul(int no1, int no2) {
		return no1 * no2;
	}

	static int div(int no1, int no2) {
		return no1 / no2;
	}

}
