import java.util.LinkedList;
import java.util.List;

public class GenericStackList<E> extends AbstractGenericStack<E> {

  private List<E> stack;
  private int stackPointer;

  public GenericStackList() {
    this.stack = new LinkedList<>();
    this.stackPointer = 0;
  }


  @Override
  public void push(E s) {
    stack.add(s);
    stackPointer++;
  }

  @Override
  public E pop() {
    if (!isEmpty()) {
      return stack.remove(--stackPointer);
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }


  @Override
  public GenericStackIterator<E> iterator() {
    return new GenericStackIterator<>() {

      int iteratorPointer = 0;

      @Override
      public boolean hasNext() {
        return  iteratorPointer != stackPointer;
      }

      @Override
      public E next() {
        return stack.get(iteratorPointer++);
      }
    };
  }


}
