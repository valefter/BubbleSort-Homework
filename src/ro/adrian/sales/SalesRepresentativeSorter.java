package ro.adrian.sales;

public class SalesRepresentativeSorter {

  public SalesRepresentative[] sort(SalesRepresentative[] representatives) {

    SalesRepresentative temp;
    boolean swapped = false;

    for (int i = 0; i < representatives.length - 1; i++) {
      swapped = false;

      for (int j = 0; j < representatives.length - i - 1; j++) {

        int revenue = representatives[j].getSales() * representatives[j].getQuota();
        int adjacentRevenue = representatives[j + 1].getSales() * representatives[j + 1].getQuota();

        if (revenue < adjacentRevenue) {
          temp = representatives[j + 1];
          representatives[j + 1] = representatives[j];
          representatives[j] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        return representatives;
      }
    }

    return representatives;
  }
}
