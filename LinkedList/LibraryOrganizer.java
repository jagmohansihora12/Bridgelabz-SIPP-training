package LinkedList;

import java.util.*;

// BookShelf – Library Organizer (HashMap + Linked List)
// Story: In a library system, books are arranged based on genre and author. A HashMap maps
// genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or returned.
// Requirements:
// ● Maintain genre-wise catalog.
// ● Efficient insert, delete using LinkedList.
// ● Avoid duplication using HashSet.

public class LibraryOrganizer {
    private HashMap<String, LinkedList<Book>> genreCatalog;
    private HashSet<Book> bookInventory;

    public LibraryOrganizer() {
        genreCatalog = new HashMap<>();
        bookInventory = new HashSet<>();
    }

    static class Book {
        String title;
        String author;
        String genre;

        Book(String title, String author, String genre) {
            this.title = title;
            this.author = author;
            this.genre = genre;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return title.equals(book.title) && author.equals(book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author);
        }
    }

    public void addBook(String title, String author, String genre) {
        Book newBook = new Book(title, author, genre);
        if (bookInventory.add(newBook)) {
            genreCatalog.computeIfAbsent(genre, k -> new LinkedList<>()).add(newBook);
            System.out.println("Book added successfully: " + title);
        } else {
            System.out.println("Book already exists: " + title);
        }
    }

    public static void main(String[] args) {
        LibraryOrganizer library = new LibraryOrganizer();

        // Adding some sample books
        library.addBook("1984", "George Orwell", "Fiction");
        library.addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        library.addBook("Clean Code", "Robert Martin", "Technical");
        library.addBook("1984", "George Orwell", "Fiction"); // Duplicate entry

        // Display current catalog
        System.out.println("\nLibrary Catalog:");
        library.genreCatalog.forEach((genre, books) -> {
            System.out.println("\nGenre: " + genre);
            books.forEach(book -> System.out.println("- " + book.title + " by " + book.author));
        });
    }
}


