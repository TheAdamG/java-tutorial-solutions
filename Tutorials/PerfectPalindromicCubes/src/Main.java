public class Main {

  private static boolean isPalindrome(int value) {
    String stringValue = String.valueOf(value);
    int len = stringValue.length();
    boolean palindromeFlag = true;
    for (int i = 0; i <= len / 2; i++) {
      if (stringValue.charAt(i) != stringValue.charAt(len - i - 1)) {
        palindromeFlag = false;
        break;
      }
    }
    return palindromeFlag;
  }

  public static void main(String[] args) {

    for (int i = 0; i <= 1500; i++) {
      int cube = (int) (Math.pow(i, 3));
      if (isPalindrome(cube)) {
        System.out.println(i + " cubed is " + cube);
      }
    }
  }

}
