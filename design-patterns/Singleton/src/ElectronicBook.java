public class ElectronicBook
{
    private static ElectronicBook instance = null;
    private String bookName;
    private int page;

    private ElectronicBook()
    {
        System.out.println("ElectronicBook was turned on!");
    }

    public static synchronized ElectronicBook getInstance()
    {
        if(instance == null)
        {
            instance = new ElectronicBook();
        }
        return instance;
    }

    public void openBook(String bookName, int page)
    {
        this.bookName = bookName;
        this.page = page;
        System.out.println("Opened book: " + bookName + " on page " + page);
    }

    public void turnPageForward()
    {
        this.page++;
        System.out.println("Turned book on page " + page);
    }

    public void turnPageBackward()
    {
        this.page--;
        System.out.println("Turned book on page " + page);
    }
}
