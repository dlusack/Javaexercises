import java.util.Scanner;
public class RunnerClass {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player swamp[][]= new Player[10][10];
		
		Player steve = new Player();
		
		swamp[5][5]=steve;
		scanner();
	//	display(swamp);
		
	}
		
		public static void scanner() {
			System.out.println("Please enter n for north, w for w , s for south , e for east");
			Scanner sc = new Scanner(System.in);
			
			String direction = sc.nextLine();
			
			System.out.println("you have entered "+ direction);
		}
		
		{
//			public void movePlayer() {
//				if (direction = n) {
//					swamp[5][4]=steve;
				}
			
		}		
			
			
		

		
		
		
 


	
	
	
	
	
	
	
//	public static void display (Player[][] swamp) {
//		for (int row= 0;row<swamp.length;row++) {
//			for (int column= 0;column<swamp[row].length;column++) {
//				System.out.print(swamp[row][column]+"\t");
//			}
//			System.out.println();
//		}
		
//		
//	}
//	
//	public void treasure() {
//		int rand = (int)(10*Math.random());
//		int rand1 =rand;
//		int rand2 = (int)(10*Math.random());
//		swamp[rand][rand2]=9;
//	
//	public void monster() {
//		int rand = (int)(10*Math.random());
//	int rand1 =rand;
//	int rand2 = (int)(10*Math.random());
//	swamp[rand][rand2]=9;
//}
//	
		
	
	//}
	

	
//
//	public void Scanner() {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			int a = sc.nextInt();
//			System.out.println("you have entered "+ a);
	//}
		

	//}











