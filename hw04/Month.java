//Month
//Guerric Vornle von Haagenfels
//September 22 2014
//cse2
import java.util.Scanner;
//start main method
public class Month{
    public static void main(String[]args){
    //initiate input
    Scanner myScanner = new Scanner( System.in );
    System.out.println("Enter an int giving the number of the month (1-12)- ");
    int A = myScanner.nextInt();
    //number between 1-12
if ((A>0) && (A<12)){
    //months with 31 days
    if((A==3)||(A==1)||(A==5)||(A==7)||(A==8)||(A==10)||(A==12)){
    System.out.println("The month has 31 days");
    }
    //months with 30 days
    if((A==9)||(A==4)||(A==6)||(A==11)){
    System.out.println("The month has 30 days");
    }
    //february
    if(A==2){
    System.out.println("Enter an int giving the year - ");
     int B = myScanner.nextInt();
     //calculate whether the year is a leapyear
      boolean isLeapYear = ((B % 4 == 0) && (B % 100 != 0) || (B % 400 == 0));
         
         if (isLeapYear) {
            System.out.println("The Month has 29 days");
        } 
        else{
            System.out.println("The Month has 28 days");
        }
    }
}
else{
    System.out.println("You did not enter an int between 1 and 12");
}
    }//end method
}//end class
    