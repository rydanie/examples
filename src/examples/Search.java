package examples;

public class Search {

	public static int binarySearch(int[] array, int value) {
		// TODO Auto-generated method stub

		int first, last, middle, position;
		boolean found;
		
		//set initial values
		first = 0;
		last = array.length - 1;
		position = -1;
		found =false;
		
		//search for the value
		
	while(!found && first<= last){
		//Calculate midpoint
		middle = (first + last)/2;
		//if value is found at midpoint
		if(array[middle]== value){
			found = true;
			position = middle;
		}
		
		//else if value is in the lower half
		else if (array[middle] > value){
			last = middle -1;
		} 
		//else if the value is in upper half
		else{
			first = middle +1;
		}
		
		//return position of the item, or -1 if it was not found
		}
	
		
		return position;
	}

}
