import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    StringBuilder text = new StringBuilder();
    while (line != null && !line.equals("")) {
      text.append(line).append('\n');
      line = br.readLine();
    }
    String textString = text.toString();
    int charCount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (Character.isLetterOrDigit(text.charAt(i))) {
        charCount++;
      }
    }

    System.out.println("Lines: " + textString.split("\n").length);
    System.out.println("Words: " + textString.split("[-\n ]").length);
    System.out.println("Characters: " + charCount);

  }


}


 /*
  People love me at parties
  when they ask me "Oh, you are a computer guy?
  Can you fix my laptop?
  And I respond...
  "Computer Science is no more about computers
  than astronomy is about telescopes"
  */