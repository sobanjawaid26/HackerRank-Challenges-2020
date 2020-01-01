package com.thedevguy.hackerrank;

import java.util.*;

public class PalindromeIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases > 0){
            System.out.println(checkForPalindrome(scanner.next()));
            testCases--;
        }
    }

    static int checkForPalindrome(String input){
        int j;
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < input.length()/2; i++){
            j = input.length() - i - 1;

            if (sb.charAt(i) != sb.charAt(j)) {
                if (i > 1) {
                    if (sb.charAt(i) == sb.charAt(j - 1) && sb.charAt(j - 2) == sb.charAt(i + 1)) {
                        return j;
                    } else {
                        return i;
                    }
                }else{
                    if (sb.charAt(i) == sb.charAt(j - 1) && sb.charAt(j - 2) == sb.charAt(0)) {
                        return j;
                    } else {
                        return i;
                    }
                }

            }
        }
        return -1;
    }

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ANOTHER SOLUTIONS
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Scanner;

// public class PalindromeIndex {

// 	static int palindromeIndex(String s) {
// 		int palindromeIndex = -1;
// 		int len = s.length();

// 		for (int i = 0; i < len / 2; i++) {
// 			if (s.charAt(i) != s.charAt(len - i - 1)) {

// 				if (i + 1 < len) {
// 					boolean isRightStringValidPalindrome = isValidPalindrome(s.substring(i + 1, len - i));
// 					if (isRightStringValidPalindrome)
// 						return i;
// 					return len - i - 1;
// 				}

// 			}
// 		}

// 		return palindromeIndex;

// 	}

// 	public static boolean isValidPalindrome(String str) {
// 		int len = str.length();

// 		for (int i = 0; i < len / 2; i++) {
// 			if (str.charAt(i) != str.charAt(len - i - 1)) {
// 				return false;
// 			}
// 		}

// 		return true;

// 	}

// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		int q = in.nextInt();
// 		for (int i = 0; i < q; i++) {
// 			String s = in.next();
// 			int result = palindromeIndex(s);
// 			System.out.println(result);

// 		}
// 		in.close();
// 	}

// }