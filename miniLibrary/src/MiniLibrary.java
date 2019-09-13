
import java.util.Scanner;
import java.util.ArrayList;

public class MiniLibrary
	{
		static	ArrayList<Book> library = new ArrayList <Book>();
		static Scanner stringInput = new Scanner (System.in);
		static Scanner intInput = new Scanner (System.in);
		static Scanner doubleInput = new Scanner (System.in);
		static int bookTakeOutOrAdd; 
		static boolean shopping;
		static int bookNumber;
		static double moneyWantToSpend;
		
		public static void main(String[] args)
			{
				System.out.println(SetPrice.price);
				startOffLibrary();
				
			welcomePatrons();
			
			reviewBooks();
			wantToContinue();
			while (shopping){
				
				System.out.println("Just to review the books avaliable.");
				reviewBooks();
				takeOutBookOrAddBook();
				
			}

			}
		private static void welcomePatrons()
		{
			System.out.println("Hello Patron! How much money do you want to spend?" );
			moneyWantToSpend =doubleInput.nextDouble();
			
		}
		private static void startOffLibrary()
		{
			boolean needPrice = true;
			
			
			library.add(new Book("Rival Rails","Walter R. Borneman", 406, "Nonfiction", SetPrice.price));
			library.add(new Book("Taylors Guide to Shade Gardening","Houghton Mifflin Company", 501, "Nonfiction", SetPrice.price));
			library.add(new Book("The Paris Vendetta","Steve Berry", 419, "Adventure", SetPrice.price));
			library.add(new Book("The Naturals","Jennifer Lynn Barnes", 311, "Mystery", SetPrice.price));
			library.add(new Book("The Other Boleyn Girl","Philippa Gregory", 664, "Historical fiction", SetPrice.price));
			library.add(new Book("Frost Like Night","Sara Raasch", 490, "Fantasy", SetPrice.price));
			library.add(new Book("Brisingr","Christopher Paolini", 764, "Fantasy", SetPrice.price));
			SetPrice.makePrice();
		}
		private static void takeOutBookOrAddBook()
			{
			reviewBooks();
				System.out.println("Would you like to 1) take out a book or 2) add a book");
				bookTakeOutOrAdd= intInput.nextInt();
				if (bookTakeOutOrAdd==1)
					{
					
						takeOutBook();
					}
				else if(bookTakeOutOrAdd==2)
					{
						addBooks();
						
					}
				else
					{
						takeOutBookOrAddBook();
					}
			}
//		
		private static void wantToContinue()
			{
				System.out.println("Would you like to continue 1) Yes or 2) No? You have $" + moneyWantToSpend + "0 left to spend.");
				int continueWork = intInput.nextInt();
				if (continueWork == 1)
					{
						takeOutBookOrAddBook();
					
					}
				 else if(continueWork == 2)
					{
						System.out.println("Goodbye");
						shopping = false;
					}
				 else
					 {
						 System.out.println("Pick one of the two.");
						 wantToContinue();
					 }
				
			}
		private static void reviewBooks() 
		{
			bookNumber = 1;
			System.out.println("Here is the list of books:");
			for (int i = 0; i < library.size(); i++)
			{
				
				System.out.println(bookNumber + ") "+library.get(i).getTitle() + " by " + library.get(i).getAuthor() + " for $"+library.get(i).getPrice()+"0.");
				bookNumber++;
				
			}
			
		}
		private static void takeOutBook()
			{
				System.out.println("What book would you like to take out?");
				int bookTaken= intInput.nextInt();
				moneyWantToSpend =moneyWantToSpend -library.get(bookTaken-1).getPrice();
				library.remove(bookTaken -1);
				
				wantToContinue(); 
			}
		private static void addBooks()
			{
				System.out.println("How many books do you want put in the library?");
				int addBook = intInput.nextInt();
				for(int i = 0; i < addBook; i++)
					{
						System.out.println("List the title: ");
						String newTitle = stringInput.nextLine();
						System.out.println("List the author: ");
						String newAuthor = stringInput.nextLine();
						System.out.println("List the number of pages: ");
						int addNumberOfPages = intInput.nextInt();
						System.out.println("List the category: ");
						String newCategory = stringInput.nextLine();
						SetPrice.makePrice();
						library.add(new Book(newTitle, newAuthor, addNumberOfPages,newCategory,SetPrice.price));
					}
				
				wantToContinue(); 
			}
		
//test
		

	}
