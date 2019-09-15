
public class Movies {
	String title;
	String director;
	int minutes;
	String category;
	double price;
	public Movies(String t, String a, int m, String c, double p)
	{
		title = t;
		director = a;
		minutes = m;
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
public String getDirector()
	{
		return director;
	}
public void setDirector(String director)
	{
		this.director = director;
	}
public int getMinutes()
{
	return minutes;
}
public void setMinutes(int minutes)
{
	this.minutes = minutes;
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

public void setPrice(double price)
{
	this.price = price;
}

}
