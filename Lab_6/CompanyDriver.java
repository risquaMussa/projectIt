/** This is Company driver with OOP Array List/Sort
     @author Risqua Mussa
     @since 11-5-2022
*/
import java.io.*;
import java.util.*;

public class CompanyDriver {
    public static void main(String[] args) throws IOException {
     File file = new File("Company.txt");
  if(!file.exists())
     {
        System.out.println("The file does not exit");
        System.exit(0);
     }
  Scanner sc = new Scanner(file);
  ArrayList<Company> comp = new ArrayList<Company>(10);
  
  setCompanyData(sc, comp);
  companyData(comp);
  displayCompanyName(comp);
  sort(comp);
          
    }//end main
 
  public static void setCompanyData(Scanner sc, ArrayList<Company> comp) {
   
       String name = " ";
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
public static void companyData(ArrayList<Company> comp) {
           System.out.println("\n\nList of company data");
             for(int i = 0; i < 10; i++) 
      {
         System.out.println(comp.get(i).toString());
      }
 }
 
public static void displayCompanyName(ArrayList<Company> comp) {
      System.out.println("\nList of Company Names");
         for(int i = 0; i < 10; i++)
      {
        System.out.println(comp.get(i).getName());
      }
 }
  //   
public static void sort(ArrayList<Company> comp) {
        Company temp; 
        int choice = 0; 
        Scanner sc = new Scanner(System.in);
           while(true) {
                System.out.println(" choice 1. sort current price from high to low");
                System.out.println(" choice 2. sort current price from low to high");
                System.out.println(" choice 3. sort company name");
                System.out.println("choice 0. Invalid please try again");
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