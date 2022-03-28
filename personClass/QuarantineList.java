package personClass;

import java.util.Scanner;
import java.util.*;

public class QuarantineList {

    private ArrayList<Person> qList = new ArrayList<Person>();
    private int currentID;

    public int getQCount() {
        return qList.size();
    }

    private boolean isInList(Person p) {
        for (int i = 0; i < qList.size(); i++) {
            if (p.getID().replaceAll("\\s+", "") == qList.get(i).getID().replaceAll("\\s+", "")) {
                return true;
            }
        }
        return false;
    }

    public boolean addToList(Person P) {
        if (!isInList(P)) {
            qList.add(P);
            return true;
        }
        return false;
    }

    public void inputUser(Scanner scan) {
        System.out.println("\nEnter the user's name: \n");
        String name = scan.next();
        System.out.println("\nEnter the user's unique ID: \n");
        String ID = scan.next();
        Person newPerson = new Person(name, ID);

        if (this.addToList(newPerson)) {
            System.out.println("\nsuccessfully added to list!");
        } else {
            System.out.println("\nunable to place person in list, ID may not be unique.");
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < qList.size(); i++) {
            str = str + qList.get(i).toString() + "\n\n";
        }
        return str;
    }
}
