package LinkedList;

class Book{
    int id;
    String title;
    String author;
    String genre;
    Boolean available;
    Book next, prev;

    public Book(int id, String title, String author, String genre, Boolean available){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available =available;
        this.next = null;
        this.prev = null;
    }
}


class BookList{
    public Book insertAtStart(Book head, Book newBook){
        if (head != null) {
            newBook.next = head;
            head.prev = newBook;
        }
        return newBook;
    }

    public Book insertAtEnd(Book head, Book newBook){
        Book book = head;
        if(head == null){
            insertAtStart(head, newBook);
        }else{
            while(book.next!= null){
                book = book.next;
            }
            book.next = newBook;
            newBook.prev = book;
        }
        return book;
    }

    public Book insertAtK(Book head, int k, Book newBook){
        Book book = head;
        if (k == 0){
            return insertAtStart(head, newBook);
        }else{
            while(book != null && k-1 > 0){
                book = book.next;
                k--;
            }
            if (book != null) {
                newBook.next = book.next;
                if (book.next != null) {
                    book.next.prev = newBook;
                }
                book.next = newBook;
                newBook.prev = book;
            }
        }
        return head;
    }
    public Book removeById(Book book, int id){
        Book head = book;
        if(head == null){
            System.out.println("No book available");
        }else{
            while(head.next!=null){
                if(head.next.id == id){
                    head.next = head.next.next;
                    head.next.next.prev = head;
                }
            }
        }
        return book;
    }

    public  Book updateStatus(Book book, String title, Boolean available){
        if(book == null){
            System.out.println("No book List");
        }else{
            while(book!= null){
                if(book.title == title){
                    book.available = available;
                }
                book = book.next;
            }
        }
        return book;
    }

    public void display(Book book){
        Book head = book;
        int idx = 0;
        while(head!= null){
            idx +=1;
            System.out.println("Book Id: " +head.id);
            System.out.println("Book title: " + head.title);
            System.out.println("Book Author: " + head.author);
            System.out.println("Book genre: " + head.genre);
            System.out.println("Book Available: " + head.available);
            head = head.next;
            System.out.println();
        }
        System.out.println( "Total Book " + idx);
    }

    public void displayrev(Book book){
        Book head = book;
        while(head.next!= null){
            head = head.next;
        }
        while(head!= null){
            System.out.println("Book Id: " +head.id);
            System.out.println("Book title: " + head.title);
            System.out.println("Book Author: " + head.author);
            System.out.println("Book genre: " + head.genre);
            System.out.println("Book Available: " + head.available);
            head = head.prev;
            System.out.println();
        }
    }
}

public class LibrarymanagemnetSystem {
    public static void main(String[] args) {
        BookList list = new BookList();
    Book book = new Book(0, "0", "qwerty", "@/", true);
    list.insertAtStart(book, new Book(1,"1","qaz","polkm", false));
    list.insertAtStart(book, new Book(3,"3","qaz","polkm", false));
    list.insertAtStart(book, new Book(4,"4","qaz","polkm", false));
    list.insertAtEnd(book, new Book(10, "101", "poiuyt", "oikjmn", true));
    list.insertAtK(book, 2, new Book(2, "2", "null", "Fsgw", false));
    list.display(book);
    list.removeById(book, 2);
    list.displayrev(book);
    }
}
