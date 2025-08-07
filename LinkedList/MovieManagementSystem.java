package LinkedList;

class Movie{
    String title;
    String director;
    int year;
    double rating;
    Movie next , prev;

    public  Movie(String title, String director, int year, double rating){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MoviesList{   
    public Movie insertAtStart(Movie movie, Movie node) {
        if (movie == null) {
            return node;
        }
        node.next = movie;
        movie.prev = node;
        return node;
    }

    public Movie insertAtEnd(Movie movie, Movie node){
        Movie head = movie;
        if(head == null){
            insertAtStart(movie, node);
        }else{
            while(head.next!= null){
                head = head.next ;
            }
            head.next = node;
            head.next.prev = head;
        }
        return movie;    
    }

    public Movie insertAtK(Movie movie, int k, Movie node){
        Movie head = movie;
        if(k == 0){
            insertAtEnd(movie, node);
        }else{
            while(head!= null && k-1>0){
                head = head.next;
                k--;
            }
            node.next = head.next;
            head.next.prev= node;
            head.next = node;
            node.prev = head;

        }
        return head;
    }
    
    public Movie removeMovie(Movie movie, String title){
        Movie head = movie;
        while(head.next!= null){
            if( head.next.title == title){
                break;
            }
            head = head.next;
        }
        head.next = head.next.next;
        head.next.next.prev = head;
        return head;
    }

    public Movie Update(Movie movie, String title, double rating){
        Movie head = movie;
        while(head!=null){
            if(head.title == title){
                head.rating =rating;
            }
            head = head.next;
        }
        return head;
    }

    public void display(Movie head){
        Movie movie  = head;
        if(movie == null){
            System.out.println("Empty list");
        }

        while(movie!= null){
            System.out.println("Title-> "+movie.title);
            System.out.println("Director-> "+movie.director);
            System.out.println("Year-> "+movie.year);
            System.out.println("Rating-> "+movie.rating);
            movie = movie.next;
            System.out.println();
        }
        System.out.println();
    }

    public void displayrev(Movie movie){
        Movie head = movie;
        while(head.next!=null){
            head = head.next;
        }

        while(head != null){
            System.out.println("Title-> "+head.title);
            System.out.println("Director-> "+head.director);
            System.out.println("Year-> "+head.year);
            System.out.println("Rating-> "+head.rating);
            head = head.prev;
            System.out.println();
        }
        System.out.println();
    }

}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MoviesList movielist = new MoviesList();
        Movie movie = new Movie("ABC", "ABCD", 2024, 6.8);
        movie.next = new Movie("KLM", "KLMN", 2012, 8.9);
        movie.next.prev = movie;
        movie.next.next = new Movie("MNO", "MNOP", 2022, 7.5);
        movie.next.next.prev = movie.next;
        movie = movielist.insertAtStart(movie, new Movie("DEF", "DEFG", 2025, 4.8));
        
        movielist.insertAtEnd(movie, new Movie("PQR", "PQRS", 2000, 6.5));
        movielist.insertAtK(movie,2, new Movie("QWER", "QWERTY", 1999, 9.9));
        movielist.display(movie);
        System.out.println("-------------------------");
        movielist.removeMovie(movie, "QWER");
        movielist.Update(movie, "MNO", 4.9);
        movielist.displayrev(movie);


    }
    
}
