
import personClass.QuarantineList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuarantineList lst = new QuarantineList();
        String it = "";
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(System.lineSeparator());

        while (true) {

            System.out.println(
                    "Enter 1 to Enter a user \nEnter 2 to see how many people should be in quarantine\nEnter 3 to list all quarantine subjects\nEnter 4 to exit");
            it = scan.next();

            if (it.contains("1")) {
                lst.inputUser(scan);
            } else if (it.contains("2")) {
                System.out.println("\n" + lst.getQCount() + " people should be in quarantine");
            } else if (it.contains("3")) {
                System.out.println("\nListing of all persons in quarantine: \n" + lst.toString());
            } else if (it.contains("4")) {
                scan.close();
                break;
            } else {
                System.out.println("Error, did not recognize input, please try again");
            }
            scan = new Scanner(System.in);
            scan.useDelimiter(System.lineSeparator());

        }

    }

}
