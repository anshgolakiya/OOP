
class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String message){
        super(message);
    }
}
class Library {
    int availableBooks ;
    Library(int availableBooks){
        this.availableBooks = availableBooks;
    }
    void issueBook(int count) throws BookNotAvailableException {
        if(count <= availableBooks) {
            availableBooks -= count ;
            System.out.println("Book issued successfully.");
            System.out.println("Book remaining : " + availableBooks);
        }
        else{
            throw new BookNotAvailableException("Requested Books not available");
        }
    }
}
public class pr3 {
    public static void main(String[] args) {
        Library lib = new Library(3);
        try {
            lib.issueBook(2);
            lib.issueBook(2);
        }
        catch(BookNotAvailableException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
