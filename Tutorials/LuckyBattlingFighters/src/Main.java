public class Main {

  public static void main(String[] args) {

    Fighter first = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12, Strategy.AGGRESSIVE);
    Fighter second = new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, Strategy.DEFENSIVE);

    System.out.println("At start if battle, stats are: ");
    System.out.println(first);
    System.out.println(second);

    GameEngine.simulateBattle(first, second);

  }
}
