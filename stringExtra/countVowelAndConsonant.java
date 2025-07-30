package stringExtra;

import java.util.Scanner;

// Problem:
// Write a Java program to count the number of vowels and consonants in a given string.

public class countVowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str  = str.toLowerCase();
        char[] arr = str.toCharArray();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr [i] == 'u'){
                count++;
            }
        }
        System.out.println("No. of Vowel: " + count);
        System.out.println("No. of consotant: " + (str.length() - count));
        sc.close();
    }
}
