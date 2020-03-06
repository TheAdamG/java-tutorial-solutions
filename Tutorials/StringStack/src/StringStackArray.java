public class StringStackArray implements StringStack {

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

  public boolean isFull() {
    return stackPointer == 100;
  }


}
