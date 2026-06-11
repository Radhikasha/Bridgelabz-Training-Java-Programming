package SingleInheritance;

class Book {
    String Title;
    int publicationYear;

    Book(String Title, int publicationYear) {
        this.Title = Title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String Name;
    String Bio;

    public Author(String Title, int publicationYear, String Name, String Bio) {
        super(Title, publicationYear);
        this.Name = Name;
        this.Bio = Bio;
    }

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Bio: " + Bio);
        System.out.println("Title: " + Title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Main6 {
    public static void main(String[] args) {
        Author a = new Author("kuch bhi", 2020, "Radhika", "kuch nhi");
        a.display();
    }
}