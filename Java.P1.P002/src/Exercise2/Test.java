/*
 *
 *
 * @author PhongLe
 * @date Jan 20, 2022
*/
package Exercise2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("===== Shopping program =====");
		Person person = new Person();
		Wallet wall = new Wallet();
		int n,wallet;
		System.out.print("input number of bill:");
		n = sc.nextInt();
		int[] bills = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("input value of bill "+(i+1)+": ");
			bills[i] = sc.nextInt();
		}
		System.out.print("input value of wallet: ");
		wallet = sc.nextInt();
		wall.setWallet(wallet);
		if(wall.payMoney(person.calcTotal(bills))) {
			System.out.println("this is total of bill: "+person.calcTotal(bills));
			System.out.println("You can buy it.");
		}else {
			System.out.println("this is total of bill: "+person.calcTotal(bills));
			System.out.println("You can't buy it.");
		}
	}
}
