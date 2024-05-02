public class Journal implements Library{
    private String title;

    public Journal(String title){
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
