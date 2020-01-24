public class GameEngine {

  public static void simulateBattle(Fighter first, Fighter second) {
    int firstAttackScore = first.calculateAttackScore();
    int secondAttackScore = second.calculateAttackScore();

    String winnerName;
    String loserName;

    if (firstAttackScore > secondAttackScore) {
      second.takeDamage(first.calculateDamage());
      winnerName = first.getName();
      loserName = second.getName();
    } else if (secondAttackScore > firstAttackScore) {
      first.takeDamage(second.calculateDamage());
      winnerName = second.getName();
      loserName = first.getName();
    } else {
      System.out.println(first.getName() + " draws with " + second.getName());
      System.out.println("------------------------------");
      return;
    }

    System.out.println(winnerName + " hits " + loserName + ", stats are:");
    System.out.println(first);
    System.out.println(second);
    System.out.println("------------------------------");
  }
}
