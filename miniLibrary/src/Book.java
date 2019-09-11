
public class Book
	{
		String title;
		String author;
		int numberOfPages;
		String category;
		double price;
		public Book(String t, String a, int nOP, String c, double p)
		{
			title = t;
			author = a;
			numberOfPages = nOP;
			category = c;
			price = p;
		}
		public String getTitle()
			{
				return title;
			}
		public void setTitle(String title)
			{
				this.title = title;
			}
		public String getAuthor()
			{
				return author;
			}
		public void setAuthor(String author)
			{
				this.author = author;
			}
		public int getNumberOfPages()
			{
				return numberOfPages;
			}
		public void setNumberOfPages(int numberOfPages)
			{
				this.numberOfPages = numberOfPages;
			}
		public String getCategory()
			{
				return category;
			}
		public void setCategory(String Category)
			{
				this.category = category;
			}
		public double getPrice()
			{
				return price;
			}
		
		public void setprice(double price)
			{
				this.price = price;
			}

	}
