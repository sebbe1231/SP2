public class PrintedBook extends Title {
    private int pages;
    private int copies;

    public PrintedBook(String title, String literatureType, int pages, int copies) {
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    public double calculatePoints()  {
        return pages * convertLiteratureType() * copies;
    }

    public void printBook() {
        System.out.println(getTitle());
        System.out.println("Type: Audio Book");
        System.out.println("Literature Type: " + getLiteratureType());
        System.out.println("Pages: " + pages);
        System.out.println("Copies: " + copies);
        System.out.println("Points: " + calculatePoints());
        System.out.println("Royalties: " + calculateRoyalty());
    }
}
