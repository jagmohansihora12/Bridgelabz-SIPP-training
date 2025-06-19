package control_flows;

public class SmallestfromTheThree {
    public static void main(String[] args) {
        int a = 30; 
        int b = 20;
        int c = 10;
        if (a > b && b < c) {
            System.out.println("b is the smallest");
        } else if(b > a && a < c) {
            System.out.println("a is the smallest"); 
        } else  {
            System.out.println("c is the smallest");
        }
    }
    
}
