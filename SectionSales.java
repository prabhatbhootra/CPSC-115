public class SectionSales{
  //Maintains information of all vendors in each section
  private String SectionName;
  private int maxVendors;
  private double snackSales = 0.00;
  private int index = 0;
  private int flag  = 0;
  public Vendor[] SectionList;
  public SectionSales(String sn, int m){
    SectionName = sn;
    maxVendors = m;
    SectionList = new Vendor[maxVendors];
    this.snackSales = snackSales;
  }
  public void addVendor(String name, int Snack, double price, int initialUnits){
    //Adds new vendor and vendor details to the section
    if(index < maxVendors){
      SectionList[index] = new Vendor(name, Snack, price, initialUnits);
      snackSales = snackSales + SectionList[index].TotalVendorSales;
      index = index + 1;
    } else{
      System.out.println("The maximum vendor limit has been reached.");
    }
    
  }
  public void vendorSale(String vendorname, int u){
    //Updates vendor units and vendor sales for a particular vendor in a section
    for (int i = 0; i < SectionList.length; i++){
      if (SectionList[i].getName() == vendorname){
        SectionList[i].sellSnack(u);
        flag = 1;
      }
    if (flag == 0){
      System.out.println("Vendor is not in list");
      }
    }
  }
  public void vendorRefill(String vname, int r){
    //Updates vendor units after a refill
    flag = 0;
    for (int i = 0; i < SectionList.length; i++){
      if (SectionList[i].name == vname){
        SectionList[i].refill(r);
        flag = 1;
      }
    if (flag == 0){
      System.out.println("Vendor is not in list");
      }
    }
  }
  public void displaySectionVendorData(){
    //Displays all vendor data for vendors in a section
    for(int i = 0; i < SectionList.length; i++){
      SectionList[i].displayVendorData();
    }
  }
  public void displaySectionAllTotals(){
    //Displays sales of each snack within a section
    System.out.println("Section Name: "  + SectionName);
    System.out.println("Total Sales of popcorn = " + SectionList[0].TotalSales[0]);
    System.out.println("Total Sales of peanuts = " + SectionList[0].TotalSales[1]);
    System.out.println("Total Sales of candy = " + SectionList[0].TotalSales[2]);
  }
  public void displaySectionSnackVendors(int d){
    //Displays section name and name/sales of all vendors in the section
    System.out.println("Section Name: "  + SectionName);
    for (int i = 0; i < SectionList.length; i++){
      if (d == SectionList[i].SnackNum){
        System.out.println("Vendor Name: " + SectionList[i].name);
        System.out.println("Vendor Sales = $" + SectionList[i].VendorSales);
      }
    }
  }
  public void displayAllSectionSnackTotals(int e){
    //Displays total sales of a particular snack in the section
    if (e == 1){
      SectionList[0].displaySnackTotals(1);
    } else if (e == 2){
      SectionList[0].displaySnackTotals(2);
    } else if (e == 3){
      SectionList[0].displaySnackTotals(3);
    }
  }
}
      
        
        
    
    
  
      
      