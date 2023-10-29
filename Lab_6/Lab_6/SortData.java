import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SortData {
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(file);
        ArrayList<Company> comp = new ArrayList<Company>(10);

        File file = new File("Company.txt");
        if(!file.exists())
        {
            System.out.println("The file does not exit");
            System.exit(0);
        }
        sort(comp);
      }//end main  
  
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
