public class GenericStackArray<E> extends AbstractGenericStack<E> {

  private E[] stack;
  private int stackPointer;

  @SuppressWarnings("unchecked")
  public GenericStackArray() {
    this.stack = (E[]) new Object[100];
    this.stackPointer = 0;
  }

  @Override
  public void push(E s) {
    if (isFull()) {
      return;
    }
    stack[stackPointer++] = s;
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      return null;
    }
    return stack[--stackPointer];
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }

  @Override
  public GenericStackIterator<E> iterator() {
    return new GenericStackIterator<>() {

      int iteratorPointer = 0;

      @Override
      public boolean hasNext() {
        return iteratorPointer != stackPointer;
      }

      @Override
      public E next() {
        return stack[iteratorPointer++];
      }
    };
  }

  private boolean isFull() {
    return stackPointer == 100;
  }

}
