
import java.util.Scanner;
import java.util.ArrayList;

public class miniLibrary
	{
		static	ArrayList<Library> books = new ArrayList <Library>();
		static Scanner stringInput = new Scanner (System.in);
		static Scanner intInput = new Scanner (System.in);
		static int bookTakeOutOrAdd; 
		public static void main(String[] args)
			{
				

			}
		private static void welcomePatrons()
		{
			System.out.println("Hello Patron! Would you like to 1) take out a book or 2) add a book" );
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
		
		private static void takeOutBook()
			{
				// TODO Auto-generated method stub
				
			}
		private static void addBooks()
			{
				System.out.println("How many books do you want buy?");
				int addBook = intInput.nextInt();
				for(int i = 0; i <= addBook; i++)
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
				
			}

		

	}
