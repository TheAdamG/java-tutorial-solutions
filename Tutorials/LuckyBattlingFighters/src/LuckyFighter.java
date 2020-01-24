public class LuckyFighter extends Fighter {

  private int luck;

  public LuckyFighter(String name, String type, int skill, int stamina,
      int luck) {
    super(name, type, skill, stamina);
    this.luck = luck;

  }
}
