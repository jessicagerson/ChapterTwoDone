// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
	// -------------------------------------------------
	// main prints some expressions using the + operator
	// -------------------------------------------------
	public static void main (String[] args)
	{
 	 System.out.println ("This is a long string that is the " +
             	    	"concatenation of two shorter strings.");
         //Guess = This is a long string that is the concatenation of two shorter strings.
         //int value = 55;
 	 System.out.println ("The first computer was invented about" + 55 +
             	    	"years ago.");
         //Guess = The first coputer was invented about55years ago
 	 System.out.println ("8 plus 5 is " + 8 + 5);
 	 //Guess = 8 plus 5 is 85
 	 System.out.println ("8 plus 5 is " + (8 + 5));
 	 //Guess = 8 plus 5 is 13
 	 System.out.println (8 + 5 + " equals 8 plus 5.");
 	 //Guess = 13 equals 8 plus 5.
	}
}
