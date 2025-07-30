package Encapsulation;

// nodes
/* Encapsulation
* Polymorphism
* Interface
* abstraction

Encapsulation 

Using private fields and public getters/setters.
notes:1 Use private variables to protect data.

2 Access data using getters and setters.

3 Improves security and data control.

3 How to do private String name; => access with getName() and setName().

=> Polymorphism: Same method behaves differently based on object type.
Types of Polymorphism two types
Compile-Time Polymorphism (Static Polymorphism)
Points:
Achieved using Method Overloading.
Decision is made at compile time.
Same method name, different parameter list.
If the method name is the same but the return types are different, is it also method overloading

2 =>
Run-Time Polymorphism (Dynamic Polymorphism)
Points:
Achieved using Method Overriding.
Decision is made at run time.




Interface: Defines a contract that all vehicles should follow.
Key Points:
Only method signatures (before Java 8).

Cannot have constructor or variables (except constants).

All methods are public and abstract by default.

A class implements an interface.

From Java 8 onwards:

Can have default methods (with body).

Can have static methods.





Abstract Class: Provides common base but can’t be instantiated.
Can have abstract methods (without body) and concrete methods (with body).

Can have variables, constructors, and methods.

Must be extended by a subclass.

Cannot create objects directly.
abstactClass a = new abstactClass() do not do it
notes if you want to create the object you should extends the class to other class then you can do
abstract class animal {
public abstract void sound();
}

class Dog extends Animal {

public void sound() {
System.out.println("Dog barks");
}
}

public class Test {
public static void main(String[] args) {
Animal obj = new Dog(); // here you can do it
obj.sound(); // output Dog barks
}
}




*/

//Interface Nodes This is a contract that all vehicles must follow
interface Vehicle {
void start(); // All vehicles must implement how they start
void stop();
static void data(){// All vehicles must implement how they stop
    System.out.println(" Data in body");// if you to write data in side method so method must be static
}
}

//Abstract Class Common blueprint for all vehicles
abstract class AbstractVehicle implements Vehicle {
// Encapsulation: Keeping properties private
private String brand;
private int year;

// Constructor
public AbstractVehicle(String brand, int year) {
this.brand = brand;
this.year = year;
}

// Getters and Setters: Control access to private fields
public String getBrand() {
return brand;
}

public void setBrand(String brand) {
this.brand = brand;
}

public int getYear() {
return year;
}

public void setYear(int year) {
this.year = year;
}

// Abstract Method: Must be implemented by subclasses
public abstract void drive();

// Common Method for all vehicles
public void displayInfo() {
System.out.println("Brand: " + brand + ", Year: " + year);
}
}

//Concrete Class: Car
class Car extends AbstractVehicle {
public Car(String brand, int year) {
super(brand, year);
}

@Override
public void start() {
System.out.println(getBrand() + " Car is starting with a key.");
}

@Override
public void stop() {
System.out.println(getBrand() + " Car is stopping.");
}

@Override
public void drive() {
System.out.println(getBrand() + " Car is driving on the road.");
}
}

//Concrete Class: Bike
class Bike extends AbstractVehicle {
public Bike(String brand, int year) {
super(brand, year);
}

@Override
public void start() {
System.out.println(getBrand() + " Bike is starting with a kick.");
}

@Override
public void stop() {
System.out.println(getBrand() + " Bike is stopping.");
}

@Override
public void drive() {
System.out.println(getBrand() + " Bike is driving on the street.");
}
}

//Main Class: To test the program
public class vehicleTest{
public static void main(String[] args) {
// Polymorphism: Same reference type (AbstractVehicle) can point to different objects
    /*AbstractVehicle is the parent class (abstract).
You cannot create an object directly from an abstract class
But you can use the abstract class as a reference type
You create objects of the child classes (Car and Bike) and store them in parent class references.
   
    */
   
   
AbstractVehicle car = new Car("Toyota", 2020);
AbstractVehicle bike = new Bike("Honda", 2021);

// Car methods
car.displayInfo();
car.start();
car.drive();
// Vehicle.data(); direct call method in main method without creating the object


System.out.println("////------------------------////");

// Bike methods
bike.displayInfo();
bike.start();
bike.drive();
bike.stop();
}
}
