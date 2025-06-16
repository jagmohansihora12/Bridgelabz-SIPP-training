package arrays;
import java.util.Scanner;

public class MeanOfHeights {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
         System.out.println("Enter the players height :");
         for( int i = 0; i<11;i++){
            System.out.println("Player" + (i+1)+ " height :");
            heights[i] = sc.nextDouble();
            sum = sum + heights[i];
         }
         double mean = sum/11;
         System.out.println("Mean of heights is : "+mean);
         sc.close();
}
}