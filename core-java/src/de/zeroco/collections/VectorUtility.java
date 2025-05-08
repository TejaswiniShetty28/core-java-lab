package de.zeroco.collections;

import java.util.Vector;

public class VectorUtility {
	
	 public static void addElement(Vector<String> vector, String element) {
	     vector.add(element);
	 }
	 
	 public static void addElementAtIndex(Vector<String> vector, int index, String element) {
	     vector.add(index, element);
	 }

	 public static String getElement(Vector<String> vector, int index) {
	     return vector.get(index);
	 }

	 public static void setElementAtIndex(Vector<String> vector, int index, String element) {
		 vector.set(index, element);
	 }

	 public static void removeElementAtIndex(Vector<String> vector, int index) {
	     vector.remove(index);
	 }

	 public static int getSize(Vector<String> vector) {
	     return vector.size();
	 }

	 public static boolean isEmpty(Vector<String> vector) {
	     return vector.isEmpty();
	 }

   	 public static void clearVector(Vector<String> vector) {
	     vector.clear();
	 }

//	 public static void main(String[] args) {
//	     Vector<String> vector = new Vector<>();
//	     addElement(vector, "Apple");
//	     addElement(vector, "Banana");
//	     addElement(vector, "Cherry");
//	     System.out.println("Vector: " + vector);
//	     System.out.println("Vector size: " + getSize(vector));
//	     System.out.println("Element at index 1: " + getElement(vector, 1));
//	     addElementAtIndex(vector, 1, "Blueberry");
//	     System.out.println("Vector after adding Blueberry at index 1: " + vector);
//	     setElementAtIndex(vector, 2, "Cantaloupe");
//	     System.out.println("Vector after setting index 2 to Cantaloupe: " + vector);
//	     removeElementAtIndex(vector, 0);
//	     System.out.println("Vector after removing element at index 0: " + vector);
//	     System.out.println("Is the Vector empty? " + isEmpty(vector));
//	     clearVector(vector);
//	     System.out.println("Vector after clearing: " + vector);
//	 }
   	 
}
