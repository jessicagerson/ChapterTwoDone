public class Table
{
	// ------------------------
	// main prints the list
	// ------------------------
	public static void main (String[] args)
	{
 	 //makeTable();
 	  System.out.println ();
 	  System.out.println ("\t-------------------------------------");
 	  System.out.println ("\t==\tStudent Points\t\t==");
 	  System.out.println ("\t-------------------------------------");
 	  System.out.println ("\tName\t\tLab\tBonus\tTotal");
 	  System.out.println ("\t-----\t\t---\t-----\t-----");
 	   
 	  System.out.println ("\tJess\t\t80\t10\t90");
 	  System.out.println ("\tParker\t\t70\t8\t78");
 	  System.out.println ("\tKenny\t\t10\t6\t16");
 	  System.out.println ("\tSam\t\t90\t0\t90");
 	  System.out.println ("\tOlivia\t\t60\t3\t63");
 	  System.out.println ();
	}
	public static void makeTable(){
	    writeHeader();
	    populateRows();
	   } 
	public static void writeHeader(){
	  System.out.println ();
 	  System.out.println ("\t-------------------------------------");
 	  System.out.println ("\t==\tStudent Points\t\t==");
 	  System.out.println ("\t-------------------------------------");
 	  System.out.println ("\tName\t\tLab\tBonus\tTotal");
 	  System.out.println ("\t-----\t\t---\t-----\t-----");
	   }
	public static void populateRows(){
	    populateOneRow("Jess", 80, 10);
	   }
	public static void populateOneRow(String name, int lab, int bonus){
	    System.out.println(name + "\t" + lab + "\t" + (lab +bonus));
	   }
}
