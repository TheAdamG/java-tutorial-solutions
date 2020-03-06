import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

  public static List<String> reverseEachString(List<String> input) {
    return input.stream()
        .map(StringBuilder::new)
        .map(StringBuilder::reverse)
        .map(StringBuilder::toString)
        .collect(Collectors.toList());
  }

  private static String reverseString(String s) {
    return (new StringBuilder(s).reverse().toString());
  }

  public static List<String> reverseEachStringMonolithic(List<String> input) {
    return input.stream().map(Example::reverseString).collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input.stream()
        .filter(a -> Character.isDigit(a.charAt(0)))
        .map(a -> Character.getNumericValue(a.charAt(0)))
        .map(Math::sqrt)
        .collect(Collectors.toList());
  }

  private static double sqrtFirstDigit(String s) {
    return Math.sqrt(Character.getNumericValue(s.charAt(0)));
  }

  public static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
    return input.stream()
        .filter(a -> Character.isDigit(a.charAt(0)))
        .map(Example::sqrtFirstDigit)
        .collect(Collectors.toList());
  }

  public static List<Integer> concatenate(List<List<Integer>> lists) {
    return lists.stream().reduce(new ArrayList<>(), Example::concatTwoLists);
  }

  public static <E> List<E> concatTwoLists(List<E> x, List<E> y) {
    x.addAll(y);
    return x;
  }

  public static int findMin(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MAX_VALUE, Math::min);
  }

  public static int findMax(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MIN_VALUE, Math::max);
  }

  public static int findMinOrZero(List<Integer> numbers) {
    return numbers.stream().reduce(Math::min).orElse(0);
  }

  static int findMaxOrZero(List<Integer> numbers) {
    return numbers.stream().reduce(Math::max).orElse(0);
  }

  static int findMinOfMaxes(List<List<Integer>> listOfLists) {
    return findMin(listOfLists.stream().map(Example::findMax).collect(Collectors.toList()));
  }

  public static void main(String[] args) {
    List<Integer> test = new ArrayList<>();
    test.add(1);
    test.add(2);
    test.add(3);

    List<Integer> test1 = new ArrayList<>();
    test1.add(4);
    test1.add(5);
    test1.add(6);

    List<List<Integer>> listOfLists = new ArrayList<>();
    listOfLists.add(test);
    listOfLists.add(test1);

    System.out.println(findMinOrZero(new ArrayList<>()));
  }
}
