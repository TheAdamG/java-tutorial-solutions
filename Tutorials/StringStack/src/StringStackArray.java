import java.util.Iterator;

public class StringStackArray extends AbstractStringStack {

  private String[] stack;
  private int stackPointer;


  public StringStackArray() {
    this.stack = new String[100];
    this.stackPointer = 0;
  }

  @Override
  public void push(String s) {
    if (isFull()) {
      return;
    }
    stack[stackPointer++] = s;
  }

  @Override
  public String pop() {
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
  public StringStackIterator iterator() {
    return new StringStackIterator() {

      int iteratorPointer = 0;

      @Override
      public boolean hasNext() {
        return iteratorPointer != stackPointer;
      }

      @Override
      public String next() {
        return stack[iteratorPointer++];
      }
    };
  }

  private boolean isFull() {
    return stackPointer == 100;
  }

  @Override
  public String toString() {
    StringStackIterator iterator = iterator();
    StringBuilder stackString = new StringBuilder();
    while (iterator.hasNext()){
      stackString.append(iterator.next());
    }
    return stackString.toString();
  }



}
