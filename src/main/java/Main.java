/* COP 2800
  This is an egg program
  By Dom
  */



//scanner is for user input gathering
import java.util.Scanner;

// date time is for date and time
import java.time.LocalDateTime;

//main file aka class
public class Main {
  public static void main(String[] args) {

    //intoduction
    System.out.print("Dominic Shriver \nCOP 2800 \nEgg Program \n" + LocalDateTime.now() + "\n");
    
    
    // input for number of total chickens and roosters
    System.out.println("\nHow many chickens do you have?");
    Scanner numberOfChickens = new Scanner(System.in);
    int chickens = numberOfChickens.nextInt();
    System.out.println("\nHow many roosters do you have?");
    Scanner numberOfRoosters = new Scanner(System.in);
    int roosters = numberOfRoosters.nextInt();
    
    // calculation for number of hens provided info given
    int hens = chickens - roosters;
    System.out.println("\nYou have " + hens + " hens.");

    // input for eggs per day per hen
    System.out.println("\nWhat is the chance that a hen will lay an egg on any day? \n(please enter a number between 0.0 and 1.0)");
    Scanner eggChance = new Scanner(System.in);
    float eggA = eggChance.nextFloat();
    

    //input for number of days that will pass
    System.out.println("\nHow many days will pass?");
    Scanner numberOfDays = new Scanner(System.in);
    int days = numberOfDays.nextInt();

    //output for number of eggs per the time given
    
    System.out.println("\nGiven " + days + " days, and " + hens + " hens, and a chance of " + eggA + " for a hen to lay an egg,\nyou will have " + ((hens * eggA) * days) + " eggs.");
  }
}






