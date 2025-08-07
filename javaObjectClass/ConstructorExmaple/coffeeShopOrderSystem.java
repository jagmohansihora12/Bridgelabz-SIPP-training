package javaObjectClass.ConstructorExmaple;

class CoffeeShopOrder{
    // Attributes
    String customerName;
    String coffeType;
    int quantity;
    double totalPrice;

    // default Constructor
    CoffeeShopOrder(){
        customerName = "Guest";
        coffeType = "Regular";
        quantity = 1;
        totalPrice = calculatePrice();
    }

    // parameterized Constructor
    CoffeeShopOrder(String customerName, String coffeeType, int quantity){
        this.customerName = customerName;
        this.coffeType = coffeeType;
        this.quantity = quantity;
        this.totalPrice = calculatePrice();
    }

    // copy Constructor
    CoffeeShopOrder(CoffeeShopOrder previousOrder){
        this.customerName = previousOrder.customerName;
        this.coffeType = previousOrder.coffeType;
        this.quantity = previousOrder.quantity;
        this.totalPrice = previousOrder.totalPrice;
    }

    // Methiod to calculate Price
    private double calculatePrice(){
        double pricePerCul = switch (coffeType.toLowerCase()){
            case "latte" -> 5.0;
            case "espresso" -> 4.0;
            case "cappaccino" -> 4.5;
            default -> 3.0;
        };
        return pricePerCul * quantity;
    }

    // deisplay order details

    void displayOrderDetails(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Coffee Type: " + coffeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);

    }
}

public class coffeeShopOrderSystem {
    public static void main(String[] args) {
        CoffeeShopOrder order1 = new CoffeeShopOrder();
        System.out.println("Oder 1");
        order1.displayOrderDetails();

        // parameterized constructor
        CoffeeShopOrder  order2 = new CoffeeShopOrder("Alice", "Latte", 3);
        System.out.println("\n Order 2: ");
        order2.displayOrderDetails();

        // copy constructor
        CoffeeShopOrder order3 = new CoffeeShopOrder(order2);
        System.out.println("\n Order 3: ");
        order3.displayOrderDetails();
    }
}
