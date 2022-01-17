/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan sedan = new Sedan(200,100000,"red",23);
		Ford ford = new Ford(190,90000,"Pink",2019,1000);
		Car car = new Car(280,200000,"Green");
		System.out.println(sedan.toString());
		System.out.println(ford.toString());
		System.out.println(car.toString());
	}

}
