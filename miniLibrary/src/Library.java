
public class Library 
{
	public static void bookLibrary()
	{
		startOffLibrary();
		
		takeOutBookOrAddBook();
	}
	public static void startOffLibrary()
	{
		
		
		
		MiniLibrary.library.add(new Book("Rival Rails","Walter R. Borneman", 406, "Nonfiction", SetPrice.price));
		MiniLibrary.library.add(new Book("Taylors Guide to Shade Gardening","Houghton Mifflin Company", 501, "Nonfiction", SetPrice.price));
		MiniLibrary.library.add(new Book("The Paris Vendetta","Steve Berry", 419, "Adventure", SetPrice.price));
		MiniLibrary.library.add(new Book("The Naturals","Jennifer Lynn Barnes", 311, "Mystery", SetPrice.price));
		MiniLibrary.library.add(new Book("The Other Boleyn Girl","Philippa Gregory", 664, "Historical fiction", SetPrice.price));
		MiniLibrary.library.add(new Book("Frost Like Night","Sara Raasch", 490, "Fantasy", SetPrice.price));
		MiniLibrary.library.add(new Book("Brisingr","Christopher Paolini", 764, "Fantasy", SetPrice.price));
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
	public static void takeOutBook()
	{
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
				MiniLibrary.library.add(new Book(newTitle, newAuthor, addNumberOfPages,MiniLibrary.newCategory,SetPrice.price));
			}
		
		MiniLibrary.wantToContinue(); 
	}
}
