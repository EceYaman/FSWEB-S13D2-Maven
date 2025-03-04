package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == num;
    }


    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();

        if (num == 0) {
            return words[0];
        }

        while (num > 0) {
            int digit = num % 10;
            result.insert(0, words[digit] + " ");
            num /= 10;
        }

        return result.toString().trim();
    }
}
