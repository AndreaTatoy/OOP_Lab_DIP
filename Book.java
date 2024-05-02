public class Book implements Library{
    private String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public void borrow(){
    }

    @Override
    public String toString(){
        return title;
    }
}
