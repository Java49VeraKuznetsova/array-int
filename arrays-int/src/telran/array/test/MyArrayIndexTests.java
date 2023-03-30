package telran.array.test;

import static org.junit.jupiter.api.Assertions.*;

import static telran.array.MyArraysInt.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MyArrayIndexTests {

	@Test
	void testAddNumber() {
		
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3, 345};
		int expected2[] = {1, 2, 3, 345, -215};
		
		assertArrayEquals(expected1, addNumber(array, 345));
		assertArrayEquals(expected2, addNumber(expected1, -215));
	
	}



	@Test
	void testRemoveNumber() {
		int array [] = {1, 2, 3, 345};
		int expected1[] = {1, 3, 345};
		int expected2[] = {2, 3, 345};
		int expected3[] = {1, 2, 3};
		
		assertArrayEquals(expected1, removeNumber(array, 1));
		assertArrayEquals(expected2, removeNumber(array, 0));
		assertArrayEquals(expected3, removeNumber(array, 3));
		assertArrayEquals(array, removeNumber(array,-3));
		assertArrayEquals(array, removeNumber(array, 4));
		 
	}
	@Test
	void testInsertNumber() {
		
		int array [] = {1, 30, 345};
		int expected1[] = {1, 30, -5, 345};
        int expected2[] = {-5, 1, 30, 345};
        int expected3[] = {1, 30, 345, -5};
                
        assertArrayEquals(expected1, insertNumber(array, 2, -5));
		assertArrayEquals(expected2, insertNumber(array, 0, -5));
		assertArrayEquals(expected3, insertNumber(array, 3, -5));
		assertArrayEquals(array, insertNumber(array, 4, -5));
		assertArrayEquals(array, insertNumber(array, -1, -5));
		
		
	}
	@Test
	void testCopyOf() {
		 int array[] = {1, 2, 3};
		 int expected1[] = {1, 2, 3};
		 int expected2[] = {1};
		 int expected3[] = {1, 2, 3, 0, 0, 0};
		 assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
	     assertArrayEquals(expected2, Arrays.copyOf(array, 1));
	     assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}
	@Test
	void testArraycopy() {
		int array[] = {1, 2, 3};
		int expected[] = {5, 10, 1, 2, 20};
		int arrayDest[] = new int[5];
		int array1[]= {2, 5, 10};
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		arrayDest[4] = 20;
		assertArrayEquals(expected, arrayDest);
	}
@Test
void testBinarySearchInt() {
	//Arrays.binarySearch(int array, int number)
		//Write tests for standart ethod binarySearch of the class Arrays 
	// taking array of ints and int number
	int array[] = {-4, -2, 5, 8, 345};
	assertEquals(0, Arrays.binarySearch(array, -4));  
	assertEquals(2, Arrays.binarySearch(array, 5));
	assertEquals(4, Arrays.binarySearch(array, 345));
	assertEquals(-1, Arrays.binarySearch(array, -7));
	assertEquals(-5, Arrays.binarySearch(array, 100));
	assertEquals(-6, Arrays.binarySearch(array, 350));
	//if key != int, than Exception
	
}
}
/* Yuri's tests
 * import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.binarySearch;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static telran.arrays.MyArraysInt.*
 
  int [] array = {10, 20, 30, 40, 100};
	@Test
	void testAddNumber() {
		int [] expected = {10, 20, 30, 40, 100, -1};
		assertArrayEquals(expected, addNumber(array, -1));
	}

	@Test
	void testRemoveNumber() {
		int [] expNo10 = {20, 30, 40, 100};
		int [] expNo100 = {10, 20, 30, 40};
		int [] expNo30 = {10, 20, 40, 100};
		assertArrayEquals(expNo10, removeNumber(array, 0));
		assertArrayEquals(expNo100, removeNumber(array, 4));
		assertArrayEquals(expNo30, removeNumber(array, 2));
		assertArrayEquals(array, removeNumber(array, -2));
		assertArrayEquals(array, removeNumber(array, 5));
	}

	@Test
	void testInsertNumber() {
		int [] expInd0_1000 = {1000, 10, 20, 30, 40, 100};
		int [] expInd5_1000 = {10, 20, 30, 40, 100, 1000};
		int [] expInd2_1000 = {10, 20,  1000, 30, 40, 100};
		assertArrayEquals(expInd0_1000, insertNumber(array, 0, 1000));
		assertArrayEquals(expInd5_1000, insertNumber(array, 5, 1000));
		assertArrayEquals(expInd2_1000, insertNumber(array, 2, 1000));
		assertArrayEquals(array, insertNumber(array, -2, 1000));
		assertArrayEquals(array, insertNumber(array, 6, 1000));
	}
 * @Test
	void testBinarySearchInt() {
		assertEquals(0, binarySearch(array, 10));
		assertEquals(-1, binarySearch(array, 5));
		assertEquals(2, binarySearch(array, 30));
		assertEquals(-3, binarySearch(array, 25));
		assertEquals(4, binarySearch(array, 100));
		assertEquals(-6, binarySearch(array, 150));
		
	}
 * 
*/