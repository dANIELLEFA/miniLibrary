
public class Library
	{
		String title;
		String author;
		int numberOfPages;
		String category;
		public Library(String t, String a, int nOP, String c)
		{
			title = t;
			author = a;
			numberOfPages = nOP;
			category = c;
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

	}
