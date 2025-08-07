package LinkedList;

// Scenario 1: Browser History Navigation
// Use Case: Maintain a user’s browsing history with the ability to move back and forth.
// Why LinkedList? Doubly linked list makes it easy to navigate both backward and forward.
// OOP Concepts:
// ● Encapsulation: Browser history data is wrapped inside a class.
// ● Abstraction: Navigation methods hide internal implementation.
// ● Inheritance & Polymorphism: Reusable navigation for other apps like music players.


// Base interface for navigation operations
interface Navigation {
    void goForward();
    void goBack();
}

// Browser history class implementing navigation
public class BrowsingHistoryNavigation implements Navigation {
    private static class Node {
        private int data;
        private Node next;
        private Node prev;

        private Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node current;

    public BrowsingHistoryNavigation() {
        this.head = null;
        this.current = null;
    }

    // Encapsulated method to add new sites
    public void addSite(int data) {
        Node newData = new Node(data);
        if(head == null) {
            head = newData;
            current = head;
            return;
        }
        newData.next = head;
        head.prev = newData;
        head = newData;
        current = head;
    }

    // Implementation of Navigation interface
    @Override
    public void goForward() {
        if(current != null && current.next != null) {
            current = current.next;
            System.out.println("Current page: " + current.data);
        }
    }

    @Override
    public void goBack() {
        if(current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current page: " + current.data);
        }
    }

    // Your existing methods with better encapsulation
    public void displayHistory() {
        Node temp = head;
        while(temp != null) {
            System.out.println("Data: " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteSite(int data) {
        if(head == null) {
            System.out.println("No history Available");
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            if(temp.next.data == data) {
                temp.next = temp.next.next;
                if(temp.next != null) {
                    temp.next.prev = temp;
                }
                return;
            }
            temp = temp.next;
        }
    }

    // Your existing main method
    public static void main(String[] args) {
        BrowsingHistoryNavigation history = new BrowsingHistoryNavigation();
        history.addSite(6);
        history.addSite(5);
        history.addSite(4);
        history.addSite(3);
        history.addSite(2);
        history.addSite(1);
        
        history.displayHistory();
        history.deleteSite(2);
        history.displayHistory();
        
        // Test navigation
        history.goForward();
        history.goBack();
        history.goForward();
    }
}
