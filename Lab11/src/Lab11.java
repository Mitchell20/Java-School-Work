import java.util.*;
public class Lab11 {
static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {

	int[] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	//Proving all methods work
	
	print(array);	//Printing default array

	addElem(array, 6);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);
	addElem(array, 5);	
	addElem(array, 5);	//12th element results in "Array is full"

	delete(array, 6);	//Setting index 6 element equal to -1
	
	insert(array, 5,5);	//inserting 5 for index 5
	
	int temp = 0;
	
	//Creating 2D array
	
	int [][] array2 = new int [10][10];
	
	for (int i = temp; i < 10; i++) {
		int count = 0;
		for (int j = count; j < 10; j++) {
			
			array2[i][j] = (int)(Math.random()*10);
			count ++;
		}
		temp ++;
	}
	printTwoD(array2);	//Printing 2d array
}

	public static void print(int[] array) {
		System.out.println("Updated Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void addElem(int[] array, int element) {
		boolean check = true;
		
		for (int i = 0; i < array.length && check == true; i++) {
			if (array [i] == -1) { 
				array [i] = element;
				check = false;
			} else if (i == array.length - 1) {
				System.out.println("Array is full.");
			}
		}
		print(array);
	}
	
	public static void insert(int[] array, int element, int index) {
		if (index >= array.length) {
			System.out.println("Not a valid index.");
		} else {
			array[index] = element;
		}
		print(array);
	}
	
	public static void delete(int[] array, int index) {
		if (index >= array.length) {
			System.out.println("Not a valid index.");
		} else {
			array[index] = -1;
		}
		print(array);
	}
	//2D array print method
	
	public static void printTwoD(int [][] array) {
		for(int i = 0; i < 10; i++){
		    for(int j = 0; j < 10; j++) {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}

	
	

