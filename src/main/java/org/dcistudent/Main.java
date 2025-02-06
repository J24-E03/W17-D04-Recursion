package org.dcistudent;

public class Main {

  // This is the main method where the program execution starts.
  public static void main(String[] args) {
    // Creating an instance of the Main class. This will trigger the constructor.
    new Main();
  }

  // This is the constructor of the Main class. It's called when a new Main object is created.
  private Main() {
    // Calling the methods for each exercise.
    Main.exercise1();
    Main.exercise2();
    Main.exercise3();
    Main.exercise4();
    Main.exercise5();
    Main.exercise6();
  }

  /**
   * 1. Count the Number of Digits in a Number
   *
   * Problem:
   * Write a recursive function to count the number of digits in a given
   * integer.
   */
  private static void exercise1() {
    System.out.println("Exercise 1");
    // Calling the countDigits method with the number 12345 and printing the result.
    System.out.println("Recursive: " + Main.countDigits(12345));
    System.out.println("--------------------");
  }

  // This method recursively counts the digits in an integer.
  private static int countDigits(int n) {
    // Base case: If the number is 0, it has no digits.
    if (n == 0) {
      return 0;
    }
    // Recursive step: Divide the number by 10 (removes the last digit) and call countDigits again.
    // Add 1 to the result to account for the digit that was removed.
    return 1 + Main.countDigits(n / 10);
  }

  /**
   * 2. Check if a String is a Palindrome
   *
   * Problem:
   * Write a recursive function that checks whether a given string is a palindrome.
   */
  private static void exercise2() {
    System.out.println("Exercise 2");
    // Testing the isPalindrome method with different strings.
    System.out.println("Palindrome: " + Main.isPalindrome("racecar"));
    System.out.println("Palindrome: " + Main.isPalindrome("hello"));
    System.out.println("Palindrome: " + Main.isPalindrome("madam"));
    System.out.println("--------------------");
  }

  // This method recursively checks if a string is a palindrome.
  private static boolean isPalindrome(String s) {
    // Base case: If the string has 0 or 1 characters, it's a palindrome.
    if (s.length() <= 1) {
      return true;
    }
    // Check if the first and last characters are the same.
    if (s.charAt(0) != s.charAt(s.length() - 1)) {
      return false;
    }
    // Recursive step: Call isPalindrome with the substring excluding the first and last characters.
    return Main.isPalindrome(s.substring(1, s.length() - 1));
  }

  /**
   * 3. Sum of Digits of a Number
   *
   * Problem:
   * Write a recursive function that finds the sum of the digits of a given
   * number.
   */
  private static void exercise3() {
    System.out.println("Exercise 3");
    // Calling the sumOfDigits method with the number 12345 and printing the result.
    System.out.println("Sum of Digits: " + Main.sumOfDigits(12345));
    System.out.println("--------------------");
  }

  // This method recursively calculates the sum of the digits of an integer.
  private static int sumOfDigits(int n) {
    // Base case: If the number is 0, the sum of its digits is 0.
    if (n == 0) {
      return 0;
    }
    // Recursive step: Get the last digit (n % 10) and add it to the sum of the remaining digits.
    return n % 10 + Main.sumOfDigits(n / 10);
  }

  /**
   * 4. Print an Array in Reverse Order
   *
   * Problem:
   * Write a recursive function that prints the elements of an array in reverse
   * order.
   */
  private static void exercise4() {
    System.out.println("Exercise 4");
    int[] array = {1, 2, 3, 4, 5};
    // Calling the getReversed method to get the reversed array as a string and printing it.
    System.out.println("Reversed: " + Main.getReversed(array, array.length - 1));
    System.out.println("--------------------");
  }

  // This method recursively builds a string with the array elements in reverse order.
  private static String getReversed(int[] array, int index) {
    // Base case: If the index is less than 0, it means all elements have been processed.
    if (index < 0) {
      return "";
    }
    // Recursive step: Add the element at the current index to the string and call getReversed for the previous index.
    return array[index] + " " + Main.getReversed(array, index - 1);
  }

  /**
   * 5. Count the Occurrences of a Character in a String
   *
   * Problem:
   * Write a recursive function that counts the number of times a given
   * character appears in a string.
   */
  private static void exercise5() {
    System.out.println("Exercise 5");
    // Calling the countOccurrences method to count the occurrences of 'l' in "hello" and printing the result.
    System.out.println("Occurrences: " + Main.countOccurrences("hello", 'l'));
    System.out.println("--------------------");
  }

  // This method recursively counts the occurrences of a character in a string.
  private static int countOccurrences(String s, char c) {
    // Base case: If the string is empty, the character occurs 0 times.
    if (s.length() == 0) {
      return 0;
    }
    // Recursive step: Check if the first character is equal to the target character.
    // If it is, add 1 to the count. Then, call countOccurrences for the rest of the string.
    return (s.charAt(0) == c ? 1 : 0) + Main.countOccurrences(s.substring(1), c);
  }

  /**
   * 6. Remove Duplicates from a String Recursively
   *
   * Problem:
   * Write a recursive function that removes consecutive duplicate characters
   * from a string.
   */
  private static void exercise6() {
    System.out.println("Exercise 6");
    // Testing the removeDuplicates method with different strings.
    System.out.println("Duplicates: " + Main.removeDuplicates("hello"));
    System.out.println("Duplicates: " + Main.removeDuplicates("mississippi"));
    System.out.println("--------------------");
  }

  // This method recursively removes consecutive duplicate characters from a string.
  private static String removeDuplicates(String s) {
    // Base case: If the string has 0 or 1 characters, there are no consecutive duplicates.
    if (s.length() <= 1) {
      return s;
    }
    // Check if the first two characters are the same.
    if (s.charAt(0) == s.charAt(1)) {
      // If they are, skip the first character and call removeDuplicates for the rest of the string.
      return Main.removeDuplicates(s.substring(1));
    }
    // If the first two characters are different, keep the first character and call removeDuplicates for the rest of the string.
    return s.charAt(0) + Main.removeDuplicates(s.substring(1));
  }
}