package INHERITENCE;

public
    class Book {
        protected String title;
        protected int publicationYear;

        public Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }

        public void displayInfo() {
            System.out.println("Title: " + title + ", Published: " + publicationYear);
        }
    }

    // Author subclass extends Book
    class Author extends Book {
        private String authorName;
        private String bio;

        public Author(String title, int publicationYear, String authorName, String bio) {
            super(title, publicationYear);
            this.authorName = authorName;
            this.bio = bio;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Author: " + authorName);
            System.out.println("Bio: " + bio);
            System.out.println("---");
        }

        // Getter methods
        public String getAuthorName() {
            return authorName;
        }

        public String getBio() {
            return bio;
        }
    }

    // Test the hierarchy
    public class LibraryManagement {
        public static void main(String[] args) {
            // Create Author objects (which are also Books)
            Author[] books = {
                    new Author("To Kill a Mockingbird", 1960,
                            "Harper Lee",
                            "American novelist known for her novel To Kill a Mockingbird."),
                    new Author("1984", 1949,
                            "George Orwell",
                            "English writer and essayist known for his dystopian novels.")
            };

            System.out.println("Library Management System");
            System.out.println("=========================");

            for (Author book : books) {
                book.displayInfo();
            }
        }
    }

}
