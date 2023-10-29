/** This is Company class definition 
      @author Risqua Mussa
      @since 10-23-2022
*/
  public class Company {
/**
*private String name = name of the company
*/ 
  private String name;

/**
*private double lastPrice  =  last Price of the company
*/

   private double lastPrice;

/**
*private double currentPrice  =  current Price of the company
*/

   private double currentPrice;

    /**
   * 
   * This is the default constructor 
   */

   public Company() {
          name = " ";
          lastPrice = 0.0;
          currentPrice = 0.0;
   }

 /**
      This is the overloaded constructor 
      @param name is the name of the company
      @param lastPrice is the last Price of the company
      @param currentPrice is the current price of the company
   */

  public Company(String name, double lastPrice, double currentPrice) {
         this.name = name;
         this.lastPrice = lastPrice;
         this.currentPrice = currentPrice;
         
    
         if(lastPrice <= 0 && currentPrice <= 0) {
            System.out.println("There is no free item in the list"); 
            this.lastPrice = 0;
            this.currentPrice = 0;
         }
  }
/**
   This is the copy constructor 
   This is copy an object to another in object
   @param copy is the object of the Company class
 */
   
  public Company (Company copy) {
         this.name = copy.name;
         this.lastPrice = copy.lastPrice;
         this.currentPrice = copy.currentPrice;
    
        if(lastPrice <= 0 && currentPrice <= 0) {
            System.out.println("There is no free item in the list"); 
            this.lastPrice = 0;
            this.currentPrice = 0;
         }
}
/**
   The getName() method returns the name of the company
   @return name = the name of the company
*/
  public String getName() {
  return name;
  }
 
 /**
   The setName() method  changes the name of the company 
   @param name = the name of the company
*/
  public void setName(String name) {
      this.name = name;
  }
/**
   The getlastPrice() method returns the last price of the company 
   @return lastPrice = the last price of the company
*/
   public double getLastPrice() {
         return lastPrice;
  }
/**
   The setLastPrice() method  changes the last price of the company 
   @param lastPrice = the last price of the company
*/

  public void setLastPrice(double lastPrice) {
         this.lastPrice = lastPrice;
          
          if(lastPrice <= 0 && currentPrice <= 0) {
            System.out.println("There is no free item in the list"); 
            this.lastPrice = 0;
            this.currentPrice = 0;
         }
}
/**
   The getCurrentPrice() method returns the current price of the company 
   @return currentPrice = the current price of the company
*/
  public double getCurrentPrice() {
      return currentPrice;
  }
/**
   The setCurrentPrice() method  changes the current price of the company 
   @param currentPrice = the current price of the company
*/
  public void setCurrentprice(double currentPrice) {
       this.currentPrice = currentPrice;
       
        if(lastPrice <= 0 && currentPrice <= 0) {
            System.out.println("There is no free item in the list"); 
            this.lastPrice = 0;
            this.currentPrice = 0;
         }
   }
/** 
   The equals method checks to see if two objects are equal.
   @param c the company object that is passed to the method
   @return same returns the flag to a true or false condition
*/
  public boolean equals(Company c) {
        boolean same = false;
         if(name.equalsIgnoreCase(c.name) &&
            lastPrice == (c.lastPrice) &&
            currentPrice ==(c.currentPrice))
            same = true;
  
  return same;
 }
 /** The toString method tells us the state of the object 
   @return str - returns the state of the object
 */
  public String toString() {
     String str = " ";
     str += "\nThe name of the Company is " + name;
     str += "\nThe last price of the company before a month ago was " + lastPrice;
     str += "\nThe current price of the company is " + currentPrice;
     return str; 
  }

}//end class