package ro.adrian.sales;

public class SalesRepresentative {

  private String name;
  private int sales;
  private int quota;

  public SalesRepresentative(String name, int sales, int quota) {
    this.name = name;
    this.sales = sales;
    this.quota = quota;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSales() {
    return sales;
  }

  public void setSales(int sales) {
    this.sales = sales;
  }

  public int getQuota() {
    return quota;
  }

  public void setQuota(int quota) {
    this.quota = quota;
  }

  @Override
  public String toString() {
    return String.format(
        "%s has %d sales with a quota of %d$ and achieved %d$ worth of sales",
        name, sales, quota, sales * quota);
  }
}
