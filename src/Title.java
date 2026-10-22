import java.util.HashMap;

abstract public class Title {
    private String title;
    private String literatureType;
    static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    abstract double calculatePoints();

    abstract void printBook();

    public double convertLiteratureType() {
        return switch (literatureType) {
            case "BI", "TE" -> 3.0;
            case "LYRIK" -> 6.0;
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            default -> 0;
        };
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }
}
