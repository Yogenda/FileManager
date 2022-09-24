package org.yogi;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int i, n;
		int[] a = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.println("Enter the element " + (i + 1) + ":");
			a[i] = sc.nextInt();
		}
		sort(a, n);
		System.out.println("The Sorted array is");
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

	private static void sort(int[] a, int n) {
		int x, j, temp, swap;
		for (x = n - 2; x >= 0; x--) {
			swap = 0;
			for (j = 0; j <= x; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swap++;

				}
			}
			if(swap == 0) {
				break;
			}
		}
	}

}
