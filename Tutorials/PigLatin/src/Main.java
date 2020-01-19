import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// How are you on January 1st? I am fine, thanks.

public class Main {

  private static boolean isVowel(char c) {
    c = Character.toUpperCase(c);
    return new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U')).contains(c);
  }


  private static String toPigLatin(String word) {
    String ending = "ay";
    if (Character.isDigit(word.charAt(0))) {
      return word;
    }
    if (isVowel(word.charAt(0))) {
      ending = "way";
    }
    String firstChar = word.substring(1, 2);
    if (Character.isUpperCase(word.charAt(0))) {
      firstChar = firstChar.toUpperCase();
    }
    char lastChar = word.charAt(word.length() - 1);
    if (Character.isLetterOrDigit(lastChar)) {
      return firstChar + word.substring(2) + Character
          .toLowerCase(word.charAt(0)) + ending;
    }
    return firstChar + word.substring(2, word.length() - 2) + Character
        .toLowerCase(word.charAt(0)) + ending + lastChar;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String[] words = line.split(" ");
    StringBuilder finalWord = new StringBuilder();
    for (String word : words) {
      finalWord.append(toPigLatin(word)).append(" ");
    }
    System.out.println(finalWord);
  }

}
