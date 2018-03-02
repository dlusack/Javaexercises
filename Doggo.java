package package1;
import java.util.ArrayList;
public class Doggo {

	public static void main(String[] args)
	{
		System.out.println(printDoggoList(10));
	}
	
	public static ArrayList<String> makeDoggoList(int x)
	{
		ArrayList<String> placesList = new ArrayList<String>();
		for (int i = 1 ; i<=100 ; i++)
		{
			if (i == x)
			{
				continue;
			}
			
			String ending;
			switch(i)
				{
				case 11:
					ending = "th";
					break;
				case 12:
					ending = "th";
					break;
				case 13:
					ending = "th";
					break;
				default:
					{
					switch(i%10)
						{
						case 1:
							ending = "st";
						case 2:
							ending = "nd";
						case 3:
							ending = "rd";
						default:
							ending = "th";
						}
					}
				}
			
			
			if(i==1)
			{
				placesList.add( i + ending );
			}
			else
			{
				placesList.add(", " + i + ending);
			}
		}
		
		
		return placesList;
	}
	
	public static String printDoggoList(int x)
	{
		ArrayList<String> list = makeDoggoList(x);
		
		String result = "";
		
		for(String position : list)
		{
			result += position;
		}
		return result;
	}

}
