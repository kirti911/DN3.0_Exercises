package Lms;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    public static Book binarySearchByTitle(List<Book> books, String title) {
        // Ensure the list is sorted by title
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            Book midBook = books.get(middle);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return null; // Return null if no book is found
    }
}


