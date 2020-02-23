public class Point {

  private final int x;
  private final int y;
  private final int z;

  public Point(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double distanceBetween(Point other) {
    return Math.sqrt(
        Math.pow(this.x - other.x, 2)
            + Math.pow(this.y - other.y, 2)
            + Math.pow(this.y - other.y, 2));
  }

  public double magnitude() {
    return distanceBetween(origin());
  }

  public static Point origin() {
    return new Point(0, 0, 0);
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }
}
