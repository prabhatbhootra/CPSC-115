public class tryampmClock{
  public static void main(String args[]){
    ampmClock clock1;
    ampmClock clock2;
    ampmClock clock3;
    clock1 = new ampmClock(23, 59, "pm");
    clock2 = new ampmClock(11, 59, "am");
    clock3 = new ampmClock(07, 42, "am");
    System.out.println(clock1.getampmTime());
    clock1.incmins();
    System.out.println(clock1.getampmTime());
    System.out.println(clock2.getampmTime());
    clock2.incmins();
    System.out.println(clock2.getampmTime());
    System.out.println(clock3.getampmTime());
    clock3.incmins();
    System.out.println(clock3.getampmTime());
  }
}