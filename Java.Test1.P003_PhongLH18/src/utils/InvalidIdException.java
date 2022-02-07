/*
 *
 *
 * @author PhongLe
 * @date Jan 26, 2022
*/
package utils;

public class InvalidIdException extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidIdException() {
		super();
	}

	public InvalidIdException(String message) {
		super(message);
	}
}
