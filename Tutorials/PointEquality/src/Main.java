public class Main {

  public static void main(String[] args) {
    Point p1 = new Point(5, 5, 5);
    Point p2 = new Point(5, 5,5);
    Point p3 = new Point(1, 1, 1);

    System.out.println(p1.equals(p2)); //true
    System.out.println(p2.equals(p1)); //true
    System.out.println(p3.equals(p1)); //false

    ColouredPoint p4 = new ColouredPoint(5, 5,5, 5, 5, 5);
    ColouredPoint p5 = new ColouredPoint(5, 5,5, 1, 1, 1);

    System.out.println(p1.equals(p4));// True
    System.out.println(p4.equals(p1)); // False (Not symmetric cause of casting)

    System.out.println(p5.equals(p4)); // False
    System.out.println(p4.equals(p5)); // False

  }
}
