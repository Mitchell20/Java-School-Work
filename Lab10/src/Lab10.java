import java.util.*;
public class Lab10
{
 public static void main(String[] args) {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 int[] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	 int i;
	 
	 for (i = 0; i < array.length; i++ ) {
	 System.out.println("The value of element " + i + " in your array is: " + array[i]);
	 }
	 
	 System.out.println("Enter positive values to add to the array.");
	 
	 int posVal = scan.nextInt();
	 
	
	 for (int j = 0; j < array.length && posVal > 0; j++ ) {
		 if (array[j] == -1) {
			 array[j] = posVal;
		 }
		 for (int k = 0; k < array.length; k++ ) {
			 System.out.print(" " + array[k] + " ");
			 }
		 
		 posVal = scan.nextInt();
	}
	 System.out.println("First enter a new value, then enter the index for the value.\nEnter -1 for your value to exit.");
	 
	 boolean exit = true;
	 int newVal = scan.nextInt();
	 
	 if (newVal == -1) {
		 exit = false;
	 }
	 int index = scan.nextInt();
	 
	 while (exit) {
		 		 
		 if (index >= array.length && exit == true) {
			 System.out.println("The array is only " + array.length + " elements long.\nTry again.");
		 	 newVal = scan.nextInt();
		 	 
		 if (newVal == -1) {
			 exit = false;
		 }
		 index = scan.nextInt();
		 }
		 
		 while (index < array.length && exit == true) {
		 array[index] = newVal;
		 
		  for (int k = 0; k < array.length; k++ ) {
			 System.out.print(" " + array[k] + " ");
		 }
		  newVal = scan.nextInt();
		  if (newVal == -1) {
				 exit = false;
			 }
		  index = scan.nextInt();
		  
	 }
		 
		}
	 System.out.println("Enter the index of the value you wish to delete.\nEnter -1 to terminate.");
	 int delAtIndex = scan.nextInt();
	 
	 exit = true;
	 while(exit) {
		 
		 if (delAtIndex >= array.length && exit == true) {
			 System.out.println("The array is only " + array.length + " elements long.\nTry again.");
			 
			 delAtIndex = scan.nextInt();
			 if (delAtIndex == -1) {
				 exit = false;
			 }
			 }
	 while (delAtIndex < array.length && exit == true) {
		 array[delAtIndex] = -1;
		 
		  for (int k = 0; k < array.length; k++ ) {
			 System.out.print(" " + array[k] + " ");
		 }
		  delAtIndex = scan.nextInt();
		  if (delAtIndex == -1) {
				 exit = false;
			 }
		 }
	 }
	 System.out.println("Thanks for playing with arrays.");
	 
 }
	 
}