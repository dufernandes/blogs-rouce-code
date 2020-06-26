package favoritelambdas;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class GatheringData {

  public static void sumIntsUsingIntStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int sumResult = integers.stream().mapToInt(Integer::intValue).sum();
    PrintHelper.printValue("Sum ints using IntStream.sum()", sumResult);
  }

  public static void sumIntsUsingStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int sumResult = integers.stream().mapToInt(Integer::valueOf).sum();
    PrintHelper.printValue("Sum ints using Stream.sum()", sumResult);
  }

  public static void sumIntsUsingReduce() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int sumResult = integers.stream().reduce(0, (a, b) -> a + b);
    PrintHelper.printValue("Sum ints using reduce()", sumResult);
  }

  public static void calculateMeanIntsUsingIntStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    OptionalDouble meanResult = integers.stream().mapToInt(Integer::intValue).average();
    PrintHelper.printValue("Mean of ints using IntStream.sum()", meanResult.getAsDouble());
  }

  public static void calculateMeanIntsUsingStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    OptionalDouble meanResult = integers.stream().mapToInt(Integer::valueOf).average();
    PrintHelper.printValue("Mean of ints using Stream.sum()", meanResult.getAsDouble());
  }

  public static void calculateMaxIntsUsingStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    OptionalInt maxResult = integers.stream().mapToInt(Integer::valueOf).max();
    PrintHelper.printValue("Max of ints using Stream.sum()", maxResult.getAsInt());
  }

  public static void calculateMinIntsUsingStreamSum() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    OptionalInt minResult = integers.stream().mapToInt(Integer::valueOf).min();
    PrintHelper.printValue("Min of ints using Stream.sum()", minResult.getAsInt());
  }

}
