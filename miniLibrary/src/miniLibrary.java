
import java.util.Scanner;
import java.util.ArrayList;

public class miniLibrary
	{
		static	ArrayList<Library> books = new ArrayList <Library>();
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
				
//				System.out.println("Just to review the books avaliable.");
//				reviewBooks();
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
			books.add(new Library("Rival Rails","Walter R. Borneman", 406, "nonfiction"));
			books.add(new Library("Taylors Guide to Shade Gardening","Houghton Mifflin Company", 501, "nonfiction"));
			books.add(new Library("The Paris Vendetta","Steve Berry", 419, "adventure"));
			books.add(new Library("The Naturals","Jennifer Lynn Barnes", 311, "mystery"));
			books.add(new Library("The Other Boleyn Girl","Philippa Gregory", 664, "historical fiction"));
			books.add(new Library("Frost Like Night","Sara Raasch", 490, "fantasy"));
			books.add(new Library("Brisingr","Christopher Paolini", 764, "fantasy"));
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
				else
					{
						addBooks();
						
					}
			}
//		private static void stayAtLibrary()
//		{
//			System.out.println("Do you want to stay at the library?");
//			String continueShopping = stringInput.nextLine();
//			if(continueShopping == "yes" || continueShopping =="Yes")
//			{
//				System.out.println("Continue on");
//			}
//			else 
//			{
//				System.out.println("GoodBye!");
//				
//			}
//		}
		private static void wantToContinue()
			{
				System.out.println("Would you like to continue 1) Yes or 2) No?");
				int continueWork = intInput.nextInt();
				if (continueWork == 1)
					{
						takeOutBookOrAddBook();
					}
				else 
					{
						System.out.println("GoodBye");
						shopping = false;
					}
				
			}
		private static void reviewBooks() 
		{
			bookNumber = 1;
			System.out.println("Here is a list of books:");
			for (int i = 0; i < books.size(); i++)
			{
				
				System.out.println(bookNumber + ") "+books.get(i).getTitle() + " by " + books.get(i).getAuthor() + ".");
				bookNumber++;
				
			}
			
		}
		private static void takeOutBook()
			{
				System.out.println("What book would you like to take out?");
				int bookTaken= intInput.nextInt();
				books.remove(bookTaken -1);
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
						books.add(new Library(newTitle, newAuthor, addNumberOfPages,newCategory));
					}
				
				wantToContinue(); 
			}

		

	}
