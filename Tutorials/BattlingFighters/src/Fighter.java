import java.util.Random;

public class Fighter {

  private final int skill;
  private String name;
  private String type;
  private int stamina;

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
    return 2;
  }

  public int calculateAttackScore() {
    Random generator = new Random();
    return skill + generator.nextInt(6) + generator.nextInt(6) + 2;
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
}
