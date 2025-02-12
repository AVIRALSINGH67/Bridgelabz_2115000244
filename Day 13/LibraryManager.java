class Book {
    String title, author, genre;
    int id;
    boolean isAvailable;
    Book next, prev;

    Book(int id, String title, String author, String genre, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = this.prev = null;
    }
}

class Library {
    private Book head = null, tail = null;

    void addBookAtBeginning(int id, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(id, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
            return;
        }
        newBook.next = head;
        head.prev = newBook;
        head = newBook;
    }

    void addBookAtEnd(int id, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(id, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
            return;
        }
        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }

    void addBookAtPosition(int id, String title, String author, String genre, boolean isAvailable, int position) {
        if (position <= 1) {
            addBookAtBeginning(id, title, author, genre, isAvailable);
            return;
        }
        Book newBook = new Book(id, title, author, genre, isAvailable);
        Book temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            addBookAtEnd(id, title, author, genre, isAvailable);
            return;
        }
        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
    }

    void removeBookById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Book temp = head;
        while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) return;
        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    void searchBookByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + (temp.isAvailable ? "Available" : "Not Available"));
                return;
            }
            temp = temp.next;
        }
    }

    void searchBookByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + (temp.isAvailable ? "Available" : "Not Available"));
            }
            temp = temp.next;
        }
    }

    void updateAvailabilityStatus(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.next;
        }
    }

    void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.prev;
        }
    }

    void countTotalBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }
}

public class LibraryManager {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBookAtEnd(1, "Book One", "Author A", "Fiction", true);
        library.addBookAtEnd(2, "Book Two", "Author B", "Science", false);
        library.addBookAtBeginning(3, "Book Three", "Author A", "Mystery", true);
        library.displayBooksForward();
        library.countTotalBooks();
        library.searchBookByAuthor("Author A");
        library.updateAvailabilityStatus(1, false);
        library.displayBooksReverse();
        library.removeBookById(2);
        library.displayBooksForward();
    }
}
