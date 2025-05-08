package de.zeroco.collections;

import java.io.Serializable;
import de.zeroco.main.Utility;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * This class demonstrates method overriding and custom enhancements to a standard Java collection.
 * 
 * @author Tejaswini.S 
 * @since 28-01-2025
 * @reviewed by Sujwal.B, Naresh.G
 */
public class MyArrayList extends ArrayList<Integer> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int ADD_VALUE = 5;
	
	/**
	 * Adds a number to the list after incrementing it by a predefined constant value.
	 * 
	 * @author Tejaswini.S 
	 * @since 28-01-2025
	 * @param number
	 * @return true if the element is successfully added to the list
	 * @reviewed by Sujwal.B, Naresh.G
	 * 
	 */
	@Override
	public boolean add(Integer number) {
		if (Utility.isBlank(number)) return false;
        number = number + ADD_VALUE;
        return super.add(number);
    }
	
	/**
	 * Retrieves the element at the previous index of the specified position in the list.
	 * 
	 * @author Tejaswini.S 
	 * @since 28-01-2025
	 * @param index
	 * @return the element at the previous index
	 * @reviewed by Sujwal.B, Naresh.G
	 */
	@Override
    public Integer get(int index) {
        if (index <= 0 || index > this.size()) return 0;
        return super.get(index - 1); 
    }
	
	/**
	 * Removes the element at the position next to the specified index in the list.
	 * 
	 * @author Tejaswini.S 
	 * @since 28-01-2025
	 * @param index
	 * @return the removed element at the next index
	 * @reviewed by Sujwal.B, Naresh.G
	 */
	@Override
	public Integer remove(int index) {
	    if (index < -1 ||index >= this.size() - 1) return 0;
	    return super.remove(index + 1);
	}
	
	/**
	 * Adds all elements from the specified collection to the list in reverse order.
	 * 
	 * @author Tejaswini.S 
	 * @since 28-01-2025
	 * @param collection 
	 * @return true if the list is successfully modified otherwise false.
	 * @reviewed by Sujwal.B, Naresh.G
	 */
	@Override
	public boolean addAll(Collection<? extends Integer> collection) {
		if (Utility.isBlank(collection)) return false;
	    List<Integer> list = new ArrayList<>(collection);
	    for (int i = list.size() - 1; i >= 0; i--) {
	    	super.add(list.get(i));
	    }
	    return true;
	}
	
}
