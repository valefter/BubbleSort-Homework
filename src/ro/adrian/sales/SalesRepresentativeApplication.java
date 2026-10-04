package ro.adrian.sales;

public class SalesRepresentativeApplication {

  public static void run() {

    SalesRepresentative[] salesRepresentatives = createRepresentatives();
    SalesRepresentativeSorter sorter = new SalesRepresentativeSorter();

    SalesRepresentative[] sortedRepresentatives = sorter.sort(salesRepresentatives);
    printRepresentatives(sortedRepresentatives);
  }

  private static SalesRepresentative[] createRepresentatives() {
    return new SalesRepresentative[] {
      new SalesRepresentative("John", 10, 500),
      new SalesRepresentative("Adi", 7, 800),
      new SalesRepresentative("Laura", 8, 600),
      new SalesRepresentative("Sophia", 5, 900),
      new SalesRepresentative("Matteo", 11, 400)
    };
  }

  private static void printRepresentatives(SalesRepresentative[] representatives) {
    for (SalesRepresentative representative : representatives) {
      System.out.println(representative);
    }
  }
}
