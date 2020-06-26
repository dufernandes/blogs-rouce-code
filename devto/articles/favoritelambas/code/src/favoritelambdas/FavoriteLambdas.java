package favoritelambdas;

public class FavoriteLambdas {

  public static void main(String[] args) {
    FilterList.filterIntegers();
    FilterList.filterPeopleByAge();
    FilterList.filterPeopleByCoolness();
    MapList.transformIntoSuperhero();
    FilterAndMap.filterByCoolnessAndTransformIntoSuperheroes();
    GatheringData.sumIntsUsingIntStreamSum();
    GatheringData.sumIntsUsingStreamSum();
    GatheringData.sumIntsUsingReduce();
    GatheringData.calculateMeanIntsUsingIntStreamSum();
    GatheringData.calculateMeanIntsUsingStreamSum();
    GatheringData.calculateMaxIntsUsingStreamSum();
    GatheringData.calculateMinIntsUsingStreamSum();
    FilterMapGather.filterByCoolnessTransformIntoSuperheroCalculageAgeAverage();
  }
}
