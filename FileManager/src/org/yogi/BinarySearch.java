package org.yogi;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int i,n,SearchValue, index;
		int a[]=new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		System.out.println("Enter the number of elements");
		for(i=0;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the search value");
		SearchValue = sc.nextInt();
		index=search(a,n,SearchValue);
		if(index==-1) {
			System.out.println("value "+SearchValue+" not present in the array");
		}else
			System.out.println("Value "+SearchValue+" present at index " + index);
	}
	
	private static int search(int[] a, int n, int searchValue) {
		 int first=0, last=n-1, mid;
		 while(first<=last) {
			 mid=(first+last)/2;
			 if(searchValue<a[mid]) {
				 last=mid-1;
			 }else if(searchValue>a[mid]) {
				 first=mid+1;
			 }else
				 return mid;
		 }
		return -1;
	}
}
