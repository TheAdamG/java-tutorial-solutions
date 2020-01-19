import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    Random generator = new Random();

    while (numbers.size() <= 7) {
      numbers.add(generator.nextInt(49) + 1);
    }
    Object[] numArray = numbers.toArray();

    for (int i = 1; i <= 7; i++) {
      if (i == 7) {
        System.out.println("Bonus Number: " + numArray[i]);
      } else {
        System.out.println("Number " + i + ": " + numArray[i]);
      }
    }
  }


}
