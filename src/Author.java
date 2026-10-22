import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public double calculateRoyalties() {
        double royalties = 0;
        for (Title title : titles) {
            royalties += title.calculateRoyalty();
        }

        return royalties;
    }

    public String getName() {
        return name;
    }

    public void printAuthor() {
        System.out.println(name);
        System.out.println("Royalties: " + calculateRoyalties());
        System.out.println("---- Titles ----");
        for(int i = 0; i < titles.size(); i++) {
            System.out.println(i + 1 + ":");
            titles.get(i).printBook();
        }
    }
}
