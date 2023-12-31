package Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    public int compare(Book o1, Book o2) {
        int titleCompare = o1.getTitle().compareTo(o2.getTitle());

        if (titleCompare != 0) {
            return titleCompare;
        }

        return o1.getYear() - o2.getYear();
    }
}
