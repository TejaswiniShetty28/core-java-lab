package de.zeroco.collections;

import java.util.Set;

public class SetUtility {
	
	public void addElement(Set<Integer> set, Integer input) {
			set.add(input);
	}
	
	public int checkSize(Set<Integer> set) {
		return set.size();
	}
	
	public boolean hasElement(Set<Integer> set, Integer input) {
		return set.contains(input);
	}
	
	public void removeElement(Set<Integer> set, Integer input) {
		set.remove(input);
	}
	
	public void clearSet(Set<Integer> set) {
		set.clear();
	}
	
	public Object[] toArray(Set<Integer> set) {
		Object[] array = set.toArray();
		return array;
	}
	
	public <T> boolean hasElement(Set<T> set, T input) {
        return set.contains(input);
    }
	
	public <T> void addElement(Set<T> set, T input) {
        set.add(input);
    }
	
	public void addHeterogeneousElement(Set<Object> set, Object input) {
        set.add(input);
    }
	
}
