public class Main {

  public static void main(String[] args) {
    StringStack src = new StringStackList();
    src.push("a");
    src.push("b");
    src.push("c");

    StringStack dst = new StringStackArray();
    dst.push("a1");

    Demo.transferStacks(dst, src);

    System.out.println(src.isEmpty());

    while (!dst.isEmpty()) {
      System.out.println(dst.pop());
    }

  }
}
