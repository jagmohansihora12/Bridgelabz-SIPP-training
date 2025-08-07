package inheritance;

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calling the parent class constructor
        System.out.println("Dog constructor");
    }
}


public class superKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }    
}
