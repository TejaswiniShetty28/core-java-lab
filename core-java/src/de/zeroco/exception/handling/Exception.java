//package de.zeroco.exception.handling;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Exception {
//	
//    public static String readFile() throws IOException {
//        FileReader reader = new FileReader("nonexistentfile.txt");
//        return new BufferedReader(reader).readLine();
//    }
//    
//    public static int division(int firstNumber, int secondNumber) {
//        return firstNumber / secondNumber;
//    }
//    
//    public static char getChar(String input, int index) {
//        return input.charAt(index);
//    }
//    
//    public static int getElement(int[] array, int index) {
//        return array[index];
//    }
//    
//    public static String castingObj() throws ClassCastException {
//            Object obj = new Integer(10);
//            String str = (String) obj; 
//            return str;
//    }
//    
//    public static void main(String[] args) {
//        try {
//            String content = readFile();
//            System.out.println("File content: " + content);
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading the file: " + e.getMessage());
//        }
//        try {
//            division(30, 0);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException occurred: Division by zero is not allowed.");
//        }
//        try {
//            getChar("Hello", 10);
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("StringIndexOutOfBoundsException occurred: Invalid index for string.");
//        }
//        try {
//            getChar(null, 10);
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException occurred: String is null.");
//        }
//        try {
//            getElement(null, 4);
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException occurred: Array is null.");
//        }
//        try {
//        	castingObj();
//        } catch(NullPointerException e) {
//        	System.out.println("Casting to incompactible class");
//        }
//        finally {
//        	System.out.println("it need to be executed definitely");
//        }
//    }
//}
