/*
 *
 *
 * @author PhongLe
 * @date Jan 20, 2022
*/
package Exercise1;


public class Test {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Circle ci = new Circle();
		Triangle tri = new Triangle();
		System.out.println("=====Calculator Shape Progamer=====");
		rec.input();
		ci.input();
		tri.input();
		rec.printResult();
		ci.printResult();
		tri.printResult();
	}

}
