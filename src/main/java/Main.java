/* COP 2800
  This is an egg program
  By Dom
  */

//scanner is for user input gathering
import java.util.Scanner;

//main file aka class
public class Main {
  public static void main(String[] args) {
    
    // input for number of total chickens and roosters
    System.out.println("How many chickens do you have? ");
    Scanner numberOfChickens = new Scanner(System.in);
    int chickens = numberOfChickens.nextInt();
    System.out.println("How many roosters do you have? ");
    Scanner numberOfRoosters = new Scanner(System.in);
    int roosters = numberOfRoosters.nextInt();
    
    // calculation for number of hens provided info given
    int hens = chickens - roosters;
    System.out.println("You have " + hens + " hens.");
    
  }
}






