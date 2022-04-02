package s3914155_AdvProg_Assignment1;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Menu {
	public static void main(String[] args) {

	    ArrayList<Ticket> arrayList = new ArrayList<Ticket>();
		Scanner selection = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");

	    double credit = 0;
	    
	    while(true) {
	 // Menu will repeat itself infinite times unless the customer decides to close program.
		  System.out.println("\nWelcome to MyTi!");
	      System.out.println("Choose an option: ");
	      System.out.println("1. Buy a travel pass");
	      System.out.println("2. Charge my MyTi");
	      System.out.println("3. Show remaining credit");
	      System.out.println("4. Print purchases");
	      System.out.println("0. Quit");
	      try {
	   // Throughout the entire program, the try-catch statement handles crashes and displays an error message if the program crashes.
	        System.out.print("\nPlease make a selection: ");
	        int input1 = selection.nextInt();
	        if (input1 > 4 || input1 < 0);
	        if (input1 == 1) {
	          System.out.println("\nWhat time period:");
	          System.out.println("a) 2 hours");
	          System.out.println("b) All day");
	          System.out.println("c) Cancel");
	          System.out.print("Your selection: ");
	          String input1a = selection.next();
	          if (input1a.contains("a")) {
	            System.out.println("\nWhich zone:");
	            System.out.println("a) Zone 1");
	            System.out.println("b) Zones 1 and 2");
	            System.out.println("c) Cancel");
	            System.out.print("Your selection: ");
	            String input1b = selection.next();
	            if (input1b.contains("a")) {
	              if (credit <= 2.50) {
	            	  System.out.println("\nSorry, you don't have enough credit for that selection.");
	              } else {
	              credit = credit - 2.50;
	              System.out.println("\nYou purchased 2 hour pass for Zone 1, costing $2.50. Your remaining credit is $" + df.format(credit)); 
	              AA aa = new AA("2 hours", "Zone 1", 2.50);
	              arrayList.add(aa);
	           // This adds the details of a user's successful purchases to the arraylist: ticket type, ticket duration and cost. 
	           }} else if (input1b.contains("b")) {
	            	if (credit <= 3.50) {
		            	  System.out.println("\nSorry, you don't have enough credit for that selection.");
		              } else {
	              credit = credit - 3.50;
	              System.out.println("\nYou purchased 2 hour pass for Zones 1 and 2, costing $3.50. Your remaining credit is $" + df.format(credit));
	              AB ab = new AB("2 hours", "Zone 1 and 2", 3.50);
	              arrayList.add(ab);
	              
	           }} else if (input1b.contains("c")) {
	            } 
	          } else if (input1a.contains("b")) {
	            System.out.println("\nWhich zone:");
	            System.out.println("a) Zone 1");
	            System.out.println("b) Zones 1 and 2");
	            System.out.println("c) Cancel");
	            System.out.print("Your selection: ");
	            String input1b = selection.next();
	            if (input1b.contains("a")) {
	            	if (credit <= 4.90) {
		            	  System.out.println("\nSorry, you don't have enough credit for that selection.");
		              } else {
	              credit = credit - 4.90;
	              System.out.println("\nYou purchased All Day pass for Zone 1, costing $4.90. Your remaining credit is $" + df.format(credit));
	              BA ba = new BA("All Day", "Zone 1", 4.90);
	              arrayList.add(ba);
	              
	           }} else if (input1b.contains("b")) {
	        	   if (credit <= 6.80) {
		            	  System.out.println("\nSorry, you don't have enough credit for that selection.");
		              } else {
	              credit = credit - 6.80;
	              BB bb = new BB("All Day", "Zone 1 and 2", 6.80);
	              arrayList.add(bb);
	              System.out.println("\nYou purchased All Day pass for Zones 1 and 2, costing $6.80. Your remaining credit is $" + df.format(credit));
	              
	           }} else if (input1b.contains("c")) {
	            } 
	          } else if (input1a.contains("c")) {
	          } else {
	        	  System.out.println("Error: Please enter a valid option");
	          }
	          
	        } else if (input1 == 2) {
	          while (true) {
	          System.out.print("\nHow much do you want to add: "); 
	          int input2 = selection.nextInt();
	          if (input2 > 100) {
	            System.out.println("\nSorry, the max amount of credit allowed is $100.00");
	          } else if (input2 % 5 != 0) {
	            System.out.println("\nSorry, you can only add multiples of $5.00");
	          }	else {
		        credit = credit + input2;
	            System.out.println("\nYour credit = $" + df.format(credit));
	            
	            break;
	          }
	          }}
	          
	          else if (input1 == 3) {
	          System.out.println("\nYour credit = $" + df.format(credit)); 
	          
	        } else if (input1 == 4) {
	          System.out.println("\nPurchases:"); 
	          for (Ticket list: arrayList) {
	        	  System.out.println("Purchased " + list.gettime() + " pass for " + list.getzone() + ", costing $" + df.format(list.getcost()));
	        	  }
	        
	        } else if (input1 == 0) {
	          System.out.println("\nGoodbye!");
	          break;
	        } else {
	          System.out.println("\nSorry, that is an invalid option!");
	        }
	        } catch (InputMismatchException e) {
	          System.out.println("\nSorry, that is not an integer, which is an invalid option!");
	          selection.nextLine();
	      }}
	      selection.close();
	    }}
	  
/** AA represents 2 Hour pass for Zone 1 */
/** AB represents 2 Hour pass for Zone 1 & 2 */
/** BA represents All Day pass for Zone 1 */
/** BB represents All Day pass for Zone 1 & 2 */
