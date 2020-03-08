public class ErrorDemo {

  public static void main(String[] args) {

    GenericStack<String> test = new GenericStackArray<>();
    test.push("a");
    test.pop();
    test.pop();
  }
}
