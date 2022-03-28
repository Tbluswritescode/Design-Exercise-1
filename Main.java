
import personClass.QuarantineList;
import personClass.Person;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        QuarantineList lst = new QuarantineList();
        LocalDateTime d = LocalDateTime.now();

        Person p = new Person("John Doe", 101, d);
        Person p1 = new Person("Jane Doe", 1131, d);
        Person p2 = new Person("John Dough", 101, d);
        Person p3 = new Person("Huston Payne", 2351, d);
        Person[] pa = { p, p1, p2, p3 };

        for (Person pi : pa) {
            boolean success = lst.addToList(pi);
            if (!success) {
                System.out.printf("Unable to add user:\n%s\nto the database\n", pi.toString());
            }
        }

        System.out.println("\nCurrent Record:\n" + lst.toString());

    }

    /*
     * OUTDATED CODE MEANT FOR COMMAND LINE INTERACTION
     * 
     * public static void mainAlt(String[] args) {
     * QuarantineList lst = new QuarantineList();
     * String it = "";
     * Scanner scan = new Scanner(System.in);
     * scan.useDelimiter(System.lineSeparator());
     * 
     * while (true) {
     * 
     * System.out.println(
     * "Enter 1 to Enter a user \nEnter 2 to see how many people should be in
     * quarantine\nEnter 3 to list all quarantine subjects\nEnter 4 to exit");
     * it = scan.next();
     * 
     * if (it.contains("1")) {
     * lst.inputUser(scan);
     * } else if (it.contains("2")) {
     * System.out.println("\n" + lst.getQCount() + " people should be in
     * quarantine");
     * } else if (it.contains("3")) {
     * System.out.println("\nListing of all persons in quarantine: \n" +
     * lst.toString());
     * } else if (it.contains("4")) {
     * scan.close();
     * break;
     * } else {
     * System.out.println("Error, did not recognize input, please try again");
     * }
     * scan = new Scanner(System.in);
     * scan.useDelimiter(System.lineSeparator());
     * 
     * }
     * 
     * }
     */

}
