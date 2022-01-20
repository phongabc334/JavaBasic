/*
 *
 *
 * @author PhongLe
 * @date Jan 20, 2022
*/
package Exercise2;

public class Person {
	public Person() {
		
	}
	
	public int calcTotal (int[] bills) {
		int s = 0;
		for(int i=0;i<bills.length;i++) {
			s += bills[i];
		}
		return s;
	}
}
