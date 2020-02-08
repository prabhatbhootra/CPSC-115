public abstract class Passenger{
  private String name;
  private String passStatus;
  private int numCheckedBags = 0;
  private final double checkedBagFee = 50.00;
  private final int maxBags = 4;
  public Passenger(String n, String p){
    name = n;
    passStatus = p;
  }
  public String addBags(int a){
    if ((numCheckedBags+a)<=maxBags){
      numCheckedBags = numCheckedBags + a;
      return("Transaction was successful. Current number of checked bags = " + numCheckedBags);
    } else {
      return("Transaction not succesful. Maximum bag limit reached.");
      }
  }
  public void getPassInfo(){
    System.out.println("Passenger Name: " + name);
    System.out.println("Passenger Status: " + passStatus);
  }
  public int getnumCheckedBag(){
    return numCheckedBags;
  }
  public double getcheckedBagFee(){
    return checkedBagFee;
  }
  public abstract String calcBagCost();
  
}
  
    
    
          
      
      
    