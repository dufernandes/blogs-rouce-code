package favoritelambdas;

import java.util.Arrays;
import java.util.List;

public class GatheringData {

  public static void sumIntsUsingIntStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int sumResult = integers.stream().mapToInt(Integer::intValue).sum();
    printValue("Sum ints using IntStream.sum()", sumResult);
  }

  public static void sumIntsUsingStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int sumResult = integers.stream().mapToInt(Integer::valueOf).sum();
    printValue("Sum ints using Stream.sum()", sumResult);
  }

  public static void sumIntsUsingReduce() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int sumResult = integers.stream().reduce(0, (a, b) -> a + b);
    printValue("Sum ints using reduce()", sumResult);
  }

  private static <T> void printValue(String title, T value) {
    System.out.println(title + " " + value);
  }
}
