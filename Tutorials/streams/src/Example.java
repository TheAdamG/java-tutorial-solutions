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

  public static void main(String[] args) {
    List<String> test = new ArrayList<>();
    test.add("1aaa");
    test.add("cccc");
    test.add("4bbb");

    System.out.println(sqrtsOfFirstDigitsMonolithic(test));
  }
}
