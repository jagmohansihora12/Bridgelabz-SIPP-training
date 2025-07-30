package stringExtra;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // normal method
        for(int i = str.length() -1 ;i >=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("");

        // 2 pointer

        int start = 0;
        int end = str.length() -1;
        char [] arr = str.toCharArray();
        while(start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            start++;
            end--;
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            s.append(arr[i]);
        }
        System.out.println(s.toString());


        System.out.println();
        System.out.println(reverse(0,str,str.length()));

        sc.close();
    }
    static String reverse(int i, String s,int n){
        if(i==n){
            return "";
        }
        return reverse(i+1,s,n)+s.charAt(i);
    }
}
