public class premierStatus extends Passenger{
  public double price;
  public premierStatus(String nam){
    super(nam, "premier");
  }
  public String calcBagCost(){
    if (getnumCheckedBag()>2){
      price = (getnumCheckedBag()-2)*getcheckedBagFee();
    }
    else {
      price = 0.00;
    }
    return ("The number of checked bags is " + getnumCheckedBag() + " and the total cost of the checked bags is $" + price);
  }
}
      
    
    