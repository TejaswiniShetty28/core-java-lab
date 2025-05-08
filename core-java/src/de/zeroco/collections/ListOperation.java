package de.zeroco.collections;

import java.util.ArrayList;
import java.util.List;
import de.zeroco.main.Utility;

/**
 * A class that provides various list operations including rearranging elements based on odd/even numbers,
 * splitting and sorting the list, and generating geometric progressions. This class extends ArrayList and
 * implements Serializable to allow it to be serialized if needed.
 * 
 * @author Tejaswini.S 
 * @since 29-01-2025
 * @reviewed by Naresh.G
 */
public class ListOperation {
	
	/**
	 * Rearranges the elements of the input list such that odd numbers are placed at even indices 
     * and even numbers are placed at odd indices.
	 * 
	 * @author Tejaswini.S 
	 * @since 29-01-2025
	 * @param list 
	 * @return A new list where odd numbers are placed at even indices and even numbers are placed at odd indices.
	 * @reviewed by Naresh.G
	 */
	public static List<Integer> arrangeOddEvenByIndex(List<Integer> list) {
	    if (list == null) return new ArrayList<>(); 
	    List<Integer> oddNumbers = new ArrayList<>();
	    List<Integer> evenNumbers = new ArrayList<>();
	    List<Integer> newList = new ArrayList<>();
	    for (Integer number : list) {
	        if (number == null) continue;
	        if (number % 2 == 0) {
	            evenNumbers.add(number);
	        } else {
	            oddNumbers.add(number);
	        }
	    }
	    int oddNumberIndex = 0;
	    int evenNumberIndex = 0;
	    int size = oddNumbers.size();
	    int length = evenNumbers.size();
	    while (oddNumberIndex < size || evenNumberIndex < length) {
	        newList.add(oddNumberIndex < size ? oddNumbers.get(oddNumberIndex++) : null);
	        newList.add(evenNumberIndex < length ? evenNumbers.get(evenNumberIndex++) : null);
	    }
	    
	    return newList;
	}

	/**
	 * Splits the input list into two halves, sorts the first half in descending order and the second half in ascending order.
	 * 
	 * @author Tejaswini.S 
	 * @since 29-01-2025
	 * @param list 
	 * @return The same list with the first half sorted in descending order and the second half sorted in ascending order.
	 * @reviewed by Naresh.G
	 */
	public static List<Integer> splitAndArrange(List<Integer> list) {
	    if (list == null) return new ArrayList<>();
	    List<Integer> newList = new ArrayList<>();
	    for (Integer number : list) {
	        if (number != null) {
	            newList.add(number);
	        }
	    }
	    int size = newList.size();
	    if (size == 0 || size % 2 != 0) throw new IllegalArgumentException("Provide Even Value Index");
	    int mid = size / 2;
	    for (int i = 0; i < mid - 1; i++) {
	        for (int j = 0; j < mid - i - 1; j++) {
	            if (newList.get(j) < newList.get(j + 1)) {
	                swap(newList, j, j + 1);
	            }
	        }
	    }
	    for (int i = mid; i < size - 1; i++) {
	        for (int j = mid; j < size - (i - mid) - 1; j++) {
	            if (newList.get(j) > newList.get(j + 1)) {
	                swap(newList, j, j + 1);
	            }
	        }
	    }
	    return newList;
	}

	/**
	 * Swaps the elements at the specified indices in the list.
	 * 
	 * @author Tejaswini.S 
	 * @since 29-01-2025
	 * @param list 
	 * @param integer i
	 * @param integer j
	 * @return void
	 * @reviewed by Naresh.G
	 */
	public static void swap(List<Integer> list, int i, int j) {
	    int temp = list.get(i);
	    list.set(i, list.get(j));
	    list.set(j, temp);
	}
	
	/**
	 * Generates a list of numbers where elements at even indices are powers of the first number 
     * and elements at odd indices are powers of the second number, up to the specified size.
	 * 
	 * @author Tejaswini.S 
	 * @since 29-01-2025
	 * @param list 
	 * @param firstNumber
	 * @param secondNumber
	 * @param size
	 * @return A list of integers where elements at even indices are powers of the first number and elements at odd indices are powers of the second number.
	 * @reviewed by Naresh.G
	 */
	public static List<Integer> geometricProgression(Integer firstNumber, Integer secondNumber, Integer size) {
		if (areAnyBlank(firstNumber, secondNumber, size)) return new ArrayList<>(); 
		List<Integer> newList = new ArrayList<Integer>();
		int resultOne = 1;
		int resultTwo = 1;
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				resultOne = resultOne * firstNumber;
				newList.add(resultOne);
			} else {
				resultTwo = resultTwo * secondNumber;
				newList.add(resultTwo);
			}
		}
		return newList;
	}
	
	public static boolean areAnyBlank(Object... args) { 
        for (Object arg : args) {
            if (Utility.isBlank(arg)) return true;
        }
        return false;
    }
	
}
