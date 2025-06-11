public class PenDivison{
public static void main(String[] args){
int students = 3;
int pen = 14;
int remainingPen= pen%students ;
int penDivided = (pen - remainingPen)/3;
System.out.println("Equal pen one will get " + penDivided);
System.out.println("Remaining pen are " + remainingPen);
}
}