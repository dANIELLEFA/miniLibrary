
public class Library 
{
	public static void bookLibrary()
	{
		if(MiniLibrary.numberOfTimesThereBooks == 0)
			{
		startOffLibrary();
			}
		
		takeOutBookOrAddBook();
	}
	public static void startOffLibrary()
	{
		
		
		
		MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,"Rival Rails","Walter R. Borneman", 406, "Nonfiction", SetPrice.price));
		
		MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,"Taylors Guide to Shade Gardening","Houghton Mifflin Company", 501, "Nonfiction", SetPrice.price));
		
		MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,"The Paris Vendetta","Steve Berry", 419, "Adventure", SetPrice.price));
		
		MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,"The Naturals","Jennifer Lynn Barnes", 311, "Mystery", SetPrice.price));
		
		MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,"The Other Boleyn Girl","Philippa Gregory", 664, "Historical fiction", SetPrice.price));
		
		MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,"Frost Like Night","Sara Raasch", 490, "Fantasy", SetPrice.price));
		
		MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,"Brisingr","Christopher Paolini", 764, "Fantasy", SetPrice.price));
		
		SetPrice.makePrice();
		
	}
	public static void reviewBooks() 
	{
		
		MiniLibrary.bookNumber = 1;
		System.out.println("Here is the list of books:");
		for (int i = 0; i < MiniLibrary.library.size(); i++)
		{
			
			System.out.println(MiniLibrary.bookNumber + ") "+MiniLibrary.library.get(i).getTitle() + " by " + MiniLibrary.library.get(i).getAuthor() + " for $"+MiniLibrary.library.get(i).getPrice()+"0.");
		MiniLibrary.bookNumber++;
			
		}
	}
	public static void takeOutBookOrAddBook()
	{
		reviewBooks();
		MiniLibrary.numberOfTimesThereBooks++;
		System.out.println("Would you like to 1) take out a book or 2) add a book");
		MiniLibrary.bookTakeOutOrAdd= MiniLibrary.intInput.nextInt();
		if (MiniLibrary.bookTakeOutOrAdd==1)
			{
			
			takeOutBook();
			}
		else if(MiniLibrary.bookTakeOutOrAdd==2)
			{
				addBooks();
				
			}
		else
			{
				takeOutBookOrAddBook();
			}
	}
	public static void takeRandomChoice()
	{
		System.out.println("Would you like a random choice 1) yes or 2) no?");
		
		int yesOrNo = MiniLibrary.intInput.nextInt();
		if(yesOrNo == 1 )
			{
		int randomChoice = (int)(Math.random() * MiniLibrary.library.size());
		System.out.println("Your random choice book is " +MiniLibrary.library.get(randomChoice).getTitle() + " by " + MiniLibrary.library.get(randomChoice).getAuthor() + " for $" + MiniLibrary.library.get(randomChoice).getPrice() + "0. Would you like this book 1) Yes or 2) No?" );
			int answer = MiniLibrary.intInput.nextInt();
			if ( answer == 1)
				{
					MiniLibrary.moneyWantToSpend = MiniLibrary.moneyWantToSpend - MiniLibrary.library.get(randomChoice).getPrice();
					MiniLibrary.library.remove(randomChoice);
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
	public static void takeOutBook()
	{
		takeRandomChoice();
		System.out.println("What book would you like to take out?");
		int bookTaken= MiniLibrary.intInput.nextInt();
		
		MiniLibrary.moneyWantToSpend =MiniLibrary.moneyWantToSpend -MiniLibrary.library.get(bookTaken-1).getPrice();
		MiniLibrary.library.remove(bookTaken -1);
		
		MiniLibrary.wantToContinue(); 
	}
public static void addBooks()
	{
		System.out.println("How many books do you want put in the library?");
		int addBook = MiniLibrary.intInput.nextInt();
		for(int i = 0; i < addBook; i++)
			{
				System.out.println("List the title: ");
				String newTitle = MiniLibrary.stringInput.nextLine();
				System.out.println("List the author: ");
				String newAuthor = MiniLibrary.stringInput.nextLine();
				System.out.println("List the number of pages: ");
				int addNumberOfPages = MiniLibrary.intInput.nextInt();
				System.out.println("List the category: ");
				MiniLibrary.getTypesOfCategory();
			 
				SetPrice.makePrice();
				MiniLibrary.bookNumber++;
				MiniLibrary.library.add(new Book(MiniLibrary.bookNumber,newTitle, newAuthor, addNumberOfPages,MiniLibrary.newCategory,SetPrice.price));
			}
		
		MiniLibrary.wantToContinue(); 
	}
}
