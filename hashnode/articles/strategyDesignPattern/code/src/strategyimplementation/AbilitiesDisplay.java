package strategyimplementation;

public class AbilitiesDisplay {

  public static void main(String [] args) {
    showSuperheroAbility(new Superman());
    showSuperheroAbility(new Batman());
    showSuperheroAbility(new Robin());
    showSuperheroAbility(new Wonderwoman());
  }

  private static void showSuperheroAbility(Superhero superHero) {
    superHero.introduceMyself();
    superHero.punch();
    superHero.kick();
    superHero.performFly();
    superHero.becomeInvisible();
    System.out.println("________________");
  }
}