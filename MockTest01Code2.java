//Write a java program to print the Fibonacci series up to a given number using for loop

package in.ineuron.com;

import java.util.Scanner;

public class MockTest01Code2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		int next;
		if (n == 1)
			System.out.println(first);
		if (n == 2) {
			System.out.println(first);
			System.out.println(second);
		}
		else if(n>2)
		{
			System.out.println(first);
			System.out.println(second);
		for (int i = 2; i <= n; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.println(second);
		}
		}
	}

}

