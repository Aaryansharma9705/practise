package practise;

import java.util.Scanner;

public class Prime_Number {

	static boolean isPrime(int a) {
		if (a <= 1) {
			return false;
		}
		int c = 2;
		while (c * c <= a) {
			if (a % c == 0) {
				return false;
			}
			c++;
		}
		return c * c > a;
	}

	static String reverseString(String str) {
		String rstr = "";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			rstr = a + rstr;
		}
		return rstr;
	}

	public static int calculateFactorial(int n) {
		int fact = 1;
		if (n == 0)
			return 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * (i);
		}
		return fact; // Placeholder
	}

	public static int findMax(int[] nums) {
		int max = nums[0];

		for (int number : nums) {
			max = Math.max(max, number);
		}
		return max; // Placeholder return statement
	}

	public static boolean isPalindrome(String str) {
		String str1 = "";
		if (str.contains(",")) {
			String[] strarr = str.split(", ");
			for (String b : strarr) {
				System.out.println(b);
				for (int i = 0; i < b.length(); i++) {
					char c = str.charAt(i);
					str1 = c + str1;
				}
				System.out.println(str1 + " ");
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				char a = str.charAt(i);
				str1 = a + str1;
			}
		}
		System.out.println(str1);
		return str.equals(str1); // Placeholder, replace with actual implementation
	}

	static int n1 = 0, n2 = 1, n3 = 0;

	public static void printFibonacci(int n) {
		if (n > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(n - 1);
		} // Your code here
	}

	static int Vcount = 0, Ccount = 0;

	public static int vowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				Vcount++;
			}
		}
		return Vcount;
	}

	public static int consonents(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' && ch == 'e' && ch == 'i' && ch == 'o' && ch == 'u') {
				Ccount++;
			}
		}
		return Ccount;
	}

	public static boolean isArmstrongNumber(int number) {
		int temp = number, rem, sum = 0;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}
		return number == sum; // Change this return value as needed
	}

	/*
	 * int n=number,rem,sum=0; while(n>0) { r=n%10; sum=sum+(r*r*r); n=n/10; }
	 */
	public static double calculateArea(double radius) {
		return ((24d / 7d) * radius * radius); // Placeholder, replace with actual calculation
	}

	public static double celsiusToFahrenheit(double celsius) {
		// Your code here
		return (9 / 5) * celsius + 32; // Placeholder, replace with actual conversion
	}

	public static String intToString(int n) {
		/*
		 * if (n == 0) return "0"; StringBuilder sb = new StringBuilder(); while (n > 0)
		 * { int curr = n % 10; n = n/10; sb.append(curr); } String s = sb.substring(0);
		 * sb = new StringBuilder(); for (int i = s.length() -1; i >= 0; i--) {
		 * sb.append(s.charAt(i)); } return sb.substring(0);
		 */
		return String.valueOf(n);
	}
	 public static int stringToInteger(String number) {
		 int intConvert = 48;
		    int reVal = 0;
		    int eachnumber = 0;
		    int index;
		    int maxlen =number.length() - 1;
		        for(index = 0 ; index <= maxlen ; index++)
		    {
		        eachnumber = number.charAt(index);

		        eachnumber = eachnumber  - intConvert;

		        reVal = reVal + (eachnumber * (int) Math.pow(10, maxlen - index));
		    }
		    return reVal;
	    }
	 public static int sumDigits(int num) {
		 int sum=0,rem;
		 while(sum>9) {
		 while(num>0) {
			 rem=num%10;
			 sum=sum+rem;
			 num=num/10;
		 }
		 if(sum>9)
			 num=sum;
	 }
	        return sum; // Placeholder, replace with actual result
	    }

	public static void main(String[] args) {
		/*
		 * System.out.println("1st ASSIGNMENT"); System.out.println(isPrime(2)); //
		 * Expected output: true System.out.println(isPrime(7)); // Expected output:
		 * true System.out.println(isPrime(12)); // Expected output: false
		 * System.out.println(isPrime(23)); // Expected output: true
		 * System.out.println(isPrime(27)); // Expected output: true
		 */
		/*
		 * System.out.println("2nd ASSIGNMENT");
		 * System.out.println(reverseString("hello")); // Expected output: "olleh"
		 * System.out.println(reverseString("Java")); // Expected output: "avaJ"
		 * System.out.println(reverseString("world")); // Expected output: "dlrow"
		 * System.out.println(reverseString("12345")); // Expected output: "54321"
		 * System.out.println(reverseString("")); // Expected output: ""
		 */
		/*
		 * System.out.println("3ED ASSIGNMENT"); int[] testCases = { 5, 0, 1, 10, 3 };
		 * for (int n : testCases) { System.out.println("Factorial of " + n + " is: " +
		 * calculateFactorial(n)); }
		 */
		/*
		 * System.out.println("4TH ASSIGNMENT"); int[] test1 = { 1, 2, 3, 4, 5 };
		 * System.out.println("Max number in test1: " + findMax(test1)); // Expected: 5
		 * int[] test2 = { -1, -5, -2, -9 }; System.out.println("Max number in test2: "
		 * + findMax(test2)); // Expected: -1 int[] test3 = { 10, 5, 20, 15 };
		 * System.out.println("Max number in test3: " + findMax(test3)); // Expected: 20
		 * 
		 * int[] test4 = { 0 }; System.out.println("Max number in test4: " +
		 * findMax(test4)); // Expected: 0
		 * 
		 * int[] test5 = { -10, -20, -5, -3 };
		 * System.out.println("Max number in test5: " + findMax(test5)); // Expected: -3
		 */
		/*
		 * System.out.println("5TH ASSIGNMENT"); String[] testCases = { "radar",
		 * "level", "hello", "A man, a plan, a canal, Panama", "12321" };
		 * 
		 * for (String testCase : testCases) { System.out.println(testCase +
		 * " is a palindrome: " + isPalindrome(testCase)); }
		 */
		/*
		 * System.out.println("6th ASSIGNMENT"); int n = 10; // Change the value of n as
		 * needed System.out.println("Fibonacci series up to " + n + " terms:");
		 * printFibonacci(n);
		 */
		// System.out.println("7th assignment");
		// System.out.println("The string \"aeiou\" consist of "+vowels("qwrty")+"
		// vowels and "+consonents("qwrty")+" consonents");
		// System.out.println("8th assignment");
		/*
		 * int[] testCases = {153, 370, 371, 9474, 123}; for (int num : testCases) {
		 * System.out.println(num + " is Armstrong? " + isArmstrongNumber(num)); }
		 */
		/*
		 * System.out.println("9th assignment");
		 * System.out.println("enter value of rate, principle, time"); Scanner sc = new
		 * Scanner(System.in); float R = sc.nextFloat(); int P = sc.nextInt(); float T =
		 * sc.nextFloat(); System.out.println("Simple Interest is " + ((P * T * R) /
		 * 100f));
		 */
		/*
		 * double[] radii = {2.0, 3.5, 5.0, 7.2, 10.0};
		 * 
		 * for (double radius : radii) { System.out.println("Radius: " + radius +
		 * ", Area: " + calculateArea(radius)); }
		 */

		// Test cases
		/*
		 * System.out.println("Test Case 1: " + celsiusToFahrenheit(0)); // Expected:
		 * 32.0 System.out.println("Test Case 2: " + celsiusToFahrenheit(100)); //
		 * Expected: 212.0 System.out.println("Test Case 3: " +
		 * celsiusToFahrenheit(-40)); // Expected: -40.0
		 * System.out.println("Test Case 4: " + celsiusToFahrenheit(37)); // Expected:
		 * 98.6 System.out.println("Test Case 5: " + celsiusToFahrenheit(25.5)); //
		 * Expected: 77.9
		 */

		/*
		 * int[] testCases = { 123, -456, 0, 789, -987 };
		 * 
		 * for (int num : testCases) { System.out.println("Integer: " + num +
		 * ", String: " + intToString(num)); }
		 */
		/*System.out.println(stringToInteger("123")); // Expected: 123
		System.out.println(stringToInteger("-456")); // Expected: -456
		System.out.println(stringToInteger("7890")); // Expected: 7890
		System.out.println(stringToInteger("+42")); // Expected: 42
		System.out.println(stringToInteger("-")); // Expected: 0*/
		
		System.out.println(sumDigits(38)); // Expected output: 2
        System.out.println(sumDigits(123)); // Expected output: 6
        System.out.println(sumDigits(999)); // Expected output: 9
        System.out.println(sumDigits(8765)); // Expected output: 8
        System.out.println(sumDigits(0)); // Expected output: 0
	}
}
