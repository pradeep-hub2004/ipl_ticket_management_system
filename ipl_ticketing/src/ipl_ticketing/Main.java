package ipl_ticketing;
import java.util.*;
import ipl_ticketing.checkAvailabilty;
public class Main {
	static int team;
	static int tix;
	static String h;
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	checkAvailabilty ca = new checkAvailabilty();
	System.out.println("The journey to your favorite team's match tickets begins here");
	System.out.println("First things First");
	options();
	return;
	}
public static int choice() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your choice:");
	int n=sc.nextInt();
	return n;
}
public static int team() {
	System.out.println("Alright,which team are we?,Press:");
	System.out.println(" 1 - CSK\n 2 - RCB\n 3 - MI\n 4 - PBKS");
	int team=choice();
	return team;
}
public static int tix() {
	System.out.println("And How many tickets are we looking for?");
	int tix=choice();
	return tix;
}
public static String check() {
	Scanner sc = new Scanner(System.in);
	System.out.print("All done?,Enter yes/no:");
	String ans=sc.nextLine();
	return ans;
}
public static void options() {
	Scanner sc = new Scanner(System.in);
	checkAvailabilty ca = new checkAvailabilty();
	System.out.println("Press:");
	System.out.println("1 - To Check for availability");
	System.out.println("2 - To look and book tickets");
	System.out.println("3 - To return");
	System.out.println();
	int n=choice();
	switch(n) {
	case 1:
	{
	 team=team();
	 tix=tix();
System.out.println("------------------------");
	ca.checktix(team,tix);
	
	h=check();
	if(h.equalsIgnoreCase("yes")) {
		System.out.println("GoodBye");
		return;
	}
	else
		options();
			
	}
	case 2:{
		team=team();
		 tix=tix();
		 System.out.println("------------------------");
		ca.checktix(team,tix);
		
		h=check();
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
