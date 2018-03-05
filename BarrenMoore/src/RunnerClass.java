import java.util.Scanner;
public class RunnerClass {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			
			Scanner sc = new Scanner(System.in);
			
			boolean hasWon = false;
					
			String direction;
		
			Player swamp[][]= new Player[10][10];
		
		Player dwayne = new Player(5,5);
		Player treasure = new Player((int)(10*Math.random()),(int)(10*Math.random()));;

		swamp[treasure.yLocation][treasure.xLocation]=dwayne;
		swamp[dwayne.yLocation][dwayne.xLocation]=dwayne;
	    while(!hasWon) {
	    	System.out.println();
	    	System.out.println(getDistance (treasure,dwayne));
	    	System.out.println("Please enter n for north, w for west , s for south , e for east");
	    	direction = sc.nextLine();
		move(swamp, dwayne, direction, hasWon, treasure);
		System.out.println();
		
	    }
		
	}
		
	
	
		public static void move (Player[][] swamp ,Player dwayne, String direction , boolean hasWon, Player treasure) {
			
			
		if (direction.equalsIgnoreCase("n")){
			if (swamp[dwayne.yLocation - 1][dwayne.xLocation]!=(treasure)) {
			
			
			swamp[dwayne.yLocation - 1][dwayne.xLocation]=dwayne;
			swamp[dwayne.yLocation][dwayne.xLocation]=null;
			dwayne.yLocation -= 1;
			} else {
				hasWon = true;
			}
		}
		if (direction.equalsIgnoreCase("s")){
			
			if (swamp[dwayne.yLocation + 1][dwayne.xLocation]!=(treasure)) {			
		
			swamp[dwayne.yLocation+1][dwayne.xLocation]=dwayne;
			swamp[dwayne.yLocation][dwayne.xLocation]=null;
			dwayne.yLocation += 1;
			}else {
				hasWon=true;
				
			}
		}
		
		if (direction.equalsIgnoreCase("e")){
			
			if (swamp[dwayne.yLocation] [dwayne.xLocation+1]!=(treasure)) {
			
			swamp[dwayne.yLocation][dwayne.xLocation+1]=dwayne;
			swamp[dwayne.yLocation][dwayne.xLocation]=null;
			dwayne.xLocation += 1;
			}else {
				hasWon=true;
			
			}
	
	
}
		if (direction.equalsIgnoreCase("w")){
			
			if (swamp[dwayne.yLocation] [dwayne.xLocation-1]!=(treasure)) {
			swamp[dwayne.yLocation][dwayne.xLocation-1]=dwayne;
			swamp[dwayne.yLocation][dwayne.xLocation]=null;
			dwayne.xLocation -= 1;
			
			          }else {
			        	  hasWon=true;

			          }
}
	
	
		}		

		public static String getDistance(Player treasure, Player dwayne) {
	int xdist =		treasure.xLocation-dwayne.xLocation;
	int ydist = treasure.yLocation- dwayne.yLocation;
	
	double distance = Math.sqrt(Math.pow(xdist, 2)+Math.pow(ydist, 2));
	return distance + "m";
			
		}	



	}
	
	
	

	












