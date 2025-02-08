public class Main {
    //----------Exercise-1-----------
    //If the number has only one digit (like 7), the count is 1.
    //Otherwise, we divide the number by 10 to remove the last digit and count the remaining digits recursively.
    //We keep doing this until the number becomes 0, at which point we stop.

    public static int countDigits(int n) {
        if (n <= 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
    //----------Exercise-2------------
    //f the string has only one or zero characters, it's a palindrome.
    //Compare the first and last characters:
    //If they are different, it's not a palindrome.
    //If they are the same, check the substring between them recursively.

    public static boolean isPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    //-----------Exercise-3----------------
    //If the number is a single digit, return the number itself.
    //Otherwise, add the last digit to the sum of the remaining digits.
    //Use n % 10 to get the last digit and n / 10 to remove it.

    public static int sumOfDigits(int n) {
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    //-----------Exercise-4----------------
    //Start from the last element and print it.
    //Move to the previous element (index - 1) and print it.
    //Stop when the index is less than 0.

    public static void printReverse(int[] arr, int index){
        if(index < 0){
            return;
        }
        System.out.println(arr[index] + " ");
        printReverse(arr, index - 1);
    }
    //-----------Exercise-5----------------
    //If the string is empty, return 0.
    //Check if the first character matches the given character.
    //If yes, add 1 and check the rest of the string.
    //If no, just check the rest of the string.
    public static int countOccurrences(String str, char c) {
        if(str.isEmpty()) {
            return 0;
        }
        return (str.charAt(0) == c ? 1 : 0) + Main.countOccurrences(str.substring(1), c);
    }
    //-------------Exercise-6---------------
    //f the string has only one character or is empty, return it as is.
    //Compare the first and second characters:
    //If they are the same, remove one and check the rest.
    //If they are different, keep the first and check the rest.

    public static String removeDuplicates(String s) {
        if(s.length() <= 1) {
            return s;
        }
        if(s.charAt(0) == s.charAt(1)){
            return removeDuplicates(s.substring(1));
        }
        return s.charAt(0) + removeDuplicates(s.substring(1));
        }



    public static void main(String[] args) {
        //----------Exercise-1-----------
        System.out.println(countDigits(12345));
        System.out.println(countDigits(7));
        System.out.println(countDigits(987654321));
        //----------Exercise-2------------
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("madam"));
        //----------Exercise-3------------
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(9876));
        System.out.println(sumOfDigits(5));
        //----------Exercise-4------------
        int[] arr = {1, 2, 3, 4, 5};
        printReverse(arr, arr.length - 1);
        //----------Exercise-5------------
        System.out.println(countOccurrences("banana", 'a'));
        System.out.println(countOccurrences("recursion", 'r'));
        System.out.println(countOccurrences("hello", 'z'));
        //----------Exercise-6------------
        System.out.println(removeDuplicates("aaabbcddd"));
        System.out.println(removeDuplicates("hello"));
        System.out.println(removeDuplicates("aabbcc"));

    }

}
