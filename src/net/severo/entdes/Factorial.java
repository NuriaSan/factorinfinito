package net.severo.entdes;
/**
 * 
 * @author Nuria Sánchez
 *
 */
public class Factorial {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = 1;
		String tex = "Value of n: "
		System.out.println(tex + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(tex + result);

	}

}
