package ipl_ticketing;
import java.util.*;
import ipl_ticketing.checkAvailabilty;
public class Main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	checkAvailabilty ca = new checkAvailabilty();
	System.out.println("The journey to your favorite team's match tickets begins here");
	System.out.println("First things First");
	options();

	return;
		
	
	}

public static void choice() {
	System.out.print("Enter your choice:");
	return;
}
public static void options() {
	Scanner sc = new Scanner(System.in);
	checkAvailabilty ca = new checkAvailabilty();
	System.out.println("Press:");
	System.out.println("1 - To Check for availability");
	System.out.println("2 - To look and book tickets");
	System.out.println("3 - To return");
	System.out.println();
	choice();
	int n=sc.nextInt();
	switch(n) {
	case 1:
	{
	System.out.println("Alright,which team are we?,Press:");
	System.out.println("1 - CSK/n 2 - RCB/n 3 - MI/n 4 - PBKS");
	choice();
	int team=sc.nextInt();
	System.out.print("And How many tickets are we looking for?");
	int tix=sc.nextInt();
	sc.nextLine();
	ca.checktix(team,tix);
	System.out.print("All done?,Enter yes/no:");
	String h=sc.nextLine();
	if(h.equalsIgnoreCase("yes")) {
		System.out.println("GoodBye");
		return;
	}
	else
		options();
			
	}
	}
	return;

}
}
