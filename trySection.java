public class trySection{
  //tests all the methods of the Vendor and SectionSales classes
  public static void main(String argv[]){
    //Creates instances of objects and tests out all the methods
    Vendor v1 = new Vendor("John", 1, 5.00, 20);
    Vendor v = new Vendor("Johnny", 1, 3.75, 15);
    Vendor v2 = new Vendor("Alex", 2, 3.50, 50);
    Vendor v3 = new Vendor("Sue", 3, 4.00, 30);
    
    v1.sellSnack(20);
    v.sellSnack(10);
    v2.sellSnack(10);
    v3.sellSnack(40);
    
    v1.refill(5);
    v.refill(2);
    v2.refill(10);
    v3.refill(100);
    
    System.out.println("**********************");
    System.out.println(v1.getSales());
    System.out.println(v.getSales());
    System.out.println(v2.getSales());
    System.out.println(v3.getSales());
    System.out.println("**********************");
    System.out.println(v1.getName());
    System.out.println(v.getName());
    System.out.println(v2.getName());
    System.out.println(v3.getName());
    System.out.println("**********************");
    System.out.println(v1.getType());
    System.out.println(v.getType());
    System.out.println(v2.getType());
    System.out.println(v3.getType());

    v1.displayAllTotals();
    v.displayAllTotals();
    v2.displayAllTotals();
    v3.displayAllTotals();
    
    v1.displaySnackTotals(1);
    v.displaySnackTotals(1);
    v1.displaySnackTotals(2);
    v2.displaySnackTotals(2);
    v3.displaySnackTotals(3);
    
    System.out.println("**********************");
    v1.displayVendorData();
    System.out.println("**********************");
    v.displayVendorData();
    System.out.println("**********************");
    v2.displayVendorData();
    System.out.println("**********************");
    v3.displayVendorData();
    System.out.println("**********************");
    
    SectionSales s1 = new SectionSales("VIP", 5);
    SectionSales s2 = new SectionSales("Stand", 10);
    SectionSales s3 = new SectionSales("Seats", 10);
    
    s1.addVendor("Max", 1, 2.00, 20);
    s1.addVendor("John", 1, 5.00, 20);
    s1.addVendor("Johnny", 1, 3.75, 15);
    s1.addVendor("Alex", 2, 3.50, 50);
    s1.addVendor("Sue", 3, 4.00, 30);
    s1.addVendor("Will", 1, 5.00, 20);

    System.out.println("**********************");
    s1.displaySectionVendorData();
    System.out.println("**********************");
    
    s1.vendorSale("Johnny", 10);
    s1.vendorSale("Max", 20);
    s1.vendorSale("John", 15);
    s1.vendorSale("Will", 10);
    s1.vendorSale("Alex", 5);
    System.out.println("**********************");
    s1.vendorSale("Max", 12);
    s1.vendorSale("Alex", 10);
    s1.vendorSale("Sue", 5);
    
    System.out.println("**********************");
    s1.displaySectionVendorData();
    System.out.println("**********************");
    s1.displaySectionAllTotals();
    System.out.println("**********************");
    s1.displaySectionSnackVendors(1);
    System.out.println("**********************");

    s1.displayAllSectionSnackTotals(1);
    System.out.println("**********************");
      
   
  }
}
      
      
      
    