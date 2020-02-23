import java.util.List;

public class Artist {

  private String name;
  private List<Record> records;
  private Genre mainGenre;

  public Artist(String name, List<Record> records, Genre mainGenre) {
    this.name = name;
    this.records = records;
    this.mainGenre = mainGenre;
  }

  public void addRecord(String name) {
    records.add(new Record(name, mainGenre));
  }

  public void addRecord(String name, Genre genre) {
    records.add(new Record(name, genre));
  }

  public void showCatalogue() {
    for (Record record : records) {
      System.out.println(record);
    }
  }

  public void showGenre(Genre genre) {
    for (Record record : records) {
      if (record.getGenre() == genre) {
        System.out.println(record);
      }
    }
  }
}
