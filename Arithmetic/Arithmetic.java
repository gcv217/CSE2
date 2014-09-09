public class Arithmetic{
     //Main method
     public static void main(String[] args) {
          //Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

  //Total cost of socks(including tax)      
System.out.println("The total cost of the socks is "+((nSocks*sockCost$*taxPercent)+(nSocks*sockCost$))+" with "+(nSocks*sockCost$*taxPercent)+" sales tax ");
//Total cost of the glasses(inclusing tax)
System.out.println("The total cost of the drinking glasses is "+((nGlasses*glassCost$*taxPercent)+(nGlasses*glassCost$)))+" with "+(nGlasses*glassCost$*taxPercent)+" sales tax ");
//Total cost of the envelope(including tax)
System.out.println("The total cost of the envelope is "+((nEnvelopes*envelopeCost$*taxPercent)+(nEnvelopes*envelopeCost$))+" with "+(nEnvelopes*envelopeCost$*taxPercent)+" sales tax");
//Cost before tax
System.out.println("The total cost of all purchases before tax is "+((nSocks*sockCost$)+(nGlasses*glassCost$)+(nEnvelopes*envelopeCost$))+"$");
//Cost after tax
System.out.println("The total cost including sales tax is "+(((nSocks*sockCost$*taxPercent)+(nSocks*sockCost$))+((nGlasses*glassCost$*taxPercent)+(nGlasses*glassCost$))+((nEnvelopes*envelopeCost$*taxPercent)+(nEnvelopes*envelopeCost$)))+"$");
     }
}