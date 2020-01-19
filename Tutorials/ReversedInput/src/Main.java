import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

  public static void main(String[] args) throws IOException {
    Deque<String> myDeque = new ArrayDeque<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    while (line != null && !line.equals("")) {
      myDeque.push(line);
      line = br.readLine();
    }

    while (myDeque.size() > 0) {
      System.out.println(myDeque.pop());
    }

  }
}
