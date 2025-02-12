class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList {
    Movie head;
    Movie tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (position == 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newMovie.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        }
        temp.next = newMovie;
        newMovie.prev = temp;
    }

    public void removeByTitle(String title) {
        if (head == null) return;
        if (head.title.equals(title)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    public Movie searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Movie searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void updateRating(String title, double newRating) {
        Movie movie = searchByTitle(title);
        if (movie != null) {
            movie.rating = newRating;
        }
    }

    public Movie searchByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addAtEnd("Dilwale Dulhania Le Jayenge", "Aditya Chopra", 1995, 8.1);
        list.addAtEnd("Lagaan", "Ashutosh Gowariker", 2001, 8.1);
        list.addAtBeginning("Sholay", "Ramesh Sippy", 1975, 8.2);
        list.addAtPosition(1, "3 Idiots", "Rajkumar Hirani", 2009, 8.4);

        System.out.println("Movies displayed forward:");
        list.displayForward();

        list.updateRating("Lagaan", 8.3);
        System.out.println("After updating rating of Lagaan:");
        list.displayForward();

        list.removeByTitle("Dilwale Dulhania Le Jayenge");
        System.out.println("After removing Dilwale Dulhania Le Jayenge:");
        list.displayForward();

        System.out.println("Movies displayed in reverse order:");
        list.displayReverse();
    }
}
