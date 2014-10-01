//BurgerKing
//Guerric Vornle von Haagenfels
//September 30 2014
//CSE2
//Write a program that prompts the user to enter a choice of a burger, a soda, or fries.
//Then the program prompts the users for details of their choices.
//Main class
//Main Method
import java.util.Scanner;
public class BurgerKing {
      // main method required for every Java program
   	public static void main(String[] args) {

//initial user input
System.out.println("Enter a letter to indicate a choice of ");
    System.out.println("    Burger (B or b)");
    System.out.println("    Soda (S or s)");
    System.out.println("    Fries (F or f)");
    
Scanner myScanner;
myScanner = new Scanner (System.in);
    String Order = myScanner.next();
    //open case statements
    switch (Order){
        
        case "B":
            String burger;
            //User input for ordereing a burger.
            System.out.println("Enter A or a for all the fixins");
            System.out.println("C or c for cheese");
            System.out.println(" N or n for none of the above ");
			burger = myScanner.next();
			//Divide into case statements.
			switch (burger){
				case"A":
					System.out.println("You ordered a burger with all the fixins.");
					return;
				case"a":
					System.out.println("You ordered a burger with all the fixins.");
					return;	
				case"C":
					System.out.println("You ordered a cheeseburger.");
					return;	
				case"c":
					System.out.println("You ordered a cheeseburger.");
					return;	
				case"N":
					System.out.println("You ordered a plain burger.");
					return;	
				case"n":
					System.out.println("You ordered a plain burger.");
					return;	
			}
			return;
			
		case "b":
            String burger1;
            //User input for ordereing a burger.
            System.out.println("Enter A or a for all the fixins");
            System.out.println("C or c for cheese");
            System.out.println(" N or n for none of the above ");
			burger1= myScanner.next();
			//Divide into case statements.
			switch (burger1){
				case"A":
					System.out.println("You ordered a burger with all the fixins.");
					return;
				case"a":
					System.out.println("You ordered a burger with all the fixins.");
					return;	
				case"C":
					System.out.println("You ordered a cheeseburger.");
					return;	
				case"c":
					System.out.println("You ordered a cheeseburger.");
					return;	
				case"N":
					System.out.println("You ordered a plain burger.");
					return;	
				case"n":
					System.out.println("You ordered a plain burger.");
					return;	
			}
			return;
			
		case "S":
			String soda;
			//User input for ordering a Soda.
			System.out.println("Do you want Pepsi (p or P)");
 			System.out.println("Coke (c or C)");
 			System.out.println("Sprite (s or S)");
 			System.out.println("Mountain Dew (M or m)");
 			soda = myScanner.next();
 			//Divide into case statements.
 				switch(soda){
 					case "P":
 						System.out.println("You ordered a Pepsi.");
 						return;
 					case "p":
 						System.out.println("You ordered a Pepsi.");
 						return;
 					case "C":
 						System.out.println("You ordered a Coke.");
 						return;
 					case "c":
 						System.out.println("You ordered a Coke.");
 						return;
 					case "S":
 						System.out.println("You ordered a Sprite.");
 						return;
 					case "s":
 						System.out.println("You ordered a Sprite.");
 						return;
 					case "M":
 						System.out.println("You ordered a Pepsi.");
 						return;
 					case "m":
 						System.out.println("You ordered a Pepsi.");
 						return;
 				}
 		        return;
 		        
 			case "s":
			String soda1;
			//User input for ordering a Soda.
			System.out.println("Do you want Pepsi (p or P)");
 			System.out.println("Coke (c or C)");
 			System.out.println("Sprite (s or S)");
 			System.out.println("Mountain Dew (M or m)");
 			soda1 = myScanner.next();
 			//Divide into case statements.
 				switch(soda1){
 					case "P":
 						System.out.println("You ordered a Pepsi.");
 						return;
 					case "p":
 						System.out.println("You ordered a Pepsi.");
 						return;
 					case "C":
 						System.out.println("You ordered a Coke.");
 						return;
 					case "c":
 						System.out.println("You ordered a Coke.");
 						return;
 					case "S":
 						System.out.println("You ordered a Sprite.");
 						return;
 					case "s":
 						System.out.println("You ordered a Sprite.");
 						return;
 					case "M":
 						System.out.println("You ordered a Pepsi.");
 						return;
 					case "m":
 						System.out.println("You ordered a Pepsi.");
 						return;
 				}
 	            return;
 		
 		case "F":
 			String fries;
 			//User input for ordering fries.
 			System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
 			fries = myScanner.next();
 			//Divide into case statements.
 				switch (fries){
 					case "S":
 						System.out.println("You ordered small fries.");
 						return;
 				    case "s":
 						System.out.println("You ordered small fries.");
 						return;
 			       case "L":
 						System.out.println("You ordered large fries.");
 						return;
 			       case "l":
 						System.out.println("You ordered large fries.");
 						return;
 				}
 		        return;
 		
 		case "f":
 			String fries1;
 			//User input for ordering fries.
 			System.out.println("Do you want a large or small order of fries (l,L,s, or S)");
 			fries1= myScanner.next();
 			//Divide into case statements.
 				switch (fries1){
 					case "S":
 						System.out.println("You ordered small fries.");
 						return;
 				    case "s":
 						System.out.println("You ordered small fries.");
 						return;
 			       case "L":
 						System.out.println("You ordered large fries.");
 						return;
 			       case "l":
 						System.out.println("You ordered large fries.");
 						return;
 				}
 		return;
 		//Default statement for voided entries.
 		default:
 		System.out.println("You did not enter any of B, b, S, s, F, or f.");
 		return;
}
}//end class
}//end program
 			