package personClass;

import java.time.LocalDateTime;

public class Person {
    int uniqueID;
    LocalDateTime contactDate;
    String name;

    public Person(String name, int id, LocalDateTime contactDate) {
        this.uniqueID = id;
        this.contactDate = LocalDateTime.now();
        this.name = name;
    }

    public String toString() {
        return String.format("%s\nid:: %s\nContact Date: %s", name, uniqueID, contactDate);
    }

    public int getID() {
        return this.uniqueID;
    }

    public LocalDateTime getContactDate() {
        return this.contactDate;
    }

}