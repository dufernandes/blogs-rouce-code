package favoritelambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {

  public static void filterIntegers() {
    List<Integer> ints = Arrays.asList(12, 32, 1, 3, 5, 3, 10, 8, 100);

    List<Integer> filteredElements = ints.stream().filter(element -> element > 10)
        .collect(Collectors.toList());

    PrintHelper.printListInOneLine("Filter Integers higher than 10:", filteredElements);
  }

  public static void filterPeopleByAge() {
    List<Person> peopleList = Person.createPersonList();

    List<Person>
        filteredPersonList =
        peopleList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

    PrintHelper.printListInOneLine("Filter people older than 30:", filteredPersonList);
  }

  public static void filterPeopleByCoolness() {
    List<Person> peopleList = Person.createPersonList();

    List<Person>
        filteredPersonList =
        peopleList.stream().filter(Person::isPersonCool).collect(Collectors.toList());

    PrintHelper.printListInOneLine("Filter by cool people:", filteredPersonList);
  }

}
