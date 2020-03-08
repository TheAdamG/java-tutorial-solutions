public class UnsupportedPopException extends UnsupportedOperationException {

  @Override
  public String toString() {
    return "You cannot pop an empty stack";
  }
}
