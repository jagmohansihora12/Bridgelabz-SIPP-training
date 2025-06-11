import java.util.Scanner;
public class HeightConverterToFeet{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The Height in centimeter:");
double centimeter = sc.nextDouble();
double feet = centimeter * 0.0328084;
System.out.println("The Height in Feet :" + feet);
sc.close();
}
}