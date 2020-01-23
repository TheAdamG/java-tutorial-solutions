public class Main {

  public static void main(String[] args) {

    Fighter first = new Fighter("Joe", "Human Warrior", 16, 12);
    Fighter second = new Fighter("Alex", "Elf Lord", 18, 6);

    System.out.println("At start if battle, stats are: ");
    System.out.println(first);
    System.out.println(second);

    while (first.getStamina() > 0 && second.getStamina() > 0) {
      GameEngine.simulateBattle(first, second);
    }
  }
}
