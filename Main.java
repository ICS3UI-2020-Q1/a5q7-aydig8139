import java.util.Scanner;

/**
 * print *s in the shape of a box
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new Scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for input and declare variable to store it 
    System.out.println("Please enter a number between 1 and 10");
    int userNum = input.nextInt();

    //create the first for loop to keep count of and print the lines of *s
    for(int count = 1; count <= userNum; count++){

      //create the second for loop to keep count of and print the individual number of 8s on a single line
      for(int count2 = 2; count2 <= userNum; count2++){
       
       //write an if statement to print out only one star at each end of the line and leave the middle empty when the conditions are met.
       if (count == 1 || count == userNum || count2 == 2|| count2 == userNum && count2 == userNum - 1){
         System.out.print("*");
       }else{
         System.out.print(" ");
       }  
          
     }
      System.out.println("*");
     }
    }
  }

    
    
     
    
    
    
  

