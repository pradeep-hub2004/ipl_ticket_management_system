package ipl_ticketing;
import java.util.*;
public class checkAvailabilty {
	Map<Integer,String> map = new HashMap<>();
	Map<String,Integer> map1 = new HashMap<>();
public checkAvailabilty () {
	
	map.put(1,"CSK");
	map.put(2,"RCB");
	map.put(3,"MI");
	map.put(4, "PBKS");


	map1.put("CSK",100);
	map1.put("RCB",100);
	map1.put("MI",100);
	map1.put("PBKS",100);
	
}
public void checktix(int team,int n2) {
	
	String s=map.get(team);
	int availtix= map1.get(s);
	if(availtix>=n2) {
		System.out.println("Hooray!,Book it before it's over");
	}
	else
		System.out.println("Oops!,Better luck next time");
	return;
	
}
}
