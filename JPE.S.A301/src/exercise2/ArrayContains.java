package exercise2;

import java.util.Scanner;

public class ArrayContains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length array : ");
		int n = sc.nextInt();
		String[] stringArray = new String[n];
		for(int i=0;i<stringArray.length;i++) {
			System.out.print("Enter element " + (i+1) + " : ");
			stringArray[i] = sc.next();
			
		}
		String[] sValue = new String[1];
		System.out.print("Enter sValue : ");
		sValue[0] = sc.next(); 
		int x=0;
		for(int i=0 ; i<stringArray.length; i++) {
			if(stringArray[i].equalsIgnoreCase(sValue[0]) == true) {
				x++;
			}
		}
		if(x!=0) {
			System.out.println("Contained!");
		}else {
			System.out.println("No Contain!");
		}
	}
}
