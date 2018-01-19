import java.util.*;
public class Lab12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] array = {"john", "ahmed", "ghaith", "tyler", "elizabeth"};


		System.out.println("Enter a search phrase.");

		String search = scan.next();
		System.out.println(binarySearch(array, search));


		print(array);
		sortArray(array);
		System.out.println("Enter a search phrase.");

		String search2 = scan.next();
		System.out.println(binarySearch(array, search2));


	} 

	public static void print(String[] array) {
		for(int i = 0; i < array.length; i++){

			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int indexFirst(String array, String search) {
		
		return array.indexOf(search);
	}

	public static boolean checkSortArray(String[] array) {
		boolean flag = true;

		for (int c = 0; c < array.length - 1 && flag == true; c++) {

			if (array[c].compareToIgnoreCase(array[c+1]) < 0) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public static int binarySearch(String[] array, String search) {
		int temp = -1;

		if (checkSortArray(array) && array.length != 0) {
			System.out.print("Array is sorted. Index of search is: ");

			int min = 0;
			int max = array.length -1;

			temp = (min+max)/2;

			if (search.compareToIgnoreCase(array[temp]) >= 0) {
				for (int i = temp; i <= max; i++) {
					if (array[i].equals(search)) {

						return i;
					}							
				}
			} else if (search.compareToIgnoreCase(array[temp]) < 0) {
				for (int i = min; i <= temp; i++) {
					if (array[i].equals(search)) {

						return i;
					}
				}
			} 
		} 
		return -1;
	}

	public static void sortArray(String[] array) {

		boolean flag = true;  // will determine when the sort is finished
		String temp;

		while (flag) {
			flag = false;
			for (int c = 0;  c < array.length - 1;  c++ ) {
				if (array[c].compareToIgnoreCase(array[c+1]) > 0 ) {                                             
					temp = array[c];
					array [c] = array [c+1];     // swap
					array [c+1] = temp; 
					flag = true;
				} 
			}
		}
	}
}
