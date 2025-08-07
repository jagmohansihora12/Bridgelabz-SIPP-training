package LinkedList;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }

    static class NodeList{
        public static Node addFirst(Node head, int data ){
            Node newNode  = new Node(data);
            if(head == null){
                head = newNode;
                return head;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return head;
        }
        public static Node addlast(Node head, int data){
            Node newNode = new Node(data);
            if(head ==null){
                head = newNode;
            }else{
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next= newNode;
                newNode .prev = temp;
            }
            return head;
        }
        public static boolean search(Node head, int data){
            Node temp =  head;
            while(temp != null){
                if(temp.data == data){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }


        public static Node deleteAtFirst(Node head){
            if (head == null || head.next == null) {
                return null;
            }
            Node temp = head;
            temp = temp.next;
            temp.prev = null;
            return temp;
        }

        public static Node deleteAtLast(Node head){
            if (head == null || head.next == null) {
                return null;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.prev.next = null;
            temp.prev = null;
            return head;
        }

        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("");
        }

        public static void main(String[] args) {
            Node head = null;
            head = addFirst(head, 0);
            head = addFirst(head, 1);
            head = addFirst(head, 2);
            head = addFirst(head, 3);
            head = addFirst(head, 4);
            head = addlast(head, 10);
            display(head);

            deleteAtFirst(head);
            display(head);
            deleteAtLast(head);
            display(head);
            System.out.println(search(head, 3));


        }
    }
}
