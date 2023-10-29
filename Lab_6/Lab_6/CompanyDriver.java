/** This is Company driver with OOP Array List/Sort
     @author Risqua Mussa
     @since 10-23-2022
*/
import java.io.*;
import java.util.*;

public class CompanyDriver {
    public static void main(String[] args) throws IOException {
    //final ArrayList list = new ArrayList(10);
  Company [] companyArray = new Company[10];

    
       /*       //Testing two string method 
     Company sc = new Company();
     System.out.println(sc);
           // Testing overloaded constructor
     Company sc1 = new Company("Amazon", 531.07, 576.32);
     System.out.println(sc1);
            // Testing copy constructor
     Company sc2 = new Company(sc1);
     System.out.println(sc2);
            // checking equals method
      if(sc1.equals(sc2)) 
         System.out.println("objects sc1 is equal to sc2");
   **/

  File file = new File("Company.txt");
  if(!file.exists())
     {
        System.out.println("The file does not exit");
        System.exit(0);
     }
  Scanner sc = new Scanner(file);
  ArrayList<Company> comp = new ArrayList<Company>();
  
  

  setCompanyData(sc, comp);
  displayCompanyData(comp);
   sort(comp);
  
}//end main
  public static void setCompanyData(Scanner sc, ArrayList<Company> comp) {
      String name = " ";
      // String sign = " ";
       double lastPrice = 0;
       double currentPrice = 0;
       int i = 0;
       
       while(sc.hasNextLine()) {
           name = sc.nextLine();
           lastPrice = sc.nextDouble();
           currentPrice = sc.nextDouble();
                  
           comp.add(new Company (name, lastPrice, currentPrice));
           System.out.println(comp.get(i));
            if (sc.hasNextLine())
               sc.nextLine(); 
           i++;  
   }//end while
 }
      
  public static void displayCompanyData(ArrayList <Company> comp){
      System.out.println("List of object");
           for(int i = 0; i < 10; i++) {
               System.out.println(comp.get(i));//.toString());
               }
             }    
                 
  public static void displayCompanyName(ArrayList<Company> comp) {
            System.out.println("List of Company Names");
       for(int i = 0; i < 10; i++)
  {
      System.out.println(comp.get(i));
  }
 }


   
  
  public static void sort(ArrayList<Company> comp) {
        Company temp; 
        int choice = 0; 
        Scanner sc = new Scanner(System.in);
           while(true) {
                System.out.println(" select 1. sort current price from high to low");
                System.out.println(" select 2. sort current price from low to high");
                System.out.println(" select 3. sort company name");
                System.out.println("select 0. Invalid please try again");
                choice = sc.nextInt();
 
        
    if(choice == 1) {
       for(int i = 0; i < comp.size(); i++)
            for(int j = 1; j < comp.size(); j++)
               if(comp.get(j-1).getCurrentPrice() < (comp.get(j).getCurrentPrice()))
               {
                 
                 temp = comp.get(j-1);
                 comp.set((j-1),comp.get(j));
                 comp.set(j,temp);
                 }
            System.out.println("\nThis is sort of by company current price from high to low");
            
            System.out.println(comp);
            }//end if
                       
   else if(choice == 2){
         for(int i = 0; i < comp.size(); i++)
            for(int j = 1; j < comp.size(); j++)
               if(comp.get(j-1).getCurrentPrice() > (comp.get(j).getCurrentPrice()))
               {
                 
                 temp = comp.get(j-1);
                 comp.set((j-1),comp.get(j));
                 comp.set(j,temp);
                 }
         System.out.println("\nThis is sort of by company current price from low to high ");
            
            System.out.println(comp);
            }//end else
       
    else if (choice == 3){
         for(int i = 0; i < comp.size() - 1; i++)
                       for(int j = 1; j < comp.size(); j++)
                        if(comp.get(j-1).getName().compareToIgnoreCase(comp.get(j).getName())> 0)
                         {
                            temp = comp.get(j-1);
                            comp.set((j-1),comp.get(j));
                            comp.set(j, temp);                         
                         }
        System.out.println("\nThis is sort of by company Name");
        System.out.println(comp);
         }//end else
   else 
            System.exit(0);
         }
      }
 
 
}//end class
