package javaObjectClass;
class Travel{
    String fromCity, toCity;
    double distance;

    // Constructor

    Travel(String fromCity, String toCity, double distance){
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    void displayDetails(){
        System.out.println("Train from "+ fromCity + ", to "+ toCity + " , at a distance of "+ distance);
    }
}

public class travelDetails {
   public static void main(String[] args) {
     Travel travel  = new Travel("Agra", "Delhi",243.33);
    travel.displayDetails();
   }
    
}
