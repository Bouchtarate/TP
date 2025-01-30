import java.util.ArrayList;

public class Library {
    public ArrayList<String> books;
    public Library(){
        this.books=new ArrayList<>();
    }
    public void addBook(String book){
        books.add(book);
        System.out.println("You add a new book <"+book+"> to your library");
    }
    public void removeBook(String book){
        if(books.contains(book)){
            books.remove(book);
            System.out.println("You removed <"+book+"> from your library");
        }else{
            System.out.println("Book not found");
        }
    }
}
