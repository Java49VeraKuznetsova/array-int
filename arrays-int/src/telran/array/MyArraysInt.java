package telran.array;

import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber (int[] array, int num) {
	
		//adds num at the array's end
		//returns new array with added number
		// using standard method Arrays.copyOf
	    int arrayNew [] = new int [array.length+1];
	    arrayNew  = Arrays.copyOf(array, array.length+1);
		arrayNew[array.length]= num;
		
		
		
		return arrayNew;
	}
	public static int[] removeNumber(int [] array, int index) {
		
		// removes element at a given index for right index value
		// and returns new array with no the removed one
		// returns the source array for a wrong index value
		//(less than 0 or greater than array.length-1
		// using the standard method System.arraycopy
		
		/* V.R. May be following will be a little bit better:
		   boolean b=index >=0 && index < array.length;
		 * To analyze the boolean variable is more effecive 
		 * to calculate it.
		*/

		
	    int arrayNew [] = new int [array.length-1];
	    if (index >=0 && index < array.length) {
	    System.arraycopy(array, 0, arrayNew, 0, index);
	    System.arraycopy(array, index+1, arrayNew, index, array.length-index-1);
	    }
	 return (index >=0 && index < array.length) ? arrayNew : array;
	}
	public static int[] insertNumber(int [] array, int index, int num) {
		
		//inserts a given num at a given index for right value of the  index
		// of the right value of the index [0 - array.lenght
		//return the source array for a wrong index value
		// (less than 0 or greater than array.length
		// using the standard method System.arraycopy
		int arrayNew [] = new int [array.length+1];
		if (index >=0 && index <=array.length) {
		System.arraycopy(array, 0, arrayNew, 0, index);
	    arrayNew[index] = num;
	    System.arraycopy(array, index, arrayNew, index+1, array.length-index);
		}
			
		return (index >=0 && index <=array.length) ? arrayNew : array;
			
		}
	
	public static int[] insertNumberSorted(int[] array, int num) {
		int index = Arrays.binarySearch(array, num);
		if (index < 0) {
			index = -index -1;
		}
		return insertNumber(array, index, num);
	}
	
    
	}
/* Yuri's code

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		
		int [] result = Arrays.copyOf(array, array.length + 1);
		result[array.length] = num;
		return result;
	}
	public static int[] removeNumber(int [] array, int index) {
		
		int [] result = array;
		if (index > -1 && index < array.length) {
			result = new int[array.length - 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index + 1, result, index, result.length - index);
		}
		return result;
	}
	public static int[] insertNumber(int [] array, int index, int num) {
		
		int [] result = array;
		if (index > -1 && index <= array.length) {
			result = new int[array.length + 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index, result, index + 1, array.length - index);
			result[index] = num;
		}
		return result;
	}
	
}
*/

