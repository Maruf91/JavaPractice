package com.java.abdul.bari.learning;

public class ArrayLearning {

	public static void main(String[] args) {
		int arr[]= {3,9,7,8,12,6,15,5,4,10};
		arraySum(arr);
		int largest=maxElement(arr);
		System.out.println("Largest element is: " +largest);
	}
	
	public static void arraySum(int[] arr) {
		
		int sum =0;
		for(int i=0; i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("Sum is: " +sum);
	}

	public static int maxElement(int[] arr) {
		int largestElement = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>largestElement) {
				largestElement = arr[i];
			}
		}
		return largestElement;
	}
}
