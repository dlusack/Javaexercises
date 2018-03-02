
public class Map {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerposition;
		int player = 0;
		int swamp[][]= new int [10][10];
		//int firstArray[][]= {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20,}}; this put value into array
	//the first part is the row  the second part is the column
//to call the first array it [0][0] for the first slot
// to the call the second array it is [1][0] and so on
player=	swamp[0][0];

//int secondArray[][]= new int [10][10];
	//above is a multisize array
	System.out.println("Player one is at position "+player);
	display(swamp);
	
	//System.out.println("This is the second array");
	//display(secondArray);
	
	
	} 
	
	public static void display (int x[][]) {
		for (int row= 0;row<x.length;row++) {
			for (int column= 0;column<x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		//public void move
	}
	
	






}


