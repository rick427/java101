import java.util.Scanner;

public class FirstProgram {
   public static void main(String []args){
      System.out.println("Hello out there");
      System.out.println("I would like to add two number for you");
      System.out.println("Enter two number on a line:");

      int n1, n2;

      Scanner keyboard = new Scanner (System.in);
      n1 = keyboard.nextInt();
      n2 = keyboard.nextInt();

      System.out.println("The sum of the two number is:");
      System.out.println(n1 + n2);
   }
}