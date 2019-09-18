
public class MovieSection 
{
	static int movieTakeOutOrAdd;
	static int movieTakeOut;
	static int timesTriedToBuyOverPrice;
public static void movieSection()
{
	if (MiniLibrary.numberOfTimesThereMovies == 0)
		{
	startOffMovies();
		}
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
	MiniLibrary.numberOfTimesThereMovies++;
	MiniLibrary.movieNumber = 1;
	System.out.println("Here is the list of movies:");
	System.out.println("These are the movies you can afford:");
	for (int i = 0; i < MiniLibrary.movieSection.size(); i++)
	{
		if(MiniLibrary.moneyWantToSpend >= MiniLibrary.movieSection.get(i).getPrice())
			{
				
		System.out.println(MiniLibrary.movieNumber + ") "+MiniLibrary.movieSection.get(i).getTitle() + " by " + MiniLibrary.movieSection.get(i).getDirector() + " for $"+MiniLibrary.movieSection.get(i).getPrice()+"0.");
		MiniLibrary.movieNumber++;
			}
	}
}
public static void takeOutMovieOrAddMovie()
{
	
	System.out.println("Would you like to 1) take out a movie or 2) add a movie");
	movieTakeOutOrAdd= MiniLibrary.intInput.nextInt();
	if (movieTakeOutOrAdd==1 && MiniLibrary.moneyWantToSpend < 7 )
		{
		
			System.out.println("You thought you could trick me. You were wrong.Do you want to 1) go to books or 2) add a movie?");
			MiniLibrary.bookOrMovie = MiniLibrary.intInput.nextInt();
			timesTriedToBuyOverPrice++;
			if(MiniLibrary.bookOrMovie == 1)
				{
					Library.bookLibrary();
				}
			else if(MiniLibrary.bookOrMovie == 2)
				{
					addMovies();
				}
		}
			if (movieTakeOutOrAdd==1 )
				{
		
			takeOutMovie();
				}
		
	else if(movieTakeOutOrAdd==2 )
		{
			addMovies();
			
		}
	else
		{
			takeOutMovieOrAddMovie();
		}
}
public static void takeRandomChoice()
	{
		System.out.println("Would you like a random choice 1) yes or 2) no?");
		
		int yesOrNo = MiniLibrary.intInput.nextInt();
		if(yesOrNo == 1 )
			{
		int randomChoice = (int)(Math.random() * MiniLibrary.movieSection.size());
		System.out.println("Your random choice movie is " +MiniLibrary.movieSection.get(randomChoice).getTitle() + " directed by " + MiniLibrary.movieSection.get(randomChoice).getDirector() + " for $" + MiniLibrary.movieSection.get(randomChoice).getPrice() + "0. Would you like this movie 1) Yes or 2) No?" );
			int answer = MiniLibrary.intInput.nextInt();
			if ( answer == 1)
				{
					MiniLibrary.moneyWantToSpend = MiniLibrary.moneyWantToSpend - MiniLibrary.movieSection.get(randomChoice).getPrice();
					MiniLibrary.movieSection.remove(randomChoice);
					MiniLibrary.wantToContinue();
				}
			else if (answer == 2)
				{
					takeRandomChoice();
				}
			
			}
		else
			{
				System.out.println("Ok.");
			}
		
	}
public static void takeOutMovie()
{
	takeRandomChoice();
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
