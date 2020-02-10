public class Vendor{
  //Creates Vendor
  public String name;
  public int SnackNum;
  private double price;
  private int Units;
  public double VendorSales;
  public static double TotalVendorSales;
  public static double[] TotalSales;
  public Vendor(String n, int s, double p, int u){
    name = n;
    SnackNum = s;
    price = p;
    Units = u;
    VendorSales = 0.00;
    TotalVendorSales = 0.00;
    TotalSales = new double[3];
    TotalSales[0] = 0.00;
    TotalSales[1] = 0.00;
    TotalSales[2] = 0.00;
  }
  public void sellSnack(int a){
    //Updates units sold and calculates sales from selling of snacks
    if (a>Units){
      System.out.println("There are not enough snacks to sell.");
    } else{
      Units = Units - a;
      VendorSales = VendorSales + (price*a);
      TotalVendorSales = TotalVendorSales + VendorSales;
      if (SnackNum == 1){
        TotalSales[0] = TotalSales[0] + (price*a);
      } else if (SnackNum == 2){
        TotalSales[1] = TotalSales[1] + (price*a);
      } else if (SnackNum == 3){
        TotalSales[2] = TotalSales[2] + (price*a);
      }
    }
  }
  public void refill(int b){
    //Adds refill units to vendor's units
    Units = Units + b;
  }
  public double getSales(){
    //returns sales of a vendor
    return VendorSales;
  }
  public String getName(){
    //returns name of vendor
    return name;
  }
  public int getType(){
    //returns integer representing snack sold by vendor
    return SnackNum;
  }
  public void displayAllTotals(){
    //Displays total sales from all Vendors and all snacks
    System.out.println("Total sales for all vendors and all Snacks= $" + TotalVendorSales);
  }
  public void displaySnackTotals(int c){
    //Displays total sales of each snack
    if (c == 1){
      System.out.println("Total popcorn sales= $" + TotalSales[0]);
    } else if (c == 2){
      System.out.println("Total peanuts sales= $" + TotalSales[1]);
    } else if (c == 3){
      System.out.println("Total candy sales= $" + TotalSales[2]);
    }
  }
  public void displayVendorData(){
    //Displays information about a vendor
    System.out.println("Vendor's name: " + name);
    if (SnackNum == 1){
        System.out.println("Vendor Snack is popcorn.");
      } else if (SnackNum == 2){
        System.out.println("Vendor Snack is peanuts.");
      } else if (SnackNum == 3){
        System.out.println("Vendor Snack is candy.");
      }
      System.out.println("Units of Snack sold = " + (VendorSales/price));
    System.out.println("Total dollar value of sales = $" + VendorSales);
  }
}
      
    
    
        
    
    