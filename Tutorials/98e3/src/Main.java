public class Main {


  private static int next(int x) {
    if (x % 2 == 0) {
      return x / 2;
    }
    return 3 * x + 1;
  }

  public static void main(String[] args) {
    int value = Integer.parseInt(args[0]);
    while (value != 1) {
      System.out.println(value);
      value = next(value);
    }
    System.out.println(1);
  }

}
