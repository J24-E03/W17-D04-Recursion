# Recursion Lab Exercises

## **Iteration 1: Count the Number of Digits in a Number**  
**Problem:**  
Write a recursive function to count the number of digits in a given integer.  

### **Example:**  
```java
countDigits(12345) → 5  
countDigits(7) → 1  
countDigits(987654321) → 9  
```

### **Function Signature:**  
```java
public static int countDigits(int n)
```

---

## **Iteration 2: Check if a String is a Palindrome**  
**Problem:**  
Write a recursive function that checks whether a given string is a palindrome.  

### **Example:**  
```java
isPalindrome("racecar") → true  
isPalindrome("hello") → false  
isPalindrome("madam") → true  
```

### **Function Signature:**  
```java
public static boolean isPalindrome(String s)
```

---

## **Iteration 3: Sum of Digits of a Number**  
**Problem:**  
Write a recursive function that finds the sum of the digits of a given number.  

### **Example:**  
```java
sumOfDigits(123) → 6  
sumOfDigits(9876) → 30  
sumOfDigits(5) → 5  
```

### **Function Signature:**  
```java
public static int sumOfDigits(int n)
```

---

## **Iteration 4: Print an Array in Reverse Order**  
**Problem:**  
Write a recursive function that prints the elements of an array in reverse order.  

### **Example:**  
```java
Input: {1, 2, 3, 4, 5}  
Output: 5 4 3 2 1  
```

### **Function Signature:**  
```java
public static void printReverse(int[] arr, int index)
```

---

## **Iteration 5: Count the Occurrences of a Character in a String**  
**Problem:**  
Write a recursive function that counts the number of times a given character appears in a string.  

### **Example:**  
```java
countOccurrences("banana", 'a') → 3  
countOccurrences("recursion", 'r') → 2  
countOccurrences("hello", 'z') → 0  
```

### **Function Signature:**  
```java
public static int countOccurrences(String s, char c)
```

---

## **Iteration 6: Remove Duplicates from a String Recursively**  
**Problem:**  
Write a recursive function that removes consecutive duplicate characters from a string.  

### **Example:**  
```java
removeDuplicates("aaabbcddd") → "abcd"  
removeDuplicates("hello") → "helo"  
removeDuplicates("aabbcc") → "abc"  
```

### **Function Signature:**  
```java
public static String removeDuplicates(String s)
```