package org.dci;

import java.util.*;

public class Main {
    public static  Set<Character> charSet = new HashSet<>();
    public static void main(String[] args) {
        System.out.println("Task 1: Count the Number of Digits in a Number");
        task1();

        System.out.println("\nTask 2: Check if a String is a Palindrome");
        task2();


        System.out.println("\nTask 3: Sum of Digits of a Number");
        task3();

        System.out.println("\nTask 4: Print an Array in Reverse Order");
        task4();

        System.out.println("\nTask 5: Count the Occurrences of a Character in a String");
        task5();

        System.out.println("\nTask 6: Remove Duplicates from a String Recursively");
        task6();
    }

    // Task 1
    private static void task1() {
        System.out.println("12345 has " + countDigits(12345) + " digits.");
        System.out.println("7 has " + countDigits(7) + " digits.");
        System.out.println("987654321 has " + countDigits(987654321) + " digits.");
    }

    public static int countDigits(int n) {
        if ( n > 0 && n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }


    // Task 2
    private static void task2() {
        System.out.println("Is \"racecar\" palindrome? " + isPalindrome("racecar"));
        System.out.println("Is \"hello\" palindrome? " + isPalindrome("hello"));
        System.out.println("Is \"madam\" palindrome? " + isPalindrome("madam"));

    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }

    // Task 3
    private static void task3() {

        System.out.println("Sum of digits od 123 is :" + sumOfDigits(123));
        System.out.println("Sum of digits od 9876 is :" + sumOfDigits(9876));
        System.out.println("Sum of digits od 5 is :" + sumOfDigits(5));

    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    // Task 4
    private static void task4() {
        int[] numArray1 = {1, 2, 3, 4, 5};
        System.out.println("Array of Numbers: " + Arrays.toString(numArray1));
        System.out.print("Array in reverseOrder: ");
        printReverse(numArray1, numArray1.length - 1);

        int[] numArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array of Numbers: " + Arrays.toString(numArray2));
        System.out.print("Array in reverseOrder: ");
        printReverse(numArray2, numArray2.length - 1);
    }

    public static void printReverse(int[] arr, int index) {
        System.out.print(arr[index] + " ");
        if (index == 0) {
            System.out.println();
            return;
        }

        printReverse(arr, index - 1);
    }

    // Task 5
    private static void task5() {
        System.out.println("Number of occurrences os 'a' in \"banana\": " + countOccurrences("banana", 'a'));
        System.out.println("Number of occurrences os 'r' in \"recursion\": " + countOccurrences("recursion", 'r'));
        System.out.println("Number of occurrences os 'z' in \"hello\": " + countOccurrences("hello", 'z'));
    }

    public static int countOccurrences(String s, char c) {
        if (s.isEmpty()) {
            return 0;
        }

        return (s.charAt(0) == c ? 1 : 0) + countOccurrences(s.substring(1), c);
    }

    // Task 6
    private static void task6() {
        System.out.println("\"aaabbcddd\" after removing duplicate characters: " + removeDuplicates("aaabbcddd"));
        clearSet();
        System.out.println("\"hello\" after removing duplicate characters: " + removeDuplicates("helo" ));
        clearSet();
        System.out.println("\"aabbcc\" after removing duplicate characters: " + removeDuplicates("abc"));

    }

    public static void clearSet() {
        charSet.clear();
    }

    public static String removeDuplicates(String s) {
        if (s.isEmpty()) {
            return s;
        }

        if (s.length() == 1) {
            if (!charSet.contains(s.charAt(0))) {
                charSet.add(s.charAt(0));
                return s;
            }
            return "";
        }

        if (charSet.contains(s.charAt(0))) {
            return removeDuplicates(s.substring(1));
        }

        charSet.add(s.charAt(0));
        return s.substring(0,1) + removeDuplicates(s.substring(1));

        }


}