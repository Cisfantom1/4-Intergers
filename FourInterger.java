
package fourinterger;

/**
 *Class CSC113
 * @author Cecil Williams
 * Purpose of Program : To calculate the Product of 4 Integers
 */
import java.util.Scanner; //This is a way to get information from a keyboard
public class FourInterger {
 // This is a graded assignement due on the 3rd of February 2019
 // This Program find the product of four intergers 
    public static void main(String[] args) {
       Scanner Input= new Scanner (System.in); // This line explained means to that what is typed from the keyboard will be assigned to the varible input 
    
       System.out.println("Enter Your First Number");//Prompt for First Number
       int Firstnumber= Input.nextInt();// What ever interger that the user input will be assigned to Firstnumber and be converted to interger and so on
       System.out.println("First Number is " + Firstnumber);
       System.out.println("Enter Your Second Number");//Prompt for Second Number
       int Secondnumber= Input.nextInt();
       System.out.println("Your Second Number is " + Secondnumber);
       System.out.println("Enter Your Third Number");
       int Thirdnumber= Input.nextInt();
       System.out.println("Your Second Number is " + Thirdnumber);
       System.out.println("Enter Your Fourth Number");
       int Fourthnumber= Input.nextInt();
       System.out.println("Your Fourth Number is " + Fourthnumber);
       System.out.println("Your Product is " + Firstnumber*Secondnumber*Thirdnumber*Fourthnumber);
       
       
       
    }
    
}
