public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println(countDigits(12345));
        System.out.println(countDigits(7));
        System.out.println(countDigits(987654321));

        // Task 2
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("madam"));

        // Task 3
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(9876));
        System.out.println(sumOfDigits(5));

        // Task 4
        int[] array = new int[]{1, 2, 3, 4, 5};
        printArrayInReverse(array, array.length - 1);

        // Task 5
        System.out.println(countCharOccurrences("banana", 'a'));
        System.out.println(countCharOccurrences("recursion", 'r'));
        System.out.println(countCharOccurrences("hello", 'z'));

        // Task 6
        System.out.println(removeDuplicatesFromString("aaabbcddd"));
        System.out.println(removeDuplicatesFromString("hello"));
        System.out.println(removeDuplicatesFromString("aabbcc"));
    }

    private static int countDigits(int number) {
        if (number / 10 == 0) {
            return 1;
        }

        return 1 + countDigits(number / 10);
    }

    private static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }

    private static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        return (number % 10 + sumOfDigits(number / 10));
    }

    private static void printArrayInReverse(int[] array, int index) {
        System.out.print(array[index] + " ");
        if (index == 0) {
            System.out.println();
            return;
        }

        printArrayInReverse(array, index - 1);
    }

    private static int countCharOccurrences(String s, char c) {
        if (s.isBlank()) {
            return 0;
        }

        if (s.charAt(0) == c) {
            return 1 + countCharOccurrences(s.substring(1), c);
        } else {
            return countCharOccurrences(s.substring(1), c);
        }
    }

    private static String removeDuplicatesFromString(String s) {
        if (s.length() <= 1) {
            return s;
        }

        if (s.substring(1, 2).equals(s.substring(0, 1))) {
            return removeDuplicatesFromString(s.substring(1));
        } else {
            return s.charAt(0) + removeDuplicatesFromString(s.substring(1));
        }
    }
}
