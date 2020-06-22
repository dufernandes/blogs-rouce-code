package naiveimplementation;

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
    superHero.fly();
    System.out.println("________________");
  }
}