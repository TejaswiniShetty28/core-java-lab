package de.zeroco.employeemanagement;

//import java.util.HashMap;
//import java.util.Map;

public class NumberToWord {
	
//	public static String convertToWord(String number) {
//	    Map<String, String> data = new HashMap<>();
//	    String[] array = 
//	    data.put("1", "one");
//	    data.put("2", "two");
//	    data.put("3", "three");
//	    data.put("4", "four");
//	    data.put("5", "five");
//	    data.put("6", "six");
//	    data.put("7", "seven");
//	    data.put("8", "eight");
//	    data.put("9", "nine");
//	    
//	    return data.get(number); 
//	}
	private static final String[] numbers = { "", " one", " two", " three", " four", " five", " six", " seven",
            " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen" };

    private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
            " seventy", " eighty", " ninety" };

    public static String convertNumber(int number) {
        String word = "";
        if (number == 0) {
            word = "zero";
        } else if (number < 20) {
            word = numbers[number];
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            word = tensNames[tens];
            if (ones > 0) {
                word += numbers[ones];
            }
        } else if (number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            word = numbers[hundreds] + " hundred";
            if (remainder > 0) {
                word += " " + convertTwoDigit(remainder);
            }
        } else if (number < 100000) {
            int thousands = number / 1000;
            int remainder = number % 1000;
            word = convertTwoDigit(thousands) + " thousand";
            if (remainder > 0) {
                word += " " + convertNumber(remainder);
            }
        } else if (number < 10000000) {
            int lakhs = number / 100000;
            int remainder = number % 100000;
            word = convertTwoDigit(lakhs) + " lakh";
            if (remainder > 0) {
                word += " " + convertNumber(remainder);
            }
        } else if (number < 1000000000) {
            int crores = number / 10000000;
            int remainder = number % 10000000;
            word = convertTwoDigit(crores) + " crore";
            if (remainder > 0) {
                word += " " + convertNumber(remainder);
            }
        }
        return word.trim();
    }

    private static String convertTwoDigit(int number) {
        if (number < 20) {
            return numbers[number];
        } else {
            int tens = number / 10;
            int ones = number % 10;
            return tensNames[tens] + (ones > 0 ? numbers[ones] : "");
        }
    }

	public static void main(String[] args) {
		System.out.println("In words: " + convertNumber(999999999));
	}
}
