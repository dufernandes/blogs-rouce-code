package favoritelambdas;

public class Superhero {
  private int age;
  private String name;
  private String superPower;

  public Superhero(int age, String name, String superPower) {
    this.age = age;
    this.name = name;
    this.superPower = superPower;
  }

  @Override
  public String toString() {
    return "Superhero{" +
        "age=" + age +
        ", name='" + name + '\'' +
        ", superPower='" + superPower + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSuperPower() {
    return superPower;
  }

  public void setSuperPower(String superPower) {
    this.superPower = superPower;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
