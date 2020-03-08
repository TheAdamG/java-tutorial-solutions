public class A {

  private int id;
  static int numCollected = 0;

  public A(int id) {
    this.id = id;
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println(id + " Has been garbage collected");
    numCollected++;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 1_000_000; i++) {
      new A(i);
    }
    System.out.println(numCollected);
  }
}
