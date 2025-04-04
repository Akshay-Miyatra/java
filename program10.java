
package java_assignment2;


class Author {
    private final String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void displayPublication() {
        System.out.println("Publication by author: " + authorName);
    }
}


class BookPublication extends Author {
    private final String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

   
    @Override
    public void displayPublication() {
        System.out.println("Book Publication: " + title + " by " + getAuthorName());
    }
}
class PaperPublication extends Author {
    private final String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Paper Publication: " + title + " by " + getAuthorName());
    }
}
public class program10 {
    public static void main(String[] args) {
        Author author1 = new BookPublication("J.K. Rowling", "Harry Potter");
        Author author2 = new PaperPublication("Albert Einstein", "Theory of Relativity");

        author1.displayPublication(); 
        author2.displayPublication(); 
    }
}
