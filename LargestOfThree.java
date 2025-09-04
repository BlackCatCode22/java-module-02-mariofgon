

  // largestofthree.java
  //Mario Gonzalez 8/21/25

  //Reference:
  //Gemini's Flowchart
  //

  //
  //this program will input three
  // the scanner class lives in java.intel package


  import java.util.Scanner;

  // Example:
    public class LargestOfThree {
      public static void main(String[] args) {

          //variables needed for this program
          //iniltialize num 1 t0 0
          //0 is assigned to num1
          int num1 = 0;
          int num2 = 0;
          int num3 = 0;
          int largest = 0;

          //get intput from the user

          Scanner scanner = new Scanner(System.in);
          //promp the user for the first int
          System.out.println("Please enter a whole number for num1: ");
          num1 = scanner.nextInt();
          System.out.println("Please enter a whole number for num2: ");
          num2 = scanner.nextInt();
          System.out.println("Please enter a whole number for num3: ");
          num3 = scanner.nextInt();
          //output the use's input to make sure my program is working
          largest = num1;
          if (largest < num2) {
              largest = num2;
          }
          if (largest < num3) {
              largest = num3;
          }
          System.out.println("largest number is " + largest);


          //Processing
          //Use
      }
  }