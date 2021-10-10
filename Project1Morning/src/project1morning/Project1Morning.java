
package project1morning;

import java.util.Scanner;


public class Project1Morning {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = keyboard.nextLine(); 
        
        System.out.println("Hi " + name + ", How many people are coming for the marathon run?");
        int NumberOfRunners = Integer.parseInt(keyboard.nextLine()); 
        
        System.out.println(name + ", how many drinks will the average runner want ");
        double averageNumberOfDrinksPer = Double.parseDouble(keyboard.nextLine());
        
        double totalNumberOfDrinksNeeded = averageNumberOfDrinksPer * NumberOfRunners;
        
        System.out.println("Which pack of drink are you buying? (Powerade, Water, Gatorade or Propel)");
        String KindOfDrink = keyboard.nextLine();
        
        if (KindOfDrink.equalsIgnoreCase("Powerade")) { 
            double numberOfPacksNeeded
                    = Math.ceil(totalNumberOfDrinksNeeded / 8);
            System.out.println(name + ", you need to buy " + numberOfPacksNeeded + " " + KindOfDrink + " Packs for the runners!"); 
           
        } else if (KindOfDrink.equalsIgnoreCase("water")) { 
            double numberOfPacksNeeded 
                    = Math.ceil(totalNumberOfDrinksNeeded / 14);
            System.out.println(name + ", you need to buy " + numberOfPacksNeeded + " " + KindOfDrink + " Packs for the runners!"); 

        } else if (KindOfDrink.equalsIgnoreCase("Gatorade")) { 
             double numberOfPacksNeeded 
                    = Math.ceil(totalNumberOfDrinksNeeded / 4);
            System.out.println(name + ", you need to buy " + numberOfPacksNeeded + " " + KindOfDrink + " Packs for the runners!"); 
            
        } else if (KindOfDrink.equalsIgnoreCase("Propel")) { 
             double numberOfPacksNeeded 
                    = Math.ceil(totalNumberOfDrinksNeeded / 6);
            System.out.println(name + ", you need to buy " + numberOfPacksNeeded + " " + KindOfDrink + " Packs for the runners!"); 
            
        } else 
            System.out.println("Well thats not Powerade, Water, Gatorade or Propel. lets try again");
        }
        
    }
        
        
       
            
      

        
        
        
        
    
    

