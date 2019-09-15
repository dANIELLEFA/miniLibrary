import java.util.ArrayList;

public class SetPrice
	{
		
		static double price =1;
		static int i;
		
		
public static void makePrice()
{
	for ( i = 0; i < MiniLibrary.library.size() ; i++)
		{
			
			 price = 3.0;
			 getAuthorCondition();
			 getNumOfPages();
			 getGenre();
			MiniLibrary.library.get(i).setPrice(price);
		}
}
private static void getAuthorCondition()
{
	int space =MiniLibrary.library.get(i).getAuthor().indexOf(" ");
	switch(MiniLibrary.library.get(i).getAuthor().substring(space+ 1,  space + 2))
	{
		case "R":
		case "S	":
		case "K":
		case "A":
				{
			price++;
			MiniLibrary.library.get(i).setPrice(price);
			break;
				}
		default:
				{
			price+=.50;
			MiniLibrary.library.get(i).setPrice(price);
			break;
				}
	}
	
}
private static void getNumOfPages()
{
	if (MiniLibrary.library.get(i).getNumberOfPages() >= 200)
		{
			price++;
			MiniLibrary.library.get(i).setPrice(price);
		}
	else
		{
			price = price + .50;
			
		}
}
private static void getGenre()
{
	
		if(MiniLibrary.library.get(i).getCategory() == "Nonfiction")
			{
			price+= 1;
			MiniLibrary.library.get(i).setPrice(price);
			
			}
			
			
		else if (MiniLibrary.library.get(i).getCategory() == "Fanasty")
			{
				price+=1;
				MiniLibrary.library.get(i).setPrice(price);
				
			}
		else
			{
				price = price + 0;
				MiniLibrary.library.get(i).setPrice(price);
			}
}

	}
