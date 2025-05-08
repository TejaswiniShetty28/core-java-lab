package de.zeroco.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtility {

    public static List<String> addAllElements(List<String> list, List<String> secondList) {
    	list.addAll(secondList);
    	return list;
    }

    public static List<String> removeElements(List<String> list, String element) {
        list.remove(element);
        return list;
    }
    
    public static List<String> getElement(List<String> list, int number) {
    	list.get(number);
    	return list;
    }
    
    public static List<String> setElement(List<String> list, int number, String element) {
    	list.set(number, element);
    	return list;
    }

    public static List<String> createSubList(List<String> list, int fromIndex, int toIndex) {
        return new ArrayList<>(list.subList(fromIndex, toIndex));
    }
    
    public static List<String> clearElements(List<String> list) {
    	list.clear();
    	return list;
    }
    
    public static List<String> retainAllElements(List<String> list, List<String> secondList) {
    	list.retainAll(secondList);
    	return list;
    }

    public static int checkSize(List<String> list) {
    	return list.size();
    }
    
    public static boolean isEmpty(List<String> list) {
    	return list.isEmpty();
    }
    
    public static LinkedList<String> createList(LinkedList<String> fifthList, String element) {
    	fifthList.add(element);
    	return fifthList;
    }
    
    public static LinkedList<String> setElementAtStart(LinkedList<String> fifthList, String element) {
    	fifthList.addFirst(element);
    	return fifthList;
    }
    
    public static LinkedList<String> setElementAtLast(LinkedList<String> fifthList, String element) {
    	fifthList.addLast(element);
    	return fifthList;
    }
    
    public static LinkedList<String> removeFirstElement(LinkedList<String> fifthList) {
    	fifthList.removeFirst();
    	return fifthList;
    }
    
    public static LinkedList<String> removeLastElement(LinkedList<String> fifthList) {
    	fifthList.removeLast();
    	return fifthList;
    }
    
    public static LinkedList<String> getFirstElement(LinkedList<String> fifthList) {
    	fifthList.peek();
    	return fifthList;
    }
    
    public static LinkedList<String> showAndDeleteFirstElement(LinkedList<String> fifthList) {
    	fifthList.poll();
    	return fifthList;
    }
    
}
