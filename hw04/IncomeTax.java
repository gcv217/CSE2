//IncomeTax
//Guerric Vornle von Haagenfels
//September 22 2014
//cse2
import java.util.Scanner;
public class IncomeTax{
//Main Method
public static void main(String[]args){
    Scanner myScanner = new Scanner( System.in );
    System.out.println("Enter an int giving the number of thousands- " );
        int A = myScanner.nextInt();
       
    //Sort the input to either:
if((A<20)&&(A>0)){//numbers from 0 to 20
    System.out.println("The tax rate on $"+(A*1000)+" is 5.0%, and the tax is $"+(A*.05*1000));
}
if((A>=20)&&(A<40)){//numbers between 20 and 40
    System.out.println("The tax rate on $"+(A*1000)+" is 7.0%, and the tax is $"+(A*.07*1000));
}
if((A>=40)&&(A<78)){//numbers between 40 and 78
    System.out.println("The tax rate on $"+(A*1000)+" is 12.0%, and the tax is $"+(A*.12*1000));
}
if( A>78){//numbers over 78000
    System.out.println("The tax rate on $"+(A*1000)+" is 14.0%, and the tax is $"+(A*.14*1000));
}
if (A<0){//negative input
    System.out.println("You did not enter a positive number");
}
}// end method
}// end class