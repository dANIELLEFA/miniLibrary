
import java.util.Scanner;
import java.util.ArrayList;

public class miniLibrary
	{
		static	ArrayList<Book> library = new ArrayList <Book>();
		static Scanner stringInput = new Scanner (System.in);
		static Scanner intInput = new Scanner (System.in);
		static int bookTakeOutOrAdd; 
		static boolean shopping;
		static int bookNumber;
		public static void main(String[] args)
			{
			startOffLibrary();
			welcomePatrons();
			reviewBooks();
			wantToContinue();
			while (shopping){
				
				System.out.println("Just to review the books avaliable.");
				reviewBooks();
				takeOutBookOrAddBook();
				// stayAtLibrary();
			}

			}
		private static void welcomePatrons()
		{
			System.out.println("Hello Patron! " );
			
		}
		private static void startOffLibrary()
		{
			library.add(new Book("Rival Rails","Walter R. Borneman", 406, "nonfiction"));
			library.add(new Book("Taylors Guide to Shade Gardening","Houghton Mifflin Company", 501, "nonfiction"));
			library.add(new Book("The Paris Vendetta","Steve Berry", 419, "adventure"));
			library.add(new Book("The Naturals","Jennifer Lynn Barnes", 311, "mystery"));
			library.add(new Book("The Other Boleyn Girl","Philippa Gregory", 664, "historical fiction"));
			library.add(new Book("Frost Like Night","Sara Raasch", 490, "fantasy"));
			library.add(new Book("Brisingr","Christopher Paolini", 764, "fantasy"));
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
				System.out.println("Would you like to continue 1) Yes or 2) No?");
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
				
				System.out.println(bookNumber + ") "+library.get(i).getTitle() + " by " + library.get(i).getAuthor() + ".");
				bookNumber++;
				
			}
			
		}
		private static void takeOutBook()
			{
				System.out.println("What book would you like to take out?");
				int bookTaken= intInput.nextInt();
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
						library.add(new Book(newTitle, newAuthor, addNumberOfPages,newCategory));
					}
				
				wantToContinue(); 
			}
//test
		

	}
