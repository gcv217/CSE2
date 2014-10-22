//NumberStack
//Guerric Vornle von Haagenfels
//October 21 2014
//cse2
//
import java.util.Scanner;
public class NumberStack {//Main method
    public static void main(String[] args){
        Scanner myScanner;
   		myScanner = new Scanner( System.in );
   		System.out.print("Enter an integer 1-9");
   			  int NumEnd = myScanner.nextInt();
   			  int NumCopy=NumEnd;
   			  int NumCopy2=NumEnd;
   			  int NumTemp=0;
   			  int Numcounter=0;
   			  int hold=0;
   			  int c=0;
   			  int v=1;
   			  int y=0;
   			  int x=0;
   			  int b=0;
   			  int f=0;
   			  
   			 System.out.println("Using for loops:");
              if  ((NumEnd>=1) && (NumEnd<=9)){
   			      for(int w =0; w<=NumEnd;w++){
   			           hold =(Numcounter-1);
   			      for (int i=1;i<=Numcounter;i++){
   			          System.out.println(" ");
   			          for(int g=(NumCopy-NumTemp); g>0;g--){
   			          System.out.print(" ");
   			          }
   			          for(int j=0; j<(Numcounter+hold);j++){
   			              System.out.print(Numcounter);
   			          }
   			          if(i==Numcounter){
   			              System.out.println(" ");
   			              for(int a=(NumCopy-NumTemp); a>0;a--){
   			                  System.out.print(" ");
   			              }
   			              for(int h=0; h<Numcounter+hold;h++){
   			                  System.out.print("-");
   			              }
   			          }
   			      
   			          
   			          
   			      }
   			      NumTemp++;
   			      Numcounter++;
   			      }
   			  NumTemp=0;
   			  Numcounter=0;
   			  hold=0;
   			 
   			  //While Statement
   			System.out.println(" ");
   			System.out.println("Using while loops:");
   		   while(c<NumCopy2){ 
   		    hold =(Numcounter-1);
   		    
   		        while(v<NumCopy2) {
   		           
   		            System.out.println(" ");
   		            f=(NumCopy2-NumTemp);
   		            while( f>0){
   			          System.out.print(" ");
   			          f--;
   		            }
   			         while( y<(Numcounter+hold)){
   			          System.out.print(Numcounter);
   			              y++;
   			          }
   			          if(v==Numcounter){
   			          System.out.println(" ");
   			          b=NumCopy2-NumTemp;
   			              while( b>0){
   			                  System.out.print(" ");
   			                  b--;
   			              }
   			              
   			        while(x<(Numcounter+hold)){
   			                  System.out.print("-");
   			                  x++;
   			              }
   			          }
   		            v++;
   		        }
   		         NumTemp++;
   		         Numcounter++;
   		        c++;
   		    }
}
   		    
else{
   			      System.out.println("You did not enter an integer 1-9.");
   			  }
   			  
    }
}