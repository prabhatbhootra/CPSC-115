public class standardStatus extends Passenger{
  public double price;
  public standardStatus(String nam){
    super(nam, "standard");
  }
  public String calcBagCost(){
    price = (getnumCheckedBag()*getcheckedBagFee());
    return ("The number of checked bags is " + getnumCheckedBag() + " and the total cost of the checked bags is $" + price);
  }
}
  