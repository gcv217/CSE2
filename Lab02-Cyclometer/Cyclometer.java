//Cyclometer
//Guerric Vornle von Haagenfels
//september 5 2014
//CSE2 
//cyclometer program for evaluating the distances traveled in two biking trips.
//
public class Cyclometer {
    public static void main(String[] args) {
    int secsTrip1=480;  //seconds Trip 1
    int secsTrip2=3220; //seconds Trip 2
    int countsTrip1=1561; //initiate count
    int countsTrip2=9037; //intitiate count
    double wheeldiameter=27.0,
    PI=3.14159, //
    feetPerMile=5280,
    inchesPerFoot=12,
    secondsPerMinute=60;
    double distanceTrip1, distanceTrip2, totalDistance;
    
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)
    +"minutes and had"+countsTrip1+"counts.");
    System.out.println("Trip 2 took "
    +(secsTrip2/secondsPerMinute)+"minutes and had"+countsTrip2+"counts. ");
    
    distanceTrip1=countsTrip1*wheeldiameter*PI;// distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile;
    distanceTrip2=countsTrip2*wheeldiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    System.out.println("Trip 1 was"+distanceTrip1+"miles");
    
    System.out.println("Trip 2 was"+distanceTrip2+"miles");
    System.out.println("The total distance was "+totalDistance+ "miles");
    }
}