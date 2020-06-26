package strategyimplementation;

public class InvisibilityPossible implements InvisibilityAbility {
  @Override
  public void becomeInvisible() {
    System.out.println("I am invisible!");
  }
}
