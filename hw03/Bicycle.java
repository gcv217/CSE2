//Bicycle
//Guerric Vornle von Haagenfels
//September 16 2014
//cse2

import java.util.Scanner;//prepare for user input
public class Bicycle {
// main method required for every Java program
public static void main(String[] args) {
//variable information
    double wheeldiameter=27.0,
    PI=3.14159, //
    feetPerMile=5280,
    inchesPerFoot=12,
    secondsPerMinute=60,
    MinutesPerHour=60;
    double distance, minutes, speed;
//Set up for user input
Scanner myScanner;
myScanner= new Scanner(System.in);
    //user input
    System.out.print("Enter the number of seconds: ");
    int nSeconds = myScanner.nextInt();
    
    System.out.println("Enter the number of counts: ");
    int nCounts = myScanner.nextInt();
    //equation
    distance=nCounts*wheeldiameter*PI/(inchesPerFoot*feetPerMile);// distance in inches
    minutes=nSeconds/secondsPerMinute;
    speed=distance/(minutes/MinutesPerHour);
   //product
    System.out.println("The Distance was"+distance+"miles. and took"+minutes+"minutes.");
    System.out.println("The average mph was "+speed);
} //end of main method
} //end of class