import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringStackList implements StringStack {

  private List<String> stack;
  private int stackPointer;

  public StringStackList() {
    this.stack = new LinkedList<>();
    this.stackPointer = 0;
  }


  @Override
  public void push(String s) {
    stack.add(s);
    stackPointer++;
  }

  @Override
  public String pop() {
    if (!isEmpty()) {
      return stack.remove(--stackPointer);
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }

}
