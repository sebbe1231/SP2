public class AudioBook extends Title {
    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int durationInMinutes, int copies) {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }

    public double calculatePoints()  {
        return (durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }

    public void printBook() {
        System.out.println(getTitle());
        System.out.println("Type: Audio Book");
        System.out.println("Literature Type: " + getLiteratureType());
        System.out.println("Duration: " + durationInMinutes + " minutes");
        System.out.println("Copies: " + copies);
        System.out.println("Points: " + calculatePoints());
        System.out.println("Royalties: " + calculateRoyalty());
    }
}
