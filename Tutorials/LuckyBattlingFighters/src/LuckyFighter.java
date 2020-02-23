public class LuckyFighter extends Fighter {

  private int luck;
  private Strategy strategy;

  public LuckyFighter(
      String name, String type, int skill, int stamina, int luck, Strategy strategy) {
    super(name, type, skill, stamina);
    this.luck = luck;
    this.strategy = strategy;
  }

  @Override
  public void takeDamage(int damage) {
    if (strategy.getDefensive() < roleDice()) {
      System.out.println(getName() + " tries to resist damage...");
      if (isLucky()) {
        damage--;
      } else {
        damage++;
      }
    }
    stamina = Math.max(stamina - damage, 0);
  }

  @Override
  public int calculateDamage() {
    if (strategy.getAggressive() < roleDice()) {
      System.out.println(getName() + " goes for an aggressive hit...");
      if (isLucky()) {
        return DAMAGE * 2;
      }
      return DAMAGE - 1;
    }
    return DAMAGE;
  }

  @Override
  public int calculateAttackScore() {
    return skill + roleDice() + roleDice();
  }

  private boolean isLucky() {
    System.out.println(getName() + " tests luck...");
    if (luck > 0) {
      luck--;
    }
    boolean luckTest = roleDice() + roleDice() <= luck;
    if (luckTest) {
      System.out.println(getName() + " is lucky!");
    } else {
      System.out.println(getName() + " is unlucky!");
    }
    return luckTest;
  }

  @Override
  public String toString() {
    return (name + " - " + strategy + " " + type + " - " + "skill: " + skill + "; stamina: " + stamina);
  }

}
