//BoolaBoola
//Guerric Vornle von Haagenfels
//September 30 2014
//CSE2
//Write a program that has three boolean variables to each of which the value of true or false is randomly assigned.
//Then, at random, combine the three variables with random choices of && and || and stores the result.
//
//Main class
//Main Method
import java.util.Scanner;
public class BoolaBoola {
      // main method required for every Java program
   	public static void main(String[] args) {
// initiate boolean   	    
Scanner input;
boolean b1;
boolean b2;
boolean b3;
//Assign true/false variables
int s1 =(int)(Math.random()*2);
int s2 =(int)(Math.random()*2);
int s3 =(int)(Math.random()*2);
int expression= (int)(Math.random()*4);
//randomize values for the variables
    if (s1==1){
        b1 = true;
    }
    else{
        b1 = false;
    }
     if (s2==1){
        b2 = true;
    }
     else{
        b2 = false;
    }
     if (s3==1){
        b3 = true;
    }
     else{
        b3 = false;
    }
//initiate second set of variables for the different expressions for && and ||
boolean a=b1&&b2&&b3;
boolean b= b1||b2||b3;
boolean c= b1&&b2||b3;
boolean d= b1||b2&&b3;

Scanner myScanner;
myScanner = new Scanner (System.in);
    String response;
// if statement printing out the randomized question    
if (expression==0){
    System.out.println("Does "+b1+" && "+b2+" && "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    //if statements sorting logistics of answer
    if(response.equals("f")||response.equals("F")){
        if(a==false){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }
    }
    //if statements sorting logistics of answer
    if(response.equals("t")||response.equals("T")){
        if(a==true){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }    
    }
}
// if statement printing out the randomized question    
if (expression==1){
    System.out.println("Does "+b1+" && "+b2+" || "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    //if statements sorting logistics of answer
    if(response.equals("f")||response.equals("F")){
        if(b==false){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }
    }
    //if statements sorting logistics of answer
    if(response.equals("t")||response.equals("T")){
        if(b==true){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }    
    }
}
// if statement printing out the randomized question    
if (expression==2){
    System.out.println("Does "+b1+" || "+b2+" && "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    //if statements sorting logistics of answer
    if(response.equals("f")||response.equals("F")){
        if(c==false){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }
    }
    //if statements sorting logistics of answer
    if(response.equals("t")||response.equals("T")){
        if(c==true){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }    
    }
}
// if statement printing out the randomized question    
if (expression==3){
    System.out.println("Does "+b1+" || "+b2+" || "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    //if statements sorting logistics of answer
    if(response.equals("f")||response.equals("F")){
        if(d==false){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }
    }
    //if statements sorting logistics of answer
    if(response.equals("t")||response.equals("T")){
        if(d==true){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
        }    
    }    
}
}//end class
}//end program
