public class UnsupportedPushException extends UnsupportedOperationException {


  @Override
  public String toString() {
    return "You cannot push to a full stack";
  }
}
