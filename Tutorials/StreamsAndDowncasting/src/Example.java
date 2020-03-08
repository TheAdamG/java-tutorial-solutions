import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

  public static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
    return numbers.filter(x -> x instanceof Integer).map(x -> (Integer) x).filter(x -> x > 0);
  }

  public static void main(String[] args) {

    List<Number> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(-5);
    numbers.add(0.5);
    numbers.add((short) 3);
    numbers.add(12);
    numbers.add(6.45454f);

    System.out.println("Positive integers from " + numbers + " are: "
        + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));
  }


  public static Stream<Integer> restrictToPositiveIntegersBoundedWildcard(Stream<? extends Number> numbers) {
    return numbers.filter(x -> x instanceof Integer).map(x -> (Integer) x).filter(x -> x > 0);
  }


}
