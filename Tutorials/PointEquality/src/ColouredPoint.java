import java.util.Objects;

public class ColouredPoint extends Point {

  private int red;
  private int green;
  private int blue;

  public ColouredPoint(int x, int y, int z, int red, int green, int blue) {
    super(x, y, z);
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  @Override
  public boolean equals(Object that) {

    if (!(that instanceof ColouredPoint)) {
      return false;
    }
    ColouredPoint thatPoint = (ColouredPoint) that;
    return this.x == thatPoint.x &&
        this.y == thatPoint.y &&
        this.z == thatPoint.z &&
        this.red == thatPoint.red &&
        this.blue == thatPoint.blue &&
        this.green == thatPoint.green;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z, red, green, blue);
  }

  @Override
  public String toString() {
    return super.toString() + " Colour: (" + red + ", " + green + ", " + blue + ")";
  }
}
