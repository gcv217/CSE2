//TimePadding
//Guerric Vornle von Haagenfels
//September 22 2014
//cse2
import java.util.Scanner;//prepare input
public class TimePadding{//Main method
    public static void main(String[] args){
Scanner myScanner;
myScanner= new Scanner (System.in);
System.out.println("Enter the time in seconds: ");
int seconds = myScanner.nextInt();        
  //convert into hours,minutes, and seconds remaining
    int hours = (seconds/3600);
    int minutes= ((seconds%3600)/60);
    int Seconds= (seconds %60);
//if both statements need padding
if((minutes<10) && (Seconds<10)) {
    System.out.println("The time is "+hours+":0"+minutes+":0"+Seconds);
    return;
}
//if the minutes need padding
if(minutes<10) {
    System.out.println("The time is "+hours+":0"+minutes+":"+Seconds);
    return;
}
//if the seconds need padding
if(Seconds<10) {
    System.out.println("The time is "+hours+":"+minutes+":0"+Seconds);
    return;
}
else{
    System.out.println("The time is "+hours+":"+minutes+":"+Seconds);
}
    }//end method
}//end class