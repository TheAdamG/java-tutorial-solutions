import java.util.LinkedList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List<Book> books = new LinkedList<>();
    books.add(new Book("1", "a", 0));
    books.add(new Dictionary("2", "b", 0, "English", "Spanish", 0));
    books.add(new Book("3", "c", 0));
    books.add(new Dictionary("6", "F", 0, "English", "Spanish", 0));


    Bookshelf bookshelf = new Bookshelf(books);
    //bookshelf.printLeftToRight();
    //bookshelf.printRightToLeft();

    bookshelf.addBook(3, new Book("4", "d", 0));
    //bookshelf.printLeftToRight();
    bookshelf.addBook(5, new Book("5", "e", 0));

    //bookshelf.remove(1);
    bookshelf.printLeftToRight();

    rearrange(bookshelf);
    bookshelf.printLeftToRight();
  }

  public static void rearrange(Bookshelf bs) {
    int size = bs.size();
    for (int i = 0; i < size; i++) {
      Book currentBook = bs.remove(i);
      if (currentBook instanceof Dictionary) {
        bs.addBookOnRightSide(currentBook);
      } else {
        bs.addBook(i, currentBook);
      }
    }
  }

}
