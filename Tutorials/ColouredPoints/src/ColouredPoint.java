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
  public String toString() {
    return super.toString() + " Colour: (" + red + ", " + green + ", " + blue + ")";
  }
}
