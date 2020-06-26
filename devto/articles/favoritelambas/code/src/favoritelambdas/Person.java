package favoritelambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
  private int age;
  private String name;

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isPersonCool() {
    return this.age > 40;
  }

  public static List<Person> createPersonList() {
    List<Person> personList = new ArrayList<>();

    personList.add(new Person(18, "Little person"));
    personList.add(new Person(25, "Young adult"));
    personList.add(new Person(33, "Responsible adult"));
    personList.add(new Person(45, "Almost grandfather"));
    personList.add(new Person(60, "Mein Opa"));

    return personList;
  }
}
