import java.util.ArrayList;

public class SetPrice
	{
		
		static double price =1;
		static int i;
		
		
public static void makePrice()
{
	if (MiniLibrary.bookOrMovie == 1) 
	{
		
		 for ( i = 0; i < MiniLibrary.movieSection.size() ; i++)
			{
			 price = 6.0;
				
			 getDirectorCondition();
			 getGenreForMovie();
				 
				MiniLibrary.movieSection.get(i).setPrice(price);
			}
	}
	 if (MiniLibrary.bookOrMovie == 2)
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
	
}

private static void getAuthorCondition()
{
	int space =MiniLibrary.library.get(i).getAuthor().indexOf(" ");
	
	
	switch(MiniLibrary.library.get(i).getAuthor().substring(space+ 1,  space + 2)   )
	{
		case "R":
		case "S	":
		case "K":
		case "A":
				{
			price+= 1.5;
			
			break;
				}
		default:
				{
			price+=.50;
			
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
	
		if(MiniLibrary.library.get(i).getCategory() == "Nonfiction" )
			{
			price+= 1;
			
			
			}
			
			
		else if (MiniLibrary.library.get(i).getCategory() == "Fanasty"  )
			{
				price+=1;
				
				
			}
	
		else
			{
				price = price + .5;
				
			}
}
private static void getDirectorCondition()
{
	int space2 =MiniLibrary.movieSection.get(i).getDirector().indexOf(" ");
	switch(MiniLibrary.movieSection.get(i).getDirector().substring(space2+ 1,  space2 + 2)  )
	{
		case "R":
		case "S	":
		case "K":
		case "A":
				{
			price++;
			
			break;
				}
		default:
				{
			price+=.50;
			
			break;
				}
	}
}
private static void getGenreForMovie()
{
	
		if(MiniLibrary.movieSection.get(i).getCategory() == "Nonfiction" )
			{
			price+= 1;
			
			
			}
			
			
		else if (MiniLibrary.movieSection.get(i).getCategory() == "Fanasty"  )
			{
				price+=1;
				
				
			}
	
		else
			{
				price = price + .5;
				
			}
}


	}
