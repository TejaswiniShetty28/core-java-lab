package de.zeroco.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The SetOperation class provides utility methods for performing 
 * set operations on lists, such as union and intersection.
 * 
 * @author Tejaswini.S 
 * @since 06-02-2025
 * @reviewed 
 */
public class SetOperation {
	
	/**
	 * Computes the union of two lists by combining their unique elements into a set.
	 * 
	 * @author Tejaswini.S 
	 * @since 06-02-2025
	 * @param listOne
	 * @param listTwo
	 * @return A set containing the unique elements from both lists.
	 * @reviewed 
	 */
	public static Set<Integer> union(List<Integer> listOne, List<Integer> listTwo) {
		if (listOne == null || listTwo == null) return new HashSet<Integer>();
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(listOne);
		union.addAll(listTwo);
		return union;
	}
	
	/**
	 * This method gives intersection of two lists by finding the common elements.
	 * 
	 * @author Tejaswini.S 
	 * @since 06-02-2025
	 * @param listOne
	 * @param listTwo
	 * @return A set containing elements that are present in both lists.
	 * @reviewed 
	 */
	public static Set<Integer> intersection(List<Integer> listOne, List<Integer> listTwo) {
		if (listOne == null || listTwo == null) return new HashSet<Integer>();
		Set<Integer> uniqueSet = new HashSet<>(listOne);
        Set<Integer> duplicateSet = new HashSet<>();
        for (Integer number : listTwo) {
        	if (!uniqueSet.add(number)) {
        		duplicateSet.add(number);
        	}
        }
        return duplicateSet;
	}
	
//	public static void main(String[] args) {
//		List<Integer> listOne = new ArrayList<Integer>(Arrays.asList());
//		List<Integer> listTwo = new ArrayList<Integer>(Arrays.asList());
//        System.out.println(union(null, listTwo));
//		System.out.println(intersection(listOne, listTwo));
//	}
}
