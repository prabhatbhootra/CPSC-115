/**
 * File: CreditCard.java
 *
 * Class implementing very simple credit cards.
 * @author Prabhat Bhootra
 * @author Roberto Tamassia
 * @author Michael Goodrich
 * @author Michael H. Goldwasser
 * @see String
 */

public class CreditCard {

  // Instance variables:
  private String customer;
  private String bank;
  private String account;
  private int limit;
  protected double balance;

  // Constructors:
  public CreditCard(String cust, String bk, String acnt, int lim, 
                    double initialBal) {
    customer = cust;
    bank = bk;
    account = acnt;
    limit = lim;
    balance = initialBal; 
  }
  public CreditCard(String cust, String bk, String acnt, int lim) {
    this(cust, bk, acnt, lim, 0.0);
  }

  // Accessor methods:
  public String getCustomer() { return customer; }
  public String getBank() { return bank; }
  public String getAccount() { return account; }
  public int getLimit() { return limit; }
  public double getBalance() { return balance; }

 /**
   * This method is used to set the customer's name for a Credit Card
   * @param c The name of the customer as a String
   */
  public void setCustomer(String c){
    customer  = c;
  }
/**
   * This method is used to set the customer's limit for a Credit Card
   * @param l The customer's limit expressed as an integer
   */
  public void setLimit(int l){
    limit = l;
  }

/**
   * This method is used to charge an amount on the customer's Credit Card
   * @param price The price to be charged expressed as a double
   * @return boolean This returns true if there was enough money in the account otherwise false
   */
  public boolean charge(double price) { // Make a charge 
    if (price + balance > limit) 
      return false; // There is not enough money left to charge it
    balance = balance + price;
    return true; // The charge goes through in this case
  }

/**
 * Applies interest rate to balance
 * @param i the rate of interest to be applied expressed as a double
 */
  public void applyInterest(double i){
    balance = balance*(1+i);
  }
/**
 * Makes a payment from the customer's account
 * @param amount the amount to be charged to the customer expressed as a double
 */
  public void makePayment(double amount) { // Make a payment
    balance = balance - amount;
    if (balance>0){
       applyInterest(0.1);
  }
}
/**
 * Prints out a summary of the Credit Card details
 * @param card the Credit Card whose details should be output
 */
  public static void printSummary(CreditCard card){
    System.out.println();
    System.out.println("Customer = " + card.customer);
    System.out.println("Bank = " + card.bank);
    System.out.println("Account = " + card.account);
    System.out.println("Balance = " + card.balance); // Implicit cast
    System.out.println("Limit = " + card.limit); // Implicit cast
    System.out.println();
  }
 /**
   * This is the main method which uses the printSummary, makePayment, applyInterest, charge, setCustomer and setLimit methods
   */
  public static void main(String[] args) {
    CreditCard card1 = new CreditCard("John Henry", "Bank of Boston",
					"5391 0375 9387 5309", 2500, 0.0);
    CreditCard.printSummary(card1);
    System.out.println("Charging 200 dollars on card1...");
    card1.charge(200);
    System.out.println("Paying 100 dollars to card1...");
    card1.makePayment(100);
    CreditCard.printSummary(card1);

      // Add your statements here.
    CreditCard card2 = new CreditCard("John Harrison", "Bank of America", "6035 1123 4567 8736", 1500, 0.0);
    CreditCard.printSummary(card2);
    card2.setLimit(1000);
    System.out.println("Setting card2's credit limit to 1000...");
    card2.setCustomer("George Henry");
    System.out.println("Changing card2's card holder name to George Henry...");
    card2.charge(300.00);
    System.out.println("Charging 300 dollars on card2...");
    card2.makePayment(100.00);
    System.out.println("Paying 100 dollars to card2...");
    card2.applyInterest(0.2);
    System.out.println("Applying a 20 percent interest on card2...");
    System.out.println("Charging 800 dollars on card2...");
    if (card2.charge(800.0)  == false){
      System.out.println("Unable to charge: over the credit limit...");
    }
    else{
      card2.charge(800.00);
    }
    CreditCard.printSummary(card2);
      

  }

}
