import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public void main() {
        System.out.println("Welcome to Da Library");
        TextUI textUI = new TextUI();
        ArrayList<Author> authors = new ArrayList<>();

        // Adding authors and books for testing
        Author author1 = new Author("Eiichiro Oda");
        author1.addTitle(new PrintedBook("One Piece vol: 1", "TE", 216, 400));
        authors.add(author1);

        Author author2 = new Author("Da Writer");
        author2.addTitle(new PrintedBook("Books of many things", "FAG", 150, 250));
        author2.addTitle(new AudioBook("A Christmas Story", "BI", 85, 130));
        authors.add(author2);



        while(true) {
            ArrayList<String> choices = new ArrayList<>(Arrays.asList(
                    "See all authors", "Add author", "Add book", "Exit"));
            switch (textUI.promptChoice(choices, "What would you like to do?")) {
                case 0:
                    for(Author author : authors) {
                        author.printAuthor();
                    }
                    break;
                case 1:
                    String name = textUI.promptText("What is the authors name?");
                    authors.add(new Author(name));
                    break;
                case 2:
                    if(!authors.isEmpty()) {
                        ArrayList<String> authorNames = new ArrayList<>();
                        for(Author author : authors) {
                            authorNames.add(author.getName());
                        }

                        Author author = authors.get(textUI.promptChoice(authorNames, "What author does the book belong to?"));
                        String title = textUI.promptText("What is the title of the book?");

                        ArrayList<String> litTypes = new ArrayList<>(Arrays.asList("BI", "TE", "LYRIK", "SKØN", "FAG"));
                        String litType = litTypes.get(textUI.promptChoice(litTypes, "Whats the literature type?"));
                        int copies = textUI.promptInt("How many copies?");

                        if(textUI.promptChoice(new ArrayList<String>(Arrays.asList("Printed", "Audio")), "Whats the book type?") == 0) {
                            int page = textUI.promptInt("How many pages?");
                            author.addTitle(new PrintedBook(title, litType, page, copies));
                        }
                        else {
                            int duration = textUI.promptInt("How long is it? in minutes");
                            author.addTitle(new AudioBook(title, litType, duration, copies));
                        }


                    }
                    else {
                        System.out.println("Add author first");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}