public class Demo {

  public static <E> void transferStacks(GenericStack<E> dst, GenericStack<E> src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }


}
