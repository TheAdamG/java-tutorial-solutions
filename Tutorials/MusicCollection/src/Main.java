import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Artist a = new Artist("a", new ArrayList<>(), Genre.pop);

    a.addRecord("test");
    a.addRecord("test1", Genre.jazz);

    a.showCatalogue();
    a.showGenre(Genre.jazz);

  }
}
