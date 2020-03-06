public abstract class AbstractStringStack implements StringStack {

  @Override
  public abstract void push(String s);

  @Override
  public abstract String pop();

  @Override
  public abstract boolean isEmpty();

  @Override
  public abstract StringStackIterator iterator();

  @Override
  public String toString() {
    StringStackIterator iterator = iterator();
    StringBuilder stackString = new StringBuilder();
    while (iterator.hasNext()){
      stackString.append(iterator.next()).append(", ");
    }
    return stackString.toString();
  }

}
