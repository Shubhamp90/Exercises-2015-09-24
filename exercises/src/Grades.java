/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */


package com.hubberspot.code;
 
import java.util.Scanner;
 public class Grades {
  public static void main(String[] args) {
      double Grade1 = 0;
      double Grade2 = 0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the value of Grade1 : ");
      Grade1 = scanner.nextDouble();
      System.out.println("Enter the value of Grade2 : ");
      Grade2 = scanner.nextDouble();
      System.out.println();
      System.out.println("Calculating percentage of : (Grade1 and Grade2) : ");
      double result =((Grade1 * Grade2)/100);
      String Return;
      System.out.println(Grade1 + Grade2 + " Percemtage is: " + result); 
      System.out.println();
              
              
              
    
  }

}
