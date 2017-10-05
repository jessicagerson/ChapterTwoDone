import java.util.Random;
 
public class Dice{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int dice1, dice2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          dice1 = (generator.nextInt(6) + 1);
 
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          dice2 = (generator.nextInt(6) + 1);
 
          System.out.println ("You rolled a " + dice1 + " and a " + dice2 + ".");
          System.out.println("Your total is " + (dice1 + dice2) + ".");
        }
}
