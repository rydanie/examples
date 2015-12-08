package examples;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author SJHSStudent
 *
 */
public class PolygonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Polygon p;
		Scanner in = new Scanner(System.in);
		int input = 0;
		int x,y;
		
		System.out.println("Welcome to the polygon test. Woot woot.");
		System.out.println("Number of points?");
		input = in.nextInt();
		
		// create new polygon with specified size
		p = new Polygon(input);
		
		for( int i = 0; i< input +8; i++){
			System.out.print("X #" + i);
			x = in.nextInt();
			System.out.print("Y #" + i);
			y = in.nextInt();
			p.addPoint(x,y);	
		}
		
		for(int i = 0; i < p.getNumPoints(); i++){
			x = p.getX(i);
			y = p.getY(i);
			System.out.printf("Point #%d: (%d, %d)\n", (i+1), x, y);
		}
	}

}
