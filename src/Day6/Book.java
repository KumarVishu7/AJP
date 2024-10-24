package Day6;
import java.util.ArrayList;


class Books {
    private int bookId;
    private String bookName;
    private String authorName;


    public Books(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }


    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // Overriding toString() method to display book details
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName;
    }
}

public class Book {
    public static void main(String[] args) {

        ArrayList<Books> bookList = new ArrayList<>();

       /* bookList.add(new Books(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Books(2, "1984", "George Orwell"));
        bookList.add(new Books(3, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Books(4, "The Catcher in the Rye", "J.D. Salinger"));*/

        for (Books book : bookList) {
            System.out.println(book);
        }
    }
}
