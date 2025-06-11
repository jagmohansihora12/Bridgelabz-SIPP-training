import java.util.Scanner;
public class Fee{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Amount of Fee:");
int fee = sc.nextInt();
System.out.println("Discount on Fee:");
int Discount = sc.nextInt();
int feeDiscounted= (fee*Discount)/100 ;
int finalAmount = fee - feeDiscounted ;
System.out.println("Discounted amount " + feeDiscounted);
System.out.println("Fee to be paid " + finalAmount);
sc.close();
}
}