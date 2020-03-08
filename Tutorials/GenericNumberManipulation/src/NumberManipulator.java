import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NumberManipulator {

  public static <T extends Number> Set<T> readNumber(int n, NumberParser<T> np) throws IOException {
    System.out.println("Please enter numbers of type: " + np.typeParsed());
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);

    Set<T> outSet = new HashSet<>();

    for (int i = 0; i < n; i++) {
      String line = br.readLine();
      outSet.add((np.parseNumber(line)));
    }
    return outSet;
  }

  public static <T extends Number> T addNumbers(Set<T> numbers, NumberAdder<T> np) {
    return numbers.stream().reduce(np.zero(), np::add);
  }

  public static <T extends Number> void displayAsDoubles(Set<T> numbers) {
    for (Number number : numbers) {
      System.out.println(number.doubleValue());
    }
  }

  public static <T extends Number> void displayAsInts(Set<T> numbers) {
    for (Number number : numbers) {
      System.out.println(number.intValue());
    }
  }


  public static void main(String[] args) throws IOException {
    Set<Integer> intSet = readNumber(5, new IntegerParser());
    System.out.println(addNumbers(intSet, new IntegerAdder()));
    displayAsDoubles(intSet);


  }
}
