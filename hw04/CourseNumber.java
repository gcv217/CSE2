//CourseNumber
//Guerric Vornle von Haagenfels
//September 22 2014
//cse2
import java.util.Scanner;//prepare input
public class CourseNumber {//Main method
    public static void main(String[] args){
//User input
Scanner myScanner;
myScanner= new Scanner (System.in);
System.out.println("Enter a six digit number giving the course semester- ");
int digits = myScanner.nextInt();
//split into years and semesters
int Year = (digits/100);
int Sem = (digits-(Year*100));
//sort into print statements
if ((digits>=186510)&&(digits<=201440)){
    if (Sem==10){//Spring
        System.out.println("The course was offered in the Spring semester of "+Year);
    return;}
    if (Sem==20){//Summer 1
        System.out.println("The course was offered in the Summer 1 semester of "+Year);
    return;}
    if (Sem==30){//Summer 2
        System.out.println("The course was offered in the Summer 2 semester of "+Year);
    return;}
    if (Sem==40){//Fall
        System.out.println("The course was offered in the Fall semester of "+Year);
    return;}
    else{
        System.out.println(Sem+" is not a legitimate Semester");
    return;}
}
else{
    System.out.println("The number is outside of the range.");
return;}
    }//end method
}//end class