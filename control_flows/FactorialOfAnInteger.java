package control_flows;

import java.util.Scanner;

public class FactorialOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int number = sc.nextInt();
        while(number>=0){
            int fact = 1;
            for(int i=1;i<=number;i++){
                fact = fact * i;
            }
            System.out.println("Factorial of "+number+" is "+fact);
            break;
        }
        sc.close();
    }
}
