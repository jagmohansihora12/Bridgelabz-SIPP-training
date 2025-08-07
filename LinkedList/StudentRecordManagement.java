package LinkedList;

class Student {
    int rollNo;
    int age;
    String name;
    String grade;
    Student next;

    public Student(int rollNo, int age, String name, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head;

    
    public void insertAtBeginning(Student newStudent) {
        newStudent.next = head;
        head = newStudent;
    }

    
    public void insertAtEnd(Student newStudent) {
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }

    
    public void deleteByRollNo(int rollNo) {
        if (head == null) return;

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    
    public void display() {
        Student current = head;
        while (current != null) {
            System.out.print("Name: " + current.name + ", ");
            System.out.print("Roll No: " + current.rollNo + ", ");
            System.out.print("Age: " + current.age + ", ");
            System.out.println("Grade: " + current.grade);
            current = current.next;
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.insertAtEnd(new Student(1, 18, "ABC", "A"));
        list.insertAtEnd(new Student(2, 19, "XYZ", "A+"));
        list.insertAtBeginning(new Student(3, 17, "KLM", "B"));

        System.out.println("All Students:");
        list.display();

        
        list.deleteByRollNo(2);
        System.out.println("\nAfter Deleting Roll No 2:");
        list.display();
    }
}
