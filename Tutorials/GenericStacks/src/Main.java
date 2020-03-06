public class Main {

  public static void main(String[] args) {
    GenericStack<String> src = new GenericStackList<>();
    src.push("a");
    src.push("b");
    src.push("c");

    GenericStack<String> dst = new GenericStackArray<>();
    dst.push("a1");

    Demo.transferStacks(dst, src);

    System.out.println(dst);
  }
}
