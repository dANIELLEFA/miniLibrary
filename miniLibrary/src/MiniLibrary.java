
import java.util.Scanner;
import java.util.ArrayList;

public class MiniLibrary
	{
		static	ArrayList<Book> library = new ArrayList <Book>();
		static ArrayList <Movies> movieSection = new ArrayList <Movies>();
		static Scanner stringInput = new Scanner (System.in);
		static Scanner intInput = new Scanner (System.in);
		static Scanner doubleInput = new Scanner (System.in);
		static int bookOrMovie;
		static int bookTakeOutOrAdd; 
		static boolean shopping;
		static int bookNumber;
		static int movieNumber;
		static double moneyWantToSpend;
		static String newCategory;
		
		public static void main(String[] args)
			{
				
				
				
			welcomePatrons();
			
			
			
			while (shopping){
				
				if(bookOrMovie == 1)
				{
					MovieSection.movieSection();
				}
				else if (bookOrMovie == 2)
				{
					Library.bookLibrary();
				}
				
				
			}

			}
		private static void welcomePatrons()
		{
			System.out.println("Hello Patron! How much money do you want to spend?" );
			moneyWantToSpend =doubleInput.nextDouble();
			if (moneyWantToSpend >= 250)
			{
				System.out.println("That is too much money. Go for a smaller amount.");
				welcomePatrons();
			}
			
			
		}
		private static void choose()
		{
			System.out.println("Do you want to go to the 1) movie section or to the 2) book section");
			bookOrMovie = intInput.nextInt();
			if (bookOrMovie == 1)
			{
				MovieSection.movieSection();
			}
			if (bookOrMovie == 2)
			{
				Library.bookLibrary();
			}
		}
	

		static void wantToContinue()
			{
				System.out.println("Would you like to continue 1) Yes or 2) No? You have $" + moneyWantToSpend + "0 left to spend.");
				int continueWork = intInput.nextInt();
				if(moneyWantToSpend <= 0)
				{
					System.out.println("Goodbye");
					shopping = false;
				}
				else if (continueWork == 1)
					{
						choose();
					
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
//		
		
		public static void getTypesOfCategory()
		{
			System.out.println("1.Adventure");
			System.out.println("2.Biography/Autobiography");
			System.out.println("3.Choice");
			System.out.println("4.Classic");
			System.out.println("5.Comedy");
			System.out.println("6.Drama");
			System.out.println("7.Fantasy");
			System.out.println("8.Historical Fiction");
			System.out.println("9.Horror");
			System.out.println("10.Children ");
			System.out.println("11.Mythology");
			System.out.println("12.Nonfiction");
			System.out.println("13.Play");
			System.out.println("14.Poems");
			System.out.println("15.Religious");
			System.out.println("16.Romance");
			
			choiceOfCategory();
			
		}
		public static void choiceOfCategory()
		{
			System.out.println("Choose which category you book goes under.");
			int numberOfCategory = intInput.nextInt();
			if (numberOfCategory == 1)
			{
				newCategory ="Adventure";
			}
			else if (numberOfCategory == 2)
			{
				newCategory ="Biography/Autobiography";
			}
			else if (numberOfCategory == 3)
			{
				newCategory ="Choice";
			}
			else if (numberOfCategory == 4)
			{
				newCategory ="Classic";
			}
			else if (numberOfCategory == 5)
			{
				newCategory ="Comedy";
			}
			else if (numberOfCategory == 6)
			{
				newCategory ="Drama";
			}
			else if (numberOfCategory == 7)
			{
				newCategory ="Fantasy";
			}
			else if (numberOfCategory == 8)
			{
				newCategory ="Historical Fiction";
			}
			else if (numberOfCategory == 9)
			{
				newCategory ="Horror";
			}
			else if (numberOfCategory == 10)
			{
				newCategory ="Kids Book";
			}
			else if (numberOfCategory == 11)
			{
				newCategory ="Mythology";
			}
			else if (numberOfCategory == 12)
			{
				newCategory ="Nonfiction";
			}
			else if (numberOfCategory == 13)
			{
				newCategory ="Play";
			}
			else if (numberOfCategory == 14)
			{
				newCategory ="Poems";
			}
			else if (numberOfCategory == 15)
			{
				newCategory ="Religious";
			}
			else if (numberOfCategory == 16)
			{
				newCategory ="Romance";
			}
			else
			{
				System.out.println("Choose one.");
				getTypesOfCategory();
				
			}
		}
		

	}
