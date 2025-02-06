package solutions;

import java.util.Arrays;

public class Main {

    // Method for Iteration 1
    static int countDigit(int n) {
        // Base case
        if (n == 0)
            return 1;

        int count = 0;

        // Iterate till n has digits remaining
        while (n != 0) {

            // Remove rightmost digit
            n = n / 10;

            // Increment digit count by 1
            ++count;
        }
        return count;
    }

    // Method for Iteration 2
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        // Compare characters while i < j
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Method for Iteration 3
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {

            // Extract the last digit
            int last = n % 10;

            // Add last digit to sum
            sum += last;

            // Remove the last digit
            n /= 10;
        }
        return sum;
    }

    // Method for Iteration 4
    public static void printReverse(int[] arr) {

        // Initialize left to the beginning and right to the end
        int left = 0, right = arr.length - 1;

        // Iterate till left is less than right
        while (left < right) {

            // Swap the elements at left and right position
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Increment the left pointer
            left++;

            // Decrement the right pointer
            right--;
        }
    }

    // Method for Iteration 5
    // return count of the given character in the string
    public static int countOccurrences(String s, char c)
    {
        int res = 0;

        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
                res++;
        }
        return res;
    }

    // Method for Iteration 6
    static String removeDuplicate(String s) {

        // Initialize start and stop pointers
        int i = 0;
        int j = 0;

        // Initialize an empty string for new elements
        String newElements = "";

        // Iterate string using j pointer
        while (j < s.length()) {

            // If both elements are same then skip
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            // If both elements are not same then append new
            // element
            else if (s.charAt(j) != s.charAt(i)
                    || j == s.length() - 1) {
                newElements += s.charAt(i);

                // After appending, slide over the window
                i = j;
                j++;
            }
        }
        // Append the last string
        newElements += s.charAt(j - 1);
        return newElements;
    }



    public static void main(String[] args) {
            /*
        Iteration 1: Count the Number of Digits in a Number
            Problem:
            Write a recursive function to count the number of digits in a given integer.
            */
        System.out.println("Iteration 1:");

        // Examples:
        int n1 = 12345;
        System.out.println("countDigits(12345): " + countDigit(n1));
        int n2 = 7;
        System.out.println("countDigits(7): " + countDigit(n2));
        int n3 = 987654321;
        System.out.println("countDigits(987654321): " + countDigit(n3));

            /*
        Iteration 2: Check if a String is a Palindrome
            Problem:
            Write a recursive function that checks whether a given string is a palindrome.
            */
        System.out.println("\nIteration 2:");

        // Input strings
        String s1 = "racecar";
        String s2 = "hello";
        String s3 = "madam";

        // Check and print results for s1
        if (isPalindrome(s1)) {
            System.out.println("\"" + s1 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s1 + "\" is not a palindrome.");
        }

        // Check and print results for s2
        if (isPalindrome(s2)) {
            System.out.println("\"" + s2 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s2 + "\" is not a palindrome.");
        }

        // Check and print results for s2
        if (isPalindrome(s2)) {
            System.out.println("\"" + s3 + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s3 + "\" is not a palindrome.");
        }

            /*
        Iteration 3: Sum of Digits of a Number
            Problem:
            Write a recursive function that finds the sum of the digits of a given number.
            */
        System.out.println("\nIteration 3:");

        int sum1 = 123;
        System.out.println("sumOfDigits(123): " + sumOfDigits(sum1));
        int sum2 = 9876;
        System.out.println("sumOfDigits(9876): " + sumOfDigits(sum2));
        int sum3 = 5;
        System.out.println("sumOfDigits(5): " + sumOfDigits(sum3));

            /*
        Iteration 4: Print an Array in Reverse Order
            Problem:
            Write a recursive function that prints the elements of an array in reverse order.
            */
        System.out.println("\nIteration 4:");

        int[] arr = { 1, 2, 3, 4, 5 };

        printReverse(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

            /*
        Iteration 5: Count the Occurrences of a Character in a String
            Problem:
            Write a recursive function that counts the number of times a given character appears in a string.
            */
        System.out.println("\n" + "\nIteration 5:");

        String r1= "banana";
        char c1 = 'a';
        System.out.println("countOccurrences(\"banana\", 'a'): " + countOccurrences(r1, c1));

        String r2= "recursion";
        char c2 = 'r';
        System.out.println("countOccurrences(\"recursion\", 'r'): " + countOccurrences(r2, c2));

        String r3= "hello";
        char c3 = 'z';
        System.out.println("countOccurrences(\"hello\", 'z'): " + countOccurrences(r3, c3));

            /*
        Iteration 6: Remove Duplicates from a String Recursively
            Problem:
            Write a recursive function that removes consecutive duplicate characters from a string.
            */
        System.out.println("\nIteration 6:");

        String d1 = "aaabbcddd";
        String result1 = removeDuplicate(d1);
        System.out.println("removeDuplicates(\"aaabbcddd\"): " + result1);

        String d2 = "hello";
        String result2 = removeDuplicate(d2);
        System.out.println("removeDuplicates(\"hello\"): " + result2);

        String d3 = "aabbcc";
        String result3 = removeDuplicate(d3);
        System.out.println("removeDuplicates(\"aabbcc\"): " + result3);







    }

}
