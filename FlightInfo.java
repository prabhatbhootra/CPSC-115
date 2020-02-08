public class FlightInfo{
  public static void main(String argv[]){
    checkInClass c1 = new checkInClass();
    premierStatus ps1 = new premierStatus("Sue Smith");
    System.out.println(ps1.addBags(4));
    c1.printCheckedBagReceipt(ps1);
    System.out.println("***********************************");
    standardStatus ss1 = new standardStatus("Sally Summers");
    System.out.println(ss1.addBags(3));
    c1.printCheckedBagReceipt(ss1);
    System.out.println("***********************************");
    premierStatus ps2 = new premierStatus("Tom Traveler");
    System.out.println(ps2.addBags(5));
    c1.printCheckedBagReceipt(ps2);
    System.out.println("************************************");
  }
}