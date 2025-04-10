/* Write a java program with class named Book
a) a class should contain various attributes such as title, author, year of publication.
b) it should also contain a constructor with parameters which initializes title, author, year of publication.
c) create a method which displays the details of the book title, author, year of publication
Display the details of two books.
 */

public class book {
    //attributes
    String title;
    String author;
    int year;
    //constructor 
    book(String title, String author, int year) {
        this.title = title;
        this.author=author;
        this.year=year;
    }
    //created a method to display
    void displaydetails(){
        System.out.println("Title: "+title);
        System.out.println("author: "+author);
        System.out.println("year of publishing : "+year);
    }  
    public static void main(String[] args) {
        book b1 = new book("IT ENDS WITH US", "Colleen Hoover", 2016);
        book b2 = new book("IT STARTS WITH US" ,"Colleen Hoover", 2022);
        System.out.println("G. POOJA PRIYANKA ,24107,CSE-B");
        //displaying the details of the book-1
        System.out.println("display the details of book-1");
        b1.displaydetails();
        //displaying the details of the book-2
        System.out.println("display the details of book-2");
        b2.displaydetails();
    }  
}
