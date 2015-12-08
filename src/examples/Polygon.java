package examples;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author Ryley
 *
 */
public class Polygon {

	private int [] pointX;
	private int [] pointY;
	private int numPoints;
	
	/**
	 * Build empty polygon
	 */
	public Polygon(){
		numPoints = 0;
	}

	/**
	 * Build a polygon with a specified number of vertices
	 */
		
	public Polygon(int p){
		
		 pointX = new int[p];
		 pointY = new int[p];
		 numPoints = 0;
	}
	
	public void addPoint(int x, int y){
	
			// we need to do something special
			if(checkBounds()){
				pointX[numPoints] = x;
				pointY[numPoints] = y;
				numPoints++;
			}
		
		
		
	}
	
	public int getX(int i){
		return pointX[i];
	}
	
	public int getY(int i){
		return pointY[i];
	}
	
	public int getNumPoints(){
		return numPoints;
	}
	
	private boolean checkBounds(){
		if(numPoints >= pointX.length){
			int[] ptXTmp = new int[numPoints + 5];
			int[] ptYTmp = new int[numPoints + 5];
			ptXTmp = Arrays.copyOf(pointY, ptXTmp.length);
			ptXTmp = Arrays.copyOf(pointY, ptYTmp.length);
			pointX = ptXTmp;
			pointY = ptYTmp;
			System.out.println("New array " + pointX.length);
		}
		return true;
	}
}
