package exercise4;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
        System.out.print("Enter length array : ");
        int n = sc.nextInt();
        int[] myintArray = new int[n];
        for(int i=0;i<myintArray.length;i++) {
    		System.out.print("Enter intArray["+i+"] = ");
        	myintArray[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        for(int i=0; i<myintArray.length;i++) {
        	System.out.print(myintArray[i]);
        	if(i!=(myintArray.length-1)) {
        		System.out.print(", ");
        	}
        }
        System.out.println("");
        for(int i=0, j=myintArray.length-1; i<j; i++, j--) {
        	int temp = myintArray[i];
        	myintArray[i]  = myintArray[j];
        	myintArray[j] = temp;
        }
        System.out.print("Reversed Array: ");
        for(int i=0; i<myintArray.length;i++) {
        	System.out.print(myintArray[i]);
        	if(i!=(myintArray.length-1)) {
        		System.out.print(", ");
        	}
        }
	}
}
