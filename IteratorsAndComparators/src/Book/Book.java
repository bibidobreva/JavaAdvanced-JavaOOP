package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

    private String title;
    private int year;
    private List<String> authors;


    public Book(String title, int year, String...author){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(author);
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(String...authors) {
        if(authors.length==0){
            this.authors = new ArrayList<>();
        }else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        int titleCompare = this.title.compareTo(o.title);

        if (titleCompare != 0) {
            return titleCompare;
        }

        return this.year - o.year;

    }

    @Override
    public String toString() {
        return  "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }
}
