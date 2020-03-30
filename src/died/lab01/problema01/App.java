/**
 * 
 */
package died.lab01.problema01;

/**
 * @author USUARIO
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(2,2);
		Recta r1 = new Recta(p1,p2);
		System.out.println("La pendiente de R1 es: " + r1.pendiente);
		Punto p3 = new Punto(3,3);
		Recta r2 = new Recta(p2,p3);
		System.out.println(r2.equals(r1));
		
	}

}
