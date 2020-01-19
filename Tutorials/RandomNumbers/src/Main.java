import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Set<Integer> numberSet = new HashSet<>();
    List<Integer> numberList = new ArrayList<>();
    int numIn = Integer.parseInt(args[0]);
    Random generator = new Random();
    while (numberSet.size() < numIn) {
      int value = generator.nextInt(numIn);
      numberSet.add(value);
      numberList.add(value);
    }

    System.out.println("Generating random numbers:");
    System.out.println(numberList);
    System.out.println("I had to generate " + numberList.size() + " numbers "
        + "between 0 and " + (numIn - 1) + " to have produced all such "
        + "numbers at least once.");
  }

}
