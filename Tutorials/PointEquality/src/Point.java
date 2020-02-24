import java.util.Objects;

public class Point {

  protected final int x;
  protected final int y;
  protected final int z;

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

  @Override
  public boolean equals(Object that) {

    if (!(that instanceof Point)) {
      return false;
    }
    Point thatPoint = (Point) that;
    return this.x == thatPoint.x &&
        this.y == thatPoint.y &&
        this.z == thatPoint.z;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
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
