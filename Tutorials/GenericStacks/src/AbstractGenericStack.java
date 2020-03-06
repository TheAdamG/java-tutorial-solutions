public abstract class AbstractGenericStack<E> implements GenericStack<E> {

  @Override
  public abstract void push(E s);

  @Override
  public abstract E pop();

  @Override
  public abstract boolean isEmpty();

  @Override
  public abstract GenericStackIterator<E> iterator();

  @Override
  public String toString() {
    GenericStackIterator iterator = iterator();
    StringBuilder stackString = new StringBuilder();
    while (iterator.hasNext()){
      stackString.append(iterator.next()).append(", ");
    }
    return stackString.toString();
  }

}
