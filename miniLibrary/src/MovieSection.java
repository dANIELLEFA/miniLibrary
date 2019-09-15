
public class MovieSection 
{
	static int movieTakeOutOrAdd;
	static int movieTakeOut;
public static void movieSection()
{
	startOffMovies();
	reviewMovies();
	takeOutMovieOrAddMovie();
}
public static void startOffMovies()
{
	MiniLibrary.movieSection.add(new Movies("Hamilton","Lin-Manuel Miranda", 70, "Nonfiction", SetPrice.price));
	MiniLibrary.movieSection.add(new Movies("Forever","Jaco Smith", 102, "Romance", SetPrice.price));
	MiniLibrary.movieSection.add(new Movies("Charlotte's Web","Gary Winick", 98, "Children", SetPrice.price));
	MiniLibrary.movieSection.add(new Movies("The Swap","Jay Karas", 89, "Comedy", SetPrice.price));
	MiniLibrary.movieSection.add(new Movies("Into the Woods","James Lapine", 150, "Play", SetPrice.price));
	MiniLibrary.movieSection.add(new Movies("Good Will Hunting","Gus Van Sant", 126, "Drama", SetPrice.price));
	MiniLibrary.movieSection.add(new Movies("A.X.L.","Oliver Daly", 99, "Adventure", SetPrice.price));
	SetPrice.makePrice();
}
public static void reviewMovies() 
{
	MiniLibrary.movieNumber = 1;
	System.out.println("Here is the list of movies:");
	for (int i = 0; i < MiniLibrary.movieSection.size(); i++)
	{
		
		System.out.println(MiniLibrary.movieNumber + ") "+MiniLibrary.movieSection.get(i).getTitle() + " by " + MiniLibrary.movieSection.get(i).getDirector() + " for $"+MiniLibrary.movieSection.get(i).getPrice()+"0.");
		MiniLibrary.movieNumber++;
		
	}
}
public static void takeOutMovieOrAddMovie()
{
	System.out.println("Would you like to 1) take out a movie or 2) add a movie");
	movieTakeOutOrAdd= MiniLibrary.intInput.nextInt();
	if (movieTakeOutOrAdd==1)
		{
		
			takeOutMovie();
		}
	else if(movieTakeOutOrAdd==2)
		{
			addMovies();
			
		}
	else
		{
			takeOutMovieOrAddMovie();
		}
}
public static void takeOutMovie()
{
	System.out.println("What movie would you like to take out?");
	int movieTaken= MiniLibrary.intInput.nextInt();
	MiniLibrary.moneyWantToSpend =MiniLibrary.moneyWantToSpend -MiniLibrary.movieSection.get(movieTaken-1).getPrice();
	MiniLibrary.movieSection.remove(movieTaken -1);
	
	MiniLibrary.wantToContinue(); 
}
public static void addMovies()
{
	System.out.println("How many movies do you want put in the library?");
	int addMovie = MiniLibrary.intInput.nextInt();
	for(int i = 0; i < addMovie; i++)
		{
			System.out.println("List the title: ");
			String newTitle =  MiniLibrary.stringInput.nextLine();
			System.out.println("List the director: ");
			String newDirector =  MiniLibrary.stringInput.nextLine();
			System.out.println("List how long the movie is in minutes: ");
			int addMinutes =  MiniLibrary.intInput.nextInt();
			System.out.println("List the category: ");
			 MiniLibrary.getTypesOfCategory();
		 
			SetPrice.makePrice();
			 MiniLibrary.movieSection.add(new Movies(newTitle, newDirector, addMinutes, MiniLibrary.newCategory,SetPrice.price));
		}
	
	 MiniLibrary.wantToContinue(); 
}
}
