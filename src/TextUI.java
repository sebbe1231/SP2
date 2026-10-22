import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    Scanner scan = new Scanner(System.in);

    public String promptText(String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }

    public int promptInt(String msg) {
        while(true) {
            System.out.println(msg);
            int input = 0;
            try {
                input = Integer.parseInt(scan.nextLine());
                return input;
            } catch(Exception e) {
                System.out.println("Invalid Input");
            }
        }
    }

    public double promptDouble(String msg) {
        while(true) {
            System.out.println(msg);
            try {
                return Double.parseDouble(scan.nextLine());
            } catch(Exception e) {
                System.out.println("Invalid Input");
            }
        }
    }

    public int promptChoice(ArrayList<String> options, String msg) {
        while(true) {
            System.out.println(msg);
            for(int i = 0; i < options.size(); i++) {
                System.out.println(i+1 + ") " + options.get(i));
            }
            try {
                String input = scan.nextLine();
                if(Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= options.size()) {
                    return Integer.parseInt(input) - 1;
                }
                else {
                    System.out.println("Not a valid choice");
                }
            }
            catch (Exception e) {
                System.out.println("Not a valid choice");
            }
        }
    }
}
