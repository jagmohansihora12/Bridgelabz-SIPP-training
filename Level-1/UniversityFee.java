public class UniversityFee{
public static void main(String[] args){
int fee = 125000;
int discount = 10;
int feeDiscounted= (fee*discount)/100 ;
int finalAmount = fee - feeDiscounted ;
System.out.println("Discounted amount " + feeDiscounted);
System.out.println("Fee to be paid " + finalAmount);
}
}