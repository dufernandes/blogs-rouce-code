package strategyimplementation;

public class InvisibilityImpossible implements InvisibilityAbility {
  @Override
  public void becomeInvisible() {
    System.out.println("I cannot be invisible!!");
  }
}
