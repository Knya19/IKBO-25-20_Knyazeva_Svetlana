package pr1.Book;

public class Book
{
    private String author;
    private int cost;
    private String name;

    public Book(String author, int cost, String name)
    {
        this.author = author;
        this.cost = cost;
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Книга {" +
                "автор ='" + author + '\'' +
                ", цена ='" + cost + '\'' +
                ", название ='" + name + '\'' +
                '}';
    }
}
