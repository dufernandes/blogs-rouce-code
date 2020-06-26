package favoritelambdas;

import java.util.List;
import java.util.stream.Collectors;

public class MapList {

  public static void transformIntoSuperhero() {
    List<Person> personList = Person.createPersonList();

    List<Superhero> superheroes = personList
        .stream()
        .map(person -> new Superhero(person.getAge(), person.getName(), "fly")).collect(
        Collectors.toList());

    PrintHelper.printListInOneLine("Map ordinary people to superheroes",  superheroes);
  }

}
