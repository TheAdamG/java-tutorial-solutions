import java.util.Random;

public class Fighter {

  protected final int skill;
  protected String name;
  protected String type;
  protected int stamina;
  public static final int DAMAGE = 2;

  public Fighter(String name, String type, int skill, int stamina) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
  }

  public void takeDamage(int damage) {
    stamina = Math.max(stamina - damage, 0);
  }

  public int calculateDamage() {
    return DAMAGE;
  }

  public int calculateAttackScore() {

    return skill + roleDice() + roleDice();
  }

  public boolean isDead() {
    return stamina <= 0;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return (name + " - " + type + " - " + "skill: " + skill + "; stamina: " + stamina);
  }

  protected int roleDice() {
    Random generator = new Random();
    return generator.nextInt(6) + 1;
  }
}
